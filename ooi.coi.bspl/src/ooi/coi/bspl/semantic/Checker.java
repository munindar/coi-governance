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
import com.ektimisi.precedence.solver.PrecedenceSolver;
import com.ektimisi.precedence.util.MapSet;
import com.google.common.collect.Iterators;

public class Checker extends WorkflowComponentWithSlot {

  private static final int NUMBER_OF_MODELS = 3;

  private static Logger logger = Logger.getLogger(Checker.class);
  static {
    logger.setLevel(Level.INFO); // ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF
    Logger.getLogger(com.ektimisi.precedence.util.Graph.class).setLevel(Level.WARN);
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
  }

  private PrecedenceSolver theSolver;
  private final List<AbstractLiteral[]> theClauses = new ArrayList<AbstractLiteral[]>();
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

    theSolver = new PrecedenceSolver(null);
    this.generateCausalStructure(theSolver, theProtocol);

    boolean result = true;
//    result &= this.checkEnactability(theSolver, theProtocol);
//    result &= this.checkIntegrity(theSolver, theProtocol);
    result &= this.checkAtomicity(theSolver, theProtocol);

    if (result)
      Checker.logger.info("Protocol " + theProtocol.getName() + " passes all checks");

    ctx.put(this.getSlot(), resource);
  }

  private boolean checkAtomicity(PrecedenceSolver aSolver, BSPL theProtocol) {
    this.generateMaximalityClauses(aSolver, theProtocol);
    this.generateNonCompletionClause(aSolver, theProtocol);

    boolean result = false;

    this.loadSolver(aSolver);
    try {
      result = aSolver.solve(Checker.NUMBER_OF_MODELS);
    } catch (final Exception e) {
      Checker.logger.error(e.getMessage());
    }

    if (result) {
      Checker.logger.info("Protocol " + theProtocol.getName() + " violates atomicity on some enactments");
    } else {
      Checker.logger.info("Protocol " + theProtocol.getName() + " ensures atomicity");
    }
    return !result;
  }

  private boolean checkIntegrity(PrecedenceSolver aSolver, BSPL theProtocol) {
    final boolean clausesAdded = this.generateIntegrityClauses(aSolver, theProtocol);
    boolean result = false;

    if (clausesAdded) {
      this.loadSolver(aSolver);
      try {
        result = aSolver.solve(Checker.NUMBER_OF_MODELS);
      } catch (final Exception e) {
        Checker.logger.error(e.getMessage());
      }
    }

    if (result) {
      Checker.logger.info("Protocol " + theProtocol.getName() + " violates integrity on some enactments");
    } else {
      Checker.logger.info("Protocol " + theProtocol.getName() + " ensures integrity");
    }
    return !result;
  }

  private boolean checkEnactability(PrecedenceSolver aSolver, BSPL theProtocol) {
    this.generateCompletionClauses(aSolver, theProtocol);
    this.loadSolver(aSolver);
    boolean result = false;
    try {
      result = aSolver.solve(Checker.NUMBER_OF_MODELS);
    } catch (final Exception e) {
      Checker.logger.error(e.getMessage());
    }
    if (result) {
      Checker.logger.info("Protocol " + theProtocol.getName() + " is enactable");
    } else {
      Checker.logger.info("Protocol " + theProtocol.getName() + " is not enactable");
    }
    return result;
  }

  private void loadSolver(PrecedenceSolver aSolver) {
    for (final AbstractLiteral[] aClause : theClauses)
      aSolver.addOneClause(aClause);
  }

  private void addClause(AbstractLiteral[] aClause) {
    theClauses.add(aClause);
  }

  private void addClause(List<AbstractLiteral> listClause) {
    final AbstractLiteral[] aClause = listClause.toArray(new AbstractLiteral[listClause.size()]);
    this.addClause(aClause);
  }

  public void addLiteralsAsClause(AbstractLiteral... literals) {
    this.addClause(literals);
  }

  private void generateMaximalityClauses(PrecedenceSolver aSolver, BSPL theProtocol) {
    for (final EObject aRef : theProtocol.getReferences()) {
      /*
       * TODO Should generate different literals for each copy of an overloaded
       * message schema. For example, if the protocol has two rfq messages with
       * different schemas, we need two rfq literals, e.g., rfq0 and rfq1, for
       * the sender and likewise two for the receiver.
       */
      final Message aMessage = (Message) aRef;
      this.generateMessageMaximalityClauses(aSolver, aMessage);
    }
  }
  
  private void generateNonCompletionClause(PrecedenceSolver aSolver, BSPL theProtocol) {
    final List<AbstractLiteral> protocolOutParamLiterals = new ArrayList<AbstractLiteral>();
    for (final Parameter p : paramsToRolesToRefs.keySet()) {
      if (this.isPublicOut(theProtocol, p)) {
        final MapSet<Role, Message> rolesToRefs = paramsToRolesToRefs.get(p);
         
          List<AbstractLiteral> paramInstancesIf = new ArrayList<AbstractLiteral>();
          List<AbstractLiteral> paramInstancesOnlyIf = new ArrayList<AbstractLiteral>();
          final AbstractLiteral paramLiteralPos = this.makeLiteral(aSolver, theProtocol.getName(), p, false);
          final AbstractLiteral paramLiteralNeg = this.makeLiteral(aSolver, theProtocol.getName(), p, true);
          paramInstancesIf.add(paramLiteralNeg);
          paramInstancesOnlyIf.add(paramLiteralPos);
          
          for (Role r : rolesToRefs.keySet()) {
            final AbstractLiteral messageLiteralPos = this.makeLiteral(aSolver, r, p, false);
            final AbstractLiteral messageLiteralNeg = this.makeLiteral(aSolver, r, p, true);
            paramInstancesIf.add(messageLiteralPos);
            paramInstancesOnlyIf.add(messageLiteralNeg);
          }     

          this.addClause(paramInstancesIf);
          this.addClause(paramInstancesOnlyIf);
          protocolOutParamLiterals.add(paramLiteralNeg);
      }
    }
    
    this.addClause(protocolOutParamLiterals);
    Checker.logger.warn("Noncompletion clause: " + ProtocolUtils.stringify(protocolOutParamLiterals));
  }

  private void generateCausalStructure(PrecedenceSolver aSolver, BSPL theProtocol) {
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

  private void generateParameterNonoccurrenceClauses(PrecedenceSolver aSolver) {
    for (final Parameter one : paramsToRolesToRefs.keySet()) {
      for (Role oneR : paramsToRolesToRefs.get(one).keySet()) {
        final AbstractLiteral firstPosS = this.makeLiteral(aSolver, oneR, one, false);
        final AbstractLiteral firstNegS = this.makeLiteral(aSolver, oneR, one, true);
        
        for (final Parameter two : paramsToRolesToRefs.keySet()) {
          for (Role twoR : paramsToRolesToRefs.get(two).keySet()) {
          final AbstractLiteral secondPosS = this.makeLiteral(aSolver, twoR, two, false);
          final AbstractLiteral secondNegS = this.makeLiteral(aSolver, twoR, two, true);

          this.addNonoccurrenceClauses(aSolver, firstPosS, secondPosS, firstNegS, secondNegS);
          }
        }
      }
   }
  }

  private boolean generateIntegrityClauses(PrecedenceSolver aSolver, BSPL theProtocol) {
    final List<ArrayList<AbstractLiteral>> competingMessages = this.getCompetingMessages(aSolver, theProtocol);

    if (!competingMessages.isEmpty()) {
      final List<ArrayList<AbstractLiteral>> allPairwiseClauses = this.generateAllPairwise(aSolver, competingMessages);
      for (final ArrayList<AbstractLiteral> pairwiseClause : allPairwiseClauses) {
        this.addClause(pairwiseClause);
        Checker.logger.warn("Integrity clause: " + ProtocolUtils.stringify(pairwiseClause));
      }
      return true;
    } else
      return false;
  }

  private List<ArrayList<AbstractLiteral>> generateAllPairwise(PrecedenceSolver aSolver, List<ArrayList<AbstractLiteral>> competingMessages) {
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

  private List<ArrayList<AbstractLiteral>> getCompetingMessages(PrecedenceSolver aSolver, BSPL theProtocol) {
    final List<ArrayList<AbstractLiteral>> competingMessages = new ArrayList<ArrayList<AbstractLiteral>>();
    for (final Parameter p : outParamsToRolesToRefs.keySet()) {
      final Collection<Message> messagesForParam = outParamsToRolesToRefs.getValues(p);
    
      if (messagesForParam.size() > 1) {
        final ArrayList<AbstractLiteral> messageLiterals = new ArrayList<AbstractLiteral>();
        for (final Message m : messagesForParam) {
          final AbstractLiteral messageLiteral = this.makeLiteral(aSolver, m.getSender(), m, false);
          messageLiterals.add(messageLiteral);
        }
        competingMessages.add(messageLiterals); // TODO Remove this
      }
    }
    Checker.logger.warn("Competing Messages: "+ ProtocolUtils.stringify(competingMessages));
    return competingMessages;
  }

  private List<ArrayList<AbstractLiteral>> makePairwiseClauses(PrecedenceSolver aSolver, ArrayList<AbstractLiteral> messageLiterals) {
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

  private void generateCompletionClauses(PrecedenceSolver aSolver, BSPL theProtocol) {
    for (final Parameter p : paramsToRolesToRefs.keySet()) {
      if (this.isPublicOut(theProtocol, p)) {
        final MapSet<Role, Message> roleMap = paramsToRolesToRefs.get(p);
        final List<AbstractLiteral> outParamLiterals = new ArrayList<AbstractLiteral>();
        for (final Role r : roleMap.keySet()) {

          for (final Message m : roleMap.getValues(r)) {
            if (this.isMessageOut(m, p) && (r == m.getReceiver())) {
              final AbstractLiteral roleParameterPos = this.makeLiteral(aSolver, r, p, false);
              outParamLiterals.add(roleParameterPos);
            }
          }
        }
        if (!outParamLiterals.isEmpty()) {
          this.addClause(outParamLiterals);
          Checker.logger.warn("Completion clause: " + ProtocolUtils.stringify(outParamLiterals));
        }
      }
    }
  }

  private void generateParameterClauses(PrecedenceSolver aSolver) {
    for (final Role r : rolesToParamsToRefs.keySet()) {
      final MapSet<Parameter, Message> paramMap = rolesToParamsToRefs.get(r);
      for (final Parameter p : paramMap.keySet()) {
        final AbstractLiteral roleParameterPos = this.makeLiteral(aSolver, r, p, false);
        final AbstractLiteral roleParameterNeg = this.makeLiteral(aSolver, r, p, true);

        final List<AbstractLiteral> togethers = new ArrayList<AbstractLiteral>();
        togethers.add(roleParameterNeg);

        for (final Message m : paramMap.getValues(p)) {
          final AbstractLiteral roleMessagePos = this.makeLiteral(aSolver, r, m, false);
          final AbstractLiteral paramUponMessageRole = aSolver.makeTogetherLiteral(roleMessagePos, roleParameterPos);
          togethers.add(paramUponMessageRole);
        }

        this.addClause(togethers);
        Checker.logger.warn("Causality (parameter occurrence): " + ProtocolUtils.stringify(togethers));
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

  private void generateMessageMessageClauses(PrecedenceSolver aSolver, Message first, Message second) {
    final Role firstSender = first.getSender();
    final Role secondSender = second.getSender();

    final AbstractLiteral firstPosS = this.makeLiteral(aSolver, firstSender, first, false);
    final AbstractLiteral secondPosS = this.makeLiteral(aSolver, secondSender, second, false);
    final AbstractLiteral firstNegS = this.makeLiteral(aSolver, firstSender, first, true);
    final AbstractLiteral secondNegS = this.makeLiteral(aSolver, secondSender, second, true);

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

  private void addNonoccurrenceClauses(PrecedenceSolver aSolver, AbstractLiteral firstPos, AbstractLiteral secondPos, AbstractLiteral firstNeg, AbstractLiteral secondNeg) {
    if (firstPos != secondPos) {
      final AbstractLiteral togetherNonFirstNonSecond = aSolver.makeTogetherLiteral(firstNeg, secondNeg);
      final AbstractLiteral[] togetherNon = { firstPos, secondPos, togetherNonFirstNonSecond };
      this.addClause(togetherNon);
      Checker.logger.warn("All nonoccurrences are together: (" + firstPos.getName() + " + " + secondPos.getName() + " + " + togetherNonFirstNonSecond.getName() + ")");
      
      final AbstractLiteral sequenceNonFirstSecond = aSolver.makeSequenceLiteral(firstNeg, secondPos);
      final AbstractLiteral[] sequenceNon = { firstPos, secondNeg, sequenceNonFirstSecond };
      this.addClause(sequenceNon);
      Checker.logger.warn("Nonoccurrences precede occurrences: (" + firstPos.getName() + " + " + secondNeg.getName() + " + " + sequenceNonFirstSecond.getName() + ")"); 
    }
  }

  private void addNotTogetherClause(PrecedenceSolver aSolver, AbstractLiteral firstPos, AbstractLiteral secondPos) {
    final AbstractLiteral togetherFirstSecond = aSolver.makeTogetherLiteral(firstPos, secondPos);
    final AbstractLiteral[] notTogether = { aSolver.getNegatedLiteral(togetherFirstSecond) };
    this.addClause(notTogether);
    Checker.logger.warn("Messages _NOT_ together: (" + togetherFirstSecond.getName() + ")");
  }

  private void generateMessageMaximalityClauses(PrecedenceSolver aSolver, Message m) {
    final AbstractLiteral senderMessagePos = this.makeLiteral(aSolver, m.getSender(), m, false);
    final AbstractLiteral senderMessageNeg = this.makeLiteral(aSolver, m.getSender(), m, true);
    final AbstractLiteral receiverMessagePos = this.makeLiteral(aSolver, m.getReceiver(), m, false);

    this.messageDeliveryClause(aSolver, senderMessagePos, receiverMessagePos, senderMessageNeg);

    final List<AbstractLiteral> maximalityClause = new ArrayList<AbstractLiteral>();
    maximalityClause.add(senderMessagePos);

    final EList<Parameter> inParams = ProtocolUtils.selectParametersInRef(m, kAdornment.IN);
    for (final Parameter p : inParams) {
      final AbstractLiteral senderParameterNeg = this.makeLiteral(aSolver, m.getSender(), p, true);
      maximalityClause.add(senderParameterNeg);
    }

    final EList<Parameter> outParams = ProtocolUtils.selectParametersInRef(m, kAdornment.OUT);
    for (final Parameter p : outParams) {
      final AbstractLiteral senderParameterPos = this.makeLiteral(aSolver, m.getSender(), p, false);
      maximalityClause.add(senderParameterPos);
    }

    final EList<Parameter> nilParams = ProtocolUtils.selectParametersInRef(m, kAdornment.NIL);
    for (final Parameter p : nilParams) {
      /* TODO Need to think through the treatment of NIL parameters for maximality. */
      final AbstractLiteral senderParameterPos = this.makeLiteral(aSolver, m.getSender(), p, false);
      maximalityClause.add(senderParameterPos);
    }
    
    this.addClause(maximalityClause);
    Checker.logger.warn("Maximality clause: (" +ProtocolUtils.stringify(maximalityClause)+ ")");
  }
  
  private void messageDeliveryClause(PrecedenceSolver aSolver, AbstractLiteral senderMessagePos, AbstractLiteral receiverMessagePos, AbstractLiteral senderMessageNeg) {
    final AbstractLiteral successfulTransmission = aSolver.makeSequenceLiteral(senderMessagePos, receiverMessagePos);
    this.addLiteralsAsClause(senderMessageNeg, successfulTransmission);
    Checker.logger.warn("Causality (message occurrence): (" +senderMessageNeg.getName()+ " + " +successfulTransmission.getName()+ ")");
  }

  /*
   * This method not only generates the clauses for each message, but also
   * builds the maps used by subsequent methods.
   */
  private void generateMessageClauses(PrecedenceSolver aSolver, Message m) {
    final AbstractLiteral senderMessagePos = this.makeLiteral(aSolver, m.getSender(), m, false);
    final AbstractLiteral senderMessageNeg = this.makeLiteral(aSolver, m.getSender(), m, true);
    final AbstractLiteral receiverMessagePos = this.makeLiteral(aSolver, m.getReceiver(), m, false);
    final AbstractLiteral receiverMessageNeg = this.makeLiteral(aSolver, m.getReceiver(), m, true);

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
    Checker.logger.debug("storeParameterMap: Role r, Message m, Parameter p= "
        + r + " " + m + " " + p + " ");
  }

  /*
   * For the receiver there is _no_ distinction between an IN and an OUT
   * parameter. It must come to know the parameter: either prior to receiving
   * the message or together with receiving the message. (-m + p.m + m*p)
   */
  private void receiverInOutParam(PrecedenceSolver aSolver, Message m, AbstractLiteral receiverMessagePos, AbstractLiteral receiverMessageNeg, Parameter p) {
    final AbstractLiteral receiverParameterPos = this.makeLiteral(aSolver, m.getReceiver(), p, false);
    final AbstractLiteral paramBeforeMessage = aSolver.makeSequenceLiteral(receiverParameterPos, receiverMessagePos);
    final AbstractLiteral paramUponMessage = aSolver.makeTogetherLiteral(receiverMessagePos, receiverParameterPos);
    this.addLiteralsAsClause(receiverMessageNeg, paramBeforeMessage, paramUponMessage);
    Checker.logger.warn("IN: (" + receiverMessageNeg.getName() + " + "
        + paramBeforeMessage.getName() + " + " + paramUponMessage.getName()
        + ")");
  }

  /*
   * Capturing causality. If a message is received, it must have been sent
   * before. (-receiver:m + sender:m.receiver:m)
   */
  private void causalitySenderToReceiver(PrecedenceSolver aSolver, AbstractLiteral senderMessagePos, AbstractLiteral receiverMessagePos, AbstractLiteral receiverMessageNeg) {
    final AbstractLiteral sendBeforeReceive = aSolver.makeSequenceLiteral(senderMessagePos, receiverMessagePos);
    this.addLiteralsAsClause(receiverMessageNeg, sendBeforeReceive);
    Checker.logger.warn("Causality (message occurrence): ("
        + receiverMessageNeg.getName() + " + " + sendBeforeReceive.getName()
        + ")");
  }

  /*
   * NIL p must _not_ be known to the sender _any time prior_ to m. (-m + -p +
   * m.p)
   */
  private void senderNilParam(PrecedenceSolver aSolver, Message m, AbstractLiteral senderMessagePos, AbstractLiteral senderMessageNeg, Parameter p) {
    final AbstractLiteral senderParameterPos = this.makeLiteral(aSolver, m.getSender(), p, false);
    final AbstractLiteral senderParameterNeg = this.makeLiteral(aSolver, m.getSender(), p, true);
    final AbstractLiteral messageBeforeParam = aSolver.makeSequenceLiteral(senderMessagePos, senderParameterPos);
    this.addLiteralsAsClause(senderMessageNeg, senderParameterNeg, messageBeforeParam);
    Checker.logger.warn("NIL: (" + senderMessageNeg.getName() + " + " + messageBeforeParam.getName() + ")");
  }

  /*
   * OUT p is known _immediately upon_ m to the sender. (-m + m*p)
   */
  private void senderOutParam(PrecedenceSolver aSolver, Message m,
      AbstractLiteral senderMessagePos, AbstractLiteral senderMessageNeg, Parameter p) {
    final AbstractLiteral senderParameterPos = this.makeLiteral(aSolver, m.getSender(), p, false);
    final AbstractLiteral paramUponMessage = aSolver.makeTogetherLiteral(senderMessagePos, senderParameterPos);
    this.addLiteralsAsClause(senderMessageNeg, paramUponMessage);
    Checker.logger.warn("OUT: (" + senderMessageNeg.getName() + " + " + paramUponMessage.getName() + ")");
  }

  /*
   * IN p means that p become known to the sender _any time prior_ to m. (-m +
   * p.m)
   */
  private void senderInParam(PrecedenceSolver aSolver, Message m, AbstractLiteral senderMessagePos, AbstractLiteral senderMessageNeg, Parameter p) {
    final AbstractLiteral senderParameterPos = this.makeLiteral(aSolver, m.getSender(), p, false);
    final AbstractLiteral paramBeforeMessage = aSolver.makeSequenceLiteral(senderParameterPos, senderMessagePos);
    this.addLiteralsAsClause(senderMessageNeg, paramBeforeMessage);
    Checker.logger.warn("IN: (" + senderMessageNeg.getName() + " + "  + paramBeforeMessage.getName() + ")");
  }

  private AbstractLiteral makeLiteral(PrecedenceSolver aSolver, Role r, Message m, boolean negated) {
    return aSolver.makeLiteral(this.msgName(m, r.getName()), negated);
  }

  private AbstractLiteral makeLiteral(PrecedenceSolver aSolver, Role r, Parameter p, boolean negated) {
    return aSolver.makeLiteral(this.paramName(p, r.getName()), negated);
  }

  private AbstractLiteral makeLiteral(PrecedenceSolver aSolver, String prefix, Parameter p, boolean negated) {
    return aSolver.makeLiteral(this.paramName(p, prefix), negated);
  }

  private String msgName(Message m, String roleName) {
    return roleName + ":" + "m_" + m.getName();
  }

  private String paramName(Parameter p, String roleName) {
    return roleName + ":" + "p_" + p.getName();
  }

}
