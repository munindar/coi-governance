package ooi.coi.bspl.semantic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import ooi.coi.bspl.bSPL.BSPL;
import ooi.coi.bspl.bSPL.Message;
import ooi.coi.bspl.bSPL.ParamDecl;
import ooi.coi.bspl.bSPL.ParamRef;
import ooi.coi.bspl.bSPL.Parameter;
import ooi.coi.bspl.bSPL.Role;
import ooi.coi.bspl.bSPL.kAdornment;
import ooi.coi.bspl.util.NestedMap;
import ooi.coi.bspl.util.ProtocolUtils;
import ooi.coi.bspl.util.WorkflowComponentWithSlot;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

import com.ektimisi.precedence.solver.AbstractLiteral;
import ooi.coi.bspl.semantic.SolverFacade;
import com.ektimisi.precedence.util.MapSet;
import com.google.common.collect.Iterators;

public class Checker extends WorkflowComponentWithSlot {
  
  private String graphVizFile;
  private String uriPrefix;

  private static Logger logger = Logger.getLogger(Checker.class);
  static {
    logger.setLevel(Level.DEBUG); // ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF
    Logger.getLogger(com.ektimisi.precedence.util.Graph.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.GraphBuilder.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.util.MapSet.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.PrecedenceSolver.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Pairings.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Literal.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Sequence.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Literals.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Nexts.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Sequences.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Together.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Togethers.class).setLevel(Level.WARN);

    Logger.getLogger(ooi.coi.bspl.schema.pyke.BSPLtoMessageLogSchemaPyKE.class).setLevel(Level.WARN);
  }

  private SolverFacade theSolver;
  private final NestedMap<Role, Parameter, Message> rolesToParamsToRefs = new NestedMap<Role, Parameter, Message>();
  private final NestedMap<Parameter, Role, Message> paramsToRolesToRefs = new NestedMap<Parameter, Role, Message>();
  private final MapSet<Parameter, Message> outParamsToRolesToRefs = new MapSet<Parameter, Message>();

  @Override
  public void invoke(IWorkflowContext ctx) {
    final Resource resource = (Resource) ctx.get(this.getSlot());

    final Iterator<Object> contents = EcoreUtil.getAllContents(resource, true);
    final Iterator<BSPL> iter = Iterators.filter(contents, BSPL.class);
    final BSPL theProtocol = Iterators.getOnlyElement(iter);
    Checker.logger.info("############################");
    Checker.logger.info("#### Checking protocol " + theProtocol.getName());

    theSolver = new SolverFacade();
    
    this.generateCausalStructure(theSolver, theProtocol);
    theSolver.numberOfClauses("generateCausalStructure");

    boolean result = true;
    result &= this.checkEnactability(theSolver, theProtocol);
    result &= this.checkIntegrity(theSolver, theProtocol);
    result &= this.checkAtomicity(theSolver, theProtocol);

    if (result)
      Checker.logger.info("Protocol " + theProtocol.getName() + " passes all checks");

    ctx.put(this.getSlot(), resource);
  }

  private boolean checkEnactability(SolverFacade aSolver, BSPL theProtocol) {
    this.generateCompletionClauses(aSolver, theProtocol);
    aSolver.numberOfClauses("completion in enactability");

    aSolver.loadSolver();
    boolean result = aSolver.solve(theProtocol, uriPrefix, graphVizFile);
    if (result) {
      Checker.logger.info("Protocol " + theProtocol.getName() + " is enactable");
    } else {
      Checker.logger.info("Protocol " + theProtocol.getName() + " is not enactable");
    }
    return result;
  }

  /* TODO This repeats the completion clauses used in checkEnactability */
  private boolean checkIntegrity(SolverFacade aSolver, BSPL theProtocol) {
    this.generateCompletionClauses(aSolver, theProtocol);
    aSolver.numberOfClauses("completion in integrity");

    final boolean clausesAdded = this.generateIntegrityClauses(aSolver, theProtocol);
    aSolver.loadSolver();

    boolean result = false;

    if (clausesAdded) {
      result = aSolver.solve(theProtocol, uriPrefix, graphVizFile);
    }

    if (result) {
      Checker.logger.info("Protocol " + theProtocol.getName() + " violates integrity on some enactments");
    } else {
      Checker.logger.info("Protocol " + theProtocol.getName() + " ensures integrity");
    }
    return !result;
  }

  private boolean checkAtomicity(SolverFacade aSolver, BSPL theProtocol) {
    this.generateMaximalityClauses(aSolver, theProtocol);
    aSolver.numberOfClauses("maximality in atomicity");
    this.generateNonCompletionClause(aSolver, theProtocol);
    aSolver.numberOfClauses("noncompletion in atomicity");

    aSolver.loadSolver();
    boolean result = aSolver.solve(theProtocol, uriPrefix, graphVizFile);

    if (result) {
      Checker.logger.info("Protocol " + theProtocol.getName() + " violates atomicity on some enactments");
    } else {
      Checker.logger.info("Protocol " + theProtocol.getName() + " ensures atomicity");
    }
    return !result;
  }

  private void generateCausalStructure(SolverFacade aSolver, BSPL theProtocol) {
    for (final EObject aRef : theProtocol.getReferences()) {
      /*
       * TODO Should generate different literals for each copy of an overloaded
       * message schema. For example, if the protocol has two rfq messages with
       * different schemas, we need two rfq literals, e.g., rfq0 and rfq1, for
       * the sender and likewise two for the receiver.
       */
      final Message aMessage = (Message) aRef;
      this.generateMessageClauses(aSolver, aMessage);

      for (final EObject anotherRef : theProtocol.getReferences()) {
        final Message anotherMessage = (Message) anotherRef;
        if (aMessage != anotherMessage)
          this.generateMessageMessageClauses(aSolver, aMessage, anotherMessage);
      }
    }
    this.generateParameterClauses(aSolver);
    this.generateParameterNonoccurrenceClauses(aSolver);
  }

  private void generateParameterNonoccurrenceClauses(SolverFacade aSolver) {
    for (final Parameter one : paramsToRolesToRefs.keySet()) {
      for (Role oneR : paramsToRolesToRefs.get(one).keySet()) {
        final AbstractLiteral firstPosS = aSolver.makeLiteral(oneR, one, false);
        final AbstractLiteral firstNegS = aSolver.makeLiteral(oneR, one, true);
        
        for (final Parameter two : paramsToRolesToRefs.keySet()) {
          for (Role twoR : paramsToRolesToRefs.get(two).keySet()) {
          final AbstractLiteral secondPosS = aSolver.makeLiteral(twoR, two, false);
          final AbstractLiteral secondNegS = aSolver.makeLiteral(twoR, two, true);

          this.addNonoccurrenceClauses(aSolver, firstPosS, secondPosS, firstNegS, secondNegS);
          }
        }
      }
    }
  }

  private void generateParameterClauses(SolverFacade aSolver) {
    for (final Role r : rolesToParamsToRefs.keySet()) {
      final MapSet<Parameter, Message> paramMap = rolesToParamsToRefs.get(r);
      for (final Parameter p : paramMap.keySet()) {
        final AbstractLiteral roleParameterPos = aSolver.makeLiteral(r, p, false);
        final AbstractLiteral roleParameterNeg = aSolver.makeLiteral(r, p, true);

        final List<AbstractLiteral> togethers = new ArrayList<AbstractLiteral>();
        togethers.add(roleParameterNeg);

        for (final Message m : paramMap.getValues(p)) {
          final AbstractLiteral roleMessagePos = aSolver.makeLiteral(r, m, false);
          final AbstractLiteral paramUponMessageRole = aSolver.makeTogetherLiteral(roleMessagePos, roleParameterPos);
          togethers.add(paramUponMessageRole);
        }

        aSolver.assertClause(togethers);
        Checker.logger.debug("Causality (parameter occurrence): " + ProtocolUtils.stringify(togethers));
      }
    }
  }

  private boolean isMessageOut(Message m, Parameter p) {
    for (final ParamRef pRef : m.getParams()) {
      if (p == pRef.getParam() && (pRef.getAdornment() == kAdornment.OUT))
        return true;
    }
    return false;
  }

  private boolean isPublicOut(BSPL theProtocol, Parameter p) {
    for (final ParamDecl pDecl : theProtocol.getPublicParams()) {
      if (p == pDecl.getParam() && (pDecl.getAdornment() == kAdornment.OUT))
        return true;
    }
    return false;
  }

  private void generateMessageMessageClauses(SolverFacade aSolver, Message first, Message second) {
    final Role firstSender = first.getSender();
    final Role secondSender = second.getSender();

    final AbstractLiteral firstPosS = aSolver.makeLiteral(firstSender, first, false);
    final AbstractLiteral secondPosS = aSolver.makeLiteral(secondSender, second, false);
    final AbstractLiteral firstNegS = aSolver.makeLiteral(firstSender, first, true);
    final AbstractLiteral secondNegS = aSolver.makeLiteral(secondSender, second, true);

    this.addNonoccurrenceClauses(aSolver, firstPosS, secondPosS, firstNegS, secondNegS);
    
    if (firstSender == secondSender) {

      if (firstPosS.compareTo(secondPosS) < 0) {
        this.addNotTogetherClause(aSolver, firstPosS, secondPosS);
        // AbstractLiteral firstPosR = makeLiteral(aSolver, first.getReceiver(), first, false);
        // AbstractLiteral secondPosR = makeLiteral(aSolver, second.getReceiver(), second, false);
        // addNotTogetherClause(aSolver, firstPosR, secondPosR);
      }
    }
  }

  private void addNonoccurrenceClauses(SolverFacade aSolver, AbstractLiteral firstPos, AbstractLiteral secondPos, AbstractLiteral firstNeg, AbstractLiteral secondNeg) {
/* TODO Commenting this method out just to count clauses generated*/
//    if (firstPos != secondPos) {
//      final AbstractLiteral togetherNonFirstNonSecond = aSolver.makeTogetherLiteral(firstNeg, secondNeg);
//      final AbstractLiteral[] togetherNon = { firstPos, secondPos, togetherNonFirstNonSecond };
//      aSolver.assertClause(togetherNon);
//      Checker.logger.debug("All nonoccurrences are together: (" + firstPos.getName() + " + " + secondPos.getName() + " + " + togetherNonFirstNonSecond.getName() + ")");
//      
//      final AbstractLiteral sequenceNonFirstSecond = aSolver.makeSequenceLiteral(firstNeg, secondPos);
//      final AbstractLiteral[] sequenceNon = { firstPos, secondNeg, sequenceNonFirstSecond };
//      aSolver.assertClause(sequenceNon);
//      Checker.logger.debug("Nonoccurrences precede occurrences: (" + firstPos.getName() + " + " + secondNeg.getName() + " + " + sequenceNonFirstSecond.getName() + ")"); 
//    }
  }

  private void addNotTogetherClause(SolverFacade aSolver, AbstractLiteral firstPos, AbstractLiteral secondPos) {
    final AbstractLiteral togetherFirstSecond = aSolver.makeTogetherLiteral(firstPos, secondPos);
    final AbstractLiteral[] notTogether = { aSolver.getNegatedLiteral(togetherFirstSecond) };
    aSolver.assertClause(notTogether);
    Checker.logger.debug("Messages _NOT_ together: (" + togetherFirstSecond.getName() + ")");
  }

  private boolean generateIntegrityClauses(SolverFacade aSolver, BSPL theProtocol) {
    final List<ArrayList<AbstractLiteral>> competingMessages = this.getCompetingMessages(aSolver, theProtocol);

    if (!competingMessages.isEmpty()) {
      final List<ArrayList<AbstractLiteral>> allPairwiseClauses = this.generateAllPairwise(aSolver, competingMessages);
      for (final ArrayList<AbstractLiteral> pairwiseClause : allPairwiseClauses) {
        aSolver.assertClause(pairwiseClause);
        Checker.logger.debug("Integrity clause: " + ProtocolUtils.stringify(pairwiseClause));
      }
      return true;
    } else
      return false;
  }

  private List<ArrayList<AbstractLiteral>> generateAllPairwise(SolverFacade aSolver, List<ArrayList<AbstractLiteral>> competingMessages) {
    List<ArrayList<AbstractLiteral>> allPairwiseClauses = this.makePairwiseClauses(aSolver, competingMessages.get(0));
    List<ArrayList<AbstractLiteral>> newPairwiseClauses;

    for (int i = 1; i < competingMessages.size(); i++) {
      final ArrayList<AbstractLiteral> messageLiterals = competingMessages.get(i);
      final List<ArrayList<AbstractLiteral>> pairwiseClauses = this.makePairwiseClauses(aSolver, messageLiterals);
      newPairwiseClauses = new ArrayList<ArrayList<AbstractLiteral>>();

      for (final ArrayList<AbstractLiteral> oldClause : allPairwiseClauses) {
        for (final ArrayList<AbstractLiteral> addedClause : pairwiseClauses) {
          final ArrayList<AbstractLiteral> newClause = new ArrayList<AbstractLiteral>();
          newClause.addAll(oldClause);
          newClause.addAll(addedClause);
          newPairwiseClauses.add(newClause);
        }
      }
      allPairwiseClauses = newPairwiseClauses;
    }
    Checker.logger.debug("Pairwise clauses: "+ ProtocolUtils.stringify(allPairwiseClauses));
    return allPairwiseClauses;
  }

  private List<ArrayList<AbstractLiteral>> getCompetingMessages(SolverFacade aSolver, BSPL theProtocol) {
    final List<ArrayList<AbstractLiteral>> competingMessages = new ArrayList<ArrayList<AbstractLiteral>>();
    for (final Parameter p : outParamsToRolesToRefs.keySet()) {
      final Collection<Message> messagesForParam = outParamsToRolesToRefs.getValues(p);
    
      if (messagesForParam.size() > 1) {
        final ArrayList<AbstractLiteral> messageLiterals = new ArrayList<AbstractLiteral>();
        for (final Message m : messagesForParam) {
          final AbstractLiteral messageLiteral = aSolver.makeLiteral(m.getSender(), m, false);
          messageLiterals.add(messageLiteral);
        }
        competingMessages.add(messageLiterals); // TODO Remove this
      }
    }
    Checker.logger.debug("Competing Messages: "+ ProtocolUtils.stringify(competingMessages));
    return competingMessages;
  }

  private List<ArrayList<AbstractLiteral>> makePairwiseClauses(SolverFacade aSolver, ArrayList<AbstractLiteral> messageLiterals) {
    final List<ArrayList<AbstractLiteral>> pairwiseClauses = new ArrayList<ArrayList<AbstractLiteral>>();
    for (final AbstractLiteral messageParam : messageLiterals) {
      final ArrayList<AbstractLiteral> conjunct = new ArrayList<AbstractLiteral>();
      for (final AbstractLiteral mLit : messageLiterals) {
        if (mLit != messageParam) {
          conjunct.add(mLit);
        }
      }
      pairwiseClauses.add(conjunct);
    }
    Checker.logger.debug("makePairwiseClauses: " + ProtocolUtils.stringify(pairwiseClauses));
    return pairwiseClauses;
  }

  private void generateCompletionClauses(SolverFacade aSolver, BSPL theProtocol) {
    for (final Parameter p : paramsToRolesToRefs.keySet()) {
      if (this.isPublicOut(theProtocol, p)) {
        final MapSet<Role, Message> roleMap = paramsToRolesToRefs.get(p);
        final List<AbstractLiteral> outParamLiterals = new ArrayList<AbstractLiteral>();
        for (final Role r : roleMap.keySet()) {

          for (final Message m : roleMap.getValues(r)) {
            if (this.isMessageOut(m, p) && (r == m.getReceiver())) {
              final AbstractLiteral roleParameterPos = aSolver.makeLiteral(r, p, false);
              outParamLiterals.add(roleParameterPos);
            }
          }
        }
        if (!outParamLiterals.isEmpty()) {
          aSolver.assertClause(outParamLiterals);
          Checker.logger.debug("Completion clause: " + ProtocolUtils.stringify(outParamLiterals));
        }
      }
    }
  }

  private void generateMaximalityClauses(SolverFacade aSolver, BSPL theProtocol) {
    for (final EObject aRef : theProtocol.getReferences()) {
      /*
       * TODO Should generate different literals for each copy of an overloaded
       * message schema. For example, if the protocol has two rfq messages with
       * different schemas, we need two rfq literals, e.g., rfq0 and rfq1, for
       * the sender and likewise two for the receiver.
       * Presently, I am addressing this by renaming such messages in the
       * protocol specifications by hand.
       */
      final Message aMessage = (Message) aRef;
      this.generateMessageMaximalityClauses(aSolver, aMessage);
    }
  }
  
  private void generateNonCompletionClause(SolverFacade aSolver, BSPL theProtocol) {
    final List<AbstractLiteral> protocolOutParamLiterals = new ArrayList<AbstractLiteral>();
    for (final Parameter p : paramsToRolesToRefs.keySet()) {
      if (this.isPublicOut(theProtocol, p)) {
        final MapSet<Role, Message> rolesToRefs = paramsToRolesToRefs.get(p);
         
          List<AbstractLiteral> paramInstancesIf = new ArrayList<AbstractLiteral>();
          List<AbstractLiteral> paramInstancesOnlyIf = new ArrayList<AbstractLiteral>();
          final AbstractLiteral paramLiteralPos = aSolver.makeLiteral(theProtocol.getName(), p, false);
          final AbstractLiteral paramLiteralNeg = aSolver.makeLiteral(theProtocol.getName(), p, true);
          paramInstancesIf.add(paramLiteralNeg);
          paramInstancesOnlyIf.add(paramLiteralPos);
          
          for (Role r : rolesToRefs.keySet()) {
            final AbstractLiteral messageLiteralPos = aSolver.makeLiteral(r, p, false);
            final AbstractLiteral messageLiteralNeg = aSolver.makeLiteral(r, p, true);
            paramInstancesIf.add(messageLiteralPos);
            paramInstancesOnlyIf.add(messageLiteralNeg);
          }     

          aSolver.assertClause(paramInstancesIf);
          aSolver.assertClause(paramInstancesOnlyIf);
          protocolOutParamLiterals.add(paramLiteralNeg);
      }
    }
    
    aSolver.assertClause(protocolOutParamLiterals);
    Checker.logger.debug("Noncompletion clause: " + ProtocolUtils.stringify(protocolOutParamLiterals));
  }

  private void generateMessageMaximalityClauses(SolverFacade aSolver, Message m) {
    final AbstractLiteral senderMessagePos = aSolver.makeLiteral(m.getSender(), m, false);
    final AbstractLiteral senderMessageNeg = aSolver.makeLiteral(m.getSender(), m, true);
    final AbstractLiteral receiverMessagePos = aSolver.makeLiteral(m.getReceiver(), m, false);

    this.messageDeliveryClause(aSolver, senderMessagePos, receiverMessagePos, senderMessageNeg);

    final List<AbstractLiteral> maximalityClause = new ArrayList<AbstractLiteral>();
    maximalityClause.add(senderMessagePos);

    final EList<Parameter> inParams = ProtocolUtils.selectParametersInRef(m, kAdornment.IN);
    for (final Parameter p : inParams) {
      final AbstractLiteral senderParameterNeg = aSolver.makeLiteral(m.getSender(), p, true);
      maximalityClause.add(senderParameterNeg);
    }

    final EList<Parameter> outParams = ProtocolUtils.selectParametersInRef(m, kAdornment.OUT);
    for (final Parameter p : outParams) {
      final AbstractLiteral senderParameterPos = aSolver.makeLiteral(m.getSender(), p, false);
      maximalityClause.add(senderParameterPos);
    }

    final EList<Parameter> nilParams = ProtocolUtils.selectParametersInRef(m, kAdornment.NIL);
    for (final Parameter p : nilParams) {
      /* TODO Need to think through the treatment of NIL parameters for maximality. */
      final AbstractLiteral senderParameterPos = aSolver.makeLiteral(m.getSender(), p, false);
      maximalityClause.add(senderParameterPos);
    }
    
    aSolver.assertClause(maximalityClause);
    Checker.logger.debug("Maximality clause: (" +ProtocolUtils.stringify(maximalityClause)+ ")");
  }
  
  private void messageDeliveryClause(SolverFacade aSolver, AbstractLiteral senderMessagePos, AbstractLiteral receiverMessagePos, AbstractLiteral senderMessageNeg) {
    final AbstractLiteral successfulTransmission = aSolver.makeSequenceLiteral(senderMessagePos, receiverMessagePos);
    aSolver.assertLiteralsAsClause(senderMessageNeg, successfulTransmission);
    Checker.logger.debug("Message delivery succeeds: (" +senderMessageNeg.getName()+ " + " +successfulTransmission.getName()+ ")");
  }

  /*
   * This method not only generates the clauses for each message, but also
   * builds the maps used by subsequent methods.
   */
  private void generateMessageClauses(SolverFacade aSolver, Message m) {
    final AbstractLiteral senderMessagePos = aSolver.makeLiteral(m.getSender(), m, false);
    final AbstractLiteral senderMessageNeg = aSolver.makeLiteral(m.getSender(), m, true);
    final AbstractLiteral receiverMessagePos = aSolver.makeLiteral(m.getReceiver(), m, false);
    final AbstractLiteral receiverMessageNeg = aSolver.makeLiteral(m.getReceiver(), m, true);

    this.causalitySenderToReceiver(aSolver, senderMessagePos, receiverMessagePos, receiverMessageNeg);

    final EList<Parameter> inParams = ProtocolUtils.selectParametersInRef(m, kAdornment.IN);
    for (final Parameter p : inParams) {
      this.storeRoleMap(m.getSender(), m, p);
      this.storeRoleMap(m.getReceiver(), m, p);
      this.senderInParam(aSolver, m, senderMessagePos, senderMessageNeg, p);
      this.receiverInOutParam(aSolver, m, receiverMessagePos, receiverMessageNeg, p);
    }

    final EList<Parameter> outParams = ProtocolUtils.selectParametersInRef(m, kAdornment.OUT);
    for (final Parameter p : outParams) {
      this.storeOutMap(m, p);
      this.storeRoleMap(m.getSender(), m, p);
      this.storeRoleMap(m.getReceiver(), m, p);
      this.storeParameterMap(m.getReceiver(), m, p);
      this.senderOutParam(aSolver, m, senderMessagePos, senderMessageNeg, p);
      this.receiverInOutParam(aSolver, m, receiverMessagePos, receiverMessageNeg, p);
    }

    final EList<Parameter> nilParams = ProtocolUtils.selectParametersInRef(m, kAdornment.NIL);
    for (final Parameter p : nilParams) {
      this.senderNilParam(aSolver, m, senderMessagePos, senderMessageNeg, p);
      /* Notice there is no effect on the receiver of an incoming NIL p */
    }
  }

  /*
   * This method is used for senders of messages wherein the parameter occurs
   * adorned OUT. It stores the information we need to construct integrity
   * clauses, essentially to make sure that no two messages may both occur if
   * they include the same OUT parameter.
   */
  private void storeOutMap(Message m, Parameter p) {
    outParamsToRolesToRefs.insertValue(p, m);
  }

  /*
   * This method is used for senders and receivers of messages wherein the
   * parameter occurs adorned IN or OUT.
   */
  private void storeRoleMap(Role r, Message m, Parameter p) {
    rolesToParamsToRefs.storeValueInNestedMap(r, p, m);
  }

  /*
   * This method is used only for receivers of messages wherein the parameter
   * occurs adorned OUT, which is what we need for the completion clauses.
   */
  private void storeParameterMap(Role r, Message m, Parameter p) {
    paramsToRolesToRefs.storeValueInNestedMap(p, r, m);
    Checker.logger.trace("storeParameterMap: Role r, Message m, Parameter p= "
        + r + " " + m + " " + p + " ");
  }

  /*
   * For the receiver there is _no_ distinction between an IN and an OUT
   * parameter. It must come to know the parameter: either prior to receiving
   * the message or together with receiving the message. (-m + p.m + m*p)
   */
  private void receiverInOutParam(SolverFacade aSolver, Message m, AbstractLiteral receiverMessagePos, AbstractLiteral receiverMessageNeg, Parameter p) {
    final AbstractLiteral receiverParameterPos = aSolver.makeLiteral(m.getReceiver(), p, false);
    final AbstractLiteral paramBeforeMessage = aSolver.makeSequenceLiteral(receiverParameterPos, receiverMessagePos);
    final AbstractLiteral paramUponMessage = aSolver.makeTogetherLiteral(receiverMessagePos, receiverParameterPos);
    aSolver.assertLiteralsAsClause(receiverMessageNeg, paramBeforeMessage, paramUponMessage);
    Checker.logger.debug("IN: (" + receiverMessageNeg.getName() + " + "
        + paramBeforeMessage.getName() + " + " + paramUponMessage.getName()
        + ")");
  }

  /*
   * Capturing causality. If a message is received, it must have been sent
   * before. (-receiver:m + sender:m.receiver:m)
   */
  private void causalitySenderToReceiver(SolverFacade aSolver, AbstractLiteral senderMessagePos, AbstractLiteral receiverMessagePos, AbstractLiteral receiverMessageNeg) {
    final AbstractLiteral sendBeforeReceive = aSolver.makeSequenceLiteral(senderMessagePos, receiverMessagePos);
    aSolver.assertLiteralsAsClause(receiverMessageNeg, sendBeforeReceive);
    Checker.logger.debug("Causality (message occurrence): ("
        + receiverMessageNeg.getName() + " + " + sendBeforeReceive.getName()
        + ")");
  }

  /*
   * NIL p must _not_ be known to the sender _any time prior_ to m. (-m + -p +
   * m.p)
   */
  private void senderNilParam(SolverFacade aSolver, Message m, AbstractLiteral senderMessagePos, AbstractLiteral senderMessageNeg, Parameter p) {
    final AbstractLiteral senderParameterPos = aSolver.makeLiteral(m.getSender(), p, false);
    final AbstractLiteral senderParameterNeg = aSolver.makeLiteral(m.getSender(), p, true);
    final AbstractLiteral messageBeforeParam = aSolver.makeSequenceLiteral(senderMessagePos, senderParameterPos);
    aSolver.assertLiteralsAsClause(senderMessageNeg, senderParameterNeg, messageBeforeParam);
    Checker.logger.debug("NIL: (" + senderMessageNeg.getName() + " + " + messageBeforeParam.getName() + ")");
  }

  /*
   * OUT p is known _immediately upon_ m to the sender. (-m + m*p)
   */
  private void senderOutParam(SolverFacade aSolver, Message m,
      AbstractLiteral senderMessagePos, AbstractLiteral senderMessageNeg, Parameter p) {
    final AbstractLiteral senderParameterPos = aSolver.makeLiteral(m.getSender(), p, false);
    final AbstractLiteral paramUponMessage = aSolver.makeTogetherLiteral(senderMessagePos, senderParameterPos);
    aSolver.assertLiteralsAsClause(senderMessageNeg, paramUponMessage);
    Checker.logger.debug("OUT: (" + senderMessageNeg.getName() + " + " + paramUponMessage.getName() + ")");
  }

  /*
   * IN p means that p become known to the sender _any time prior_ to m. (-m +
   * p.m)
   */
  private void senderInParam(SolverFacade aSolver, Message m, AbstractLiteral senderMessagePos, AbstractLiteral senderMessageNeg, Parameter p) {
    final AbstractLiteral senderParameterPos = aSolver.makeLiteral(m.getSender(), p, false);
    final AbstractLiteral paramBeforeMessage = aSolver.makeSequenceLiteral(senderParameterPos, senderMessagePos);
    aSolver.assertLiteralsAsClause(senderMessageNeg, paramBeforeMessage);
    Checker.logger.debug("IN: (" + senderMessageNeg.getName() + " + "  + paramBeforeMessage.getName() + ")");
  }

  public String getGraphVizFile() {
    return graphVizFile;
  }

  public void setGraphVizFile(String graphVizFile) {
    this.graphVizFile = graphVizFile;
  }

  public String getUriPrefix() {
    return uriPrefix;
  }

  public void setUriPrefix(String uriPrefix) {
    this.uriPrefix = uriPrefix;
  }

}
