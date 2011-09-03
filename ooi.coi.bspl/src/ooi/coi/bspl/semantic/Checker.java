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

import com.ektimisi.precedence.solver.SATLit;
import com.ektimisi.precedence.solver.SATSolver;
import com.ektimisi.precedence.util.MapSet;
import com.google.common.collect.Iterators;

public class Checker extends WorkflowComponentWithSlot {

  private static final int NUMBER_OF_MODELS = 3;

  private static Logger logger = Logger.getLogger(Checker.class);
  static {
    logger.setLevel(Level.INFO); // ALL < DEBUG < INFO < WARN < ERROR < FATAL <
                                 // OFF
    Logger.getLogger(com.ektimisi.precedence.util.Graph.class).setLevel(
        Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.util.MapSet.class).setLevel(
        Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.SATSolver.class).setLevel(
        Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Pairings.class).setLevel(
        Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Literal.class).setLevel(
        Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Sequence.class).setLevel(
        Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Literals.class).setLevel(
        Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Nexts.class).setLevel(
        Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Sequences.class).setLevel(
        Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Together.class).setLevel(
        Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Togethers.class).setLevel(
        Level.WARN);
  }

  private SATSolver theSolver;
  private final List<SATLit[]> theClauses = new ArrayList<SATLit[]>();
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

    theSolver = new SATSolver(null);
    this.generateCausalStructure(theSolver, theProtocol);

    boolean result = false;
    result = this.checkEnactability(theSolver, theProtocol);
    result &= this.checkIntegrity(theSolver, theProtocol);
    if (result)
      Checker.logger.info("Protocol " + theProtocol.getName()
          + " passes all checks");

    ctx.put(this.getSlot(), resource);
  }

  private boolean checkIntegrity(SATSolver aSolver, BSPL theProtocol) {
    final boolean clausesAdded = this.generateIntegrityClauses(aSolver,
        theProtocol);
    boolean result = false;

    if (clausesAdded) {
      this.loadSolver(aSolver);
      try {
        result = aSolver.SATSolve(Checker.NUMBER_OF_MODELS);
      } catch (final Exception e) {
        Checker.logger.error(e.getMessage());
      }
    }

    if (result) {
      Checker.logger.info("Protocol " + theProtocol.getName()
          + " violates integrity on some enactments");
    } else {
      Checker.logger.info("Protocol " + theProtocol.getName()
          + " ensures integrity");
    }
    return !result;
  }

  private boolean checkEnactability(SATSolver aSolver, BSPL theProtocol) {
    this.generateCompletionClauses(aSolver, theProtocol);
    this.loadSolver(aSolver);
    boolean result = false;
    try {
      result = aSolver.SATSolve(Checker.NUMBER_OF_MODELS);
    } catch (final Exception e) {
      Checker.logger.error(e.getMessage());
    }
    if (result) {
      Checker.logger
          .info("Protocol " + theProtocol.getName() + " is enactable");
    } else {
      Checker.logger.info("Protocol " + theProtocol.getName()
          + " is not enactable");
    }
    return result;
  }

  private void loadSolver(SATSolver aSolver) {
    for (final SATLit[] aClause : theClauses)
      aSolver.addOneClause(aClause);
  }

  private void addClause(SATLit[] aClause) {
    theClauses.add(aClause);
  }

  private void generateCausalStructure(SATSolver aSolver, BSPL theProtocol) {
    for (final EObject aRef : theProtocol.getReferences()) {
      /*
       * TODO Should generate different literals for each copy of an overloaded
       * message schema. For example, if the protocol has two rfq messages with
       * different schemas, we need two rfq literals for the sender and two for
       * the receiver.
       */
      final Message aMessage = (Message) aRef;
      this.generateMessageClauses(aSolver, aMessage);

      for (final EObject anotherRef : theProtocol.getReferences()) {
        final Message anotherMessage = (Message) anotherRef;
        this.messageMessageClauses(aSolver, aMessage, anotherMessage);
      }
    }
    this.generateParameterClauses(aSolver, theProtocol);
  }

  private boolean generateIntegrityClauses(SATSolver aSolver, BSPL theProtocol) {
    final List<ArrayList<SATLit>> competingMessages = this.getCompetingMessages(aSolver);

    if (!competingMessages.isEmpty()) {
      final List<ArrayList<SATLit>> allPairwiseClauses = this.generateAllPairwise(aSolver, competingMessages);
      for (final ArrayList<SATLit> pairwiseClause : allPairwiseClauses) {
        final SATLit[] params = pairwiseClause
            .toArray(new SATLit[pairwiseClause.size()]);
        this.addClause(params);
        Checker.logger.warn("Integrity clause: "
            + ProtocolUtils.stringify(pairwiseClause));
      }
      return true;
    } else
      return false;
  }

  private List<ArrayList<SATLit>> generateAllPairwise(SATSolver aSolver, List<ArrayList<SATLit>> competingMessages) {
    List<ArrayList<SATLit>> allPairwiseClauses = this.makePairwiseClauses(aSolver, competingMessages.get(0));
    List<ArrayList<SATLit>> newPairwiseClauses;

    for (int i = 1; i < competingMessages.size(); i++) {
      final ArrayList<SATLit> messageLiterals = competingMessages.get(i);
      final List<ArrayList<SATLit>> pairwiseClauses = this.makePairwiseClauses(aSolver, messageLiterals);
      newPairwiseClauses = new ArrayList<ArrayList<SATLit>>();

      for (final ArrayList<SATLit> oldClause : allPairwiseClauses) {
        for (final ArrayList<SATLit> addedClause : pairwiseClauses) {
          final ArrayList<SATLit> newClause = new ArrayList<SATLit>();
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

  private List<ArrayList<SATLit>> getCompetingMessages(SATSolver aSolver) {
    final List<ArrayList<SATLit>> competingMessages = new ArrayList<ArrayList<SATLit>>();
    for (final Parameter p : outParamsToRolesToRefs.keySet()) {
      final Collection<Message> messagesForParam = outParamsToRolesToRefs
          .getValues(p);
      if (messagesForParam.size() > 1) {
        final ArrayList<SATLit> messageLiterals = new ArrayList<SATLit>();
        for (final Message m : messagesForParam) {
          final SATLit messageLiteral = this.makeLiteral(aSolver, m.getSender(), m, false);
          messageLiterals.add(messageLiteral);
        }
        competingMessages.add(messageLiterals); // TODO Remove this
      }
    }
    Checker.logger.warn("Competing Messages: "+ ProtocolUtils.stringify(competingMessages));
    return competingMessages;
  }

  private List<ArrayList<SATLit>> makePairwiseClauses(SATSolver aSolver, ArrayList<SATLit> messageLiterals) {
    final List<ArrayList<SATLit>> pairwiseClauses = new ArrayList<ArrayList<SATLit>>();
    for (final SATLit messageParam : messageLiterals) {
      final ArrayList<SATLit> conjunct = new ArrayList<SATLit>();
      for (final SATLit mLit : messageLiterals) {
        if (mLit != messageParam) {
          conjunct.add(mLit);
        }
      }
      pairwiseClauses.add(conjunct);
    }
    Checker.logger.debug("makePairwiseClauses: " + ProtocolUtils.stringify(pairwiseClauses));
    return pairwiseClauses;
  }

  private void generateCompletionClauses(SATSolver aSolver, BSPL theProtocol) {
    for (final Parameter p : paramsToRolesToRefs.keySet()) {
      if (this.isPublicOut(theProtocol, p)) {
        final MapSet<Role, Message> roleMap = paramsToRolesToRefs.get(p);
        final List<SATLit> outParamLiterals = new ArrayList<SATLit>();
        for (final Role r : roleMap.keySet()) {

          for (final Message m : roleMap.getValues(r)) {
            if (this.isMessageOut(m, p) && (r == m.getReceiver())) {
              final SATLit roleParameterPos = this.makeLiteral(aSolver, r, p,
                  false);
              outParamLiterals.add(roleParameterPos);
            }
          }
        }
        if (!outParamLiterals.isEmpty()) {
          final SATLit[] params = outParamLiterals
              .toArray(new SATLit[outParamLiterals.size()]);
          this.addClause(params);
          Checker.logger.warn("Completion clause: "
              + ProtocolUtils.stringify(outParamLiterals));
        }
      }
    }
  }

  private void generateParameterClauses(SATSolver aSolver, BSPL theProtocol) {
    for (final Role r : rolesToParamsToRefs.keySet()) {
      final MapSet<Parameter, Message> paramMap = rolesToParamsToRefs.get(r);
      for (final Parameter p : paramMap.keySet()) {
        final SATLit roleParameterPos = this.makeLiteral(aSolver, r, p, false);
        final SATLit roleParameterNeg = this.makeLiteral(aSolver, r, p, true);

        final List<SATLit> togethers = new ArrayList<SATLit>();
        togethers.add(roleParameterNeg);

        for (final Message m : paramMap.getValues(p)) {
          final SATLit roleMessagePos = this.makeLiteral(aSolver, r, m, false);
          final SATLit paramUponMessageRole = aSolver.allTogethers()
              .makeTogetherLiteral(aSolver, roleMessagePos, roleParameterPos);
          togethers.add(paramUponMessageRole);
        }

        final SATLit[] togs = togethers.toArray(new SATLit[togethers.size()]);
        this.addClause(togs);
        Checker.logger.warn("Causality (parameter occurrence): "
            + ProtocolUtils.stringify(togethers));
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

  private void messageMessageClauses(SATSolver aSolver, Message first,
      Message second) {
    final Role firstSender = first.getSender();
    final Role secondSender = second.getSender();

    if (firstSender == secondSender) {
      final SATLit firstPosS = this.makeLiteral(aSolver, firstSender, first,
          false);
      final SATLit secondPosS = this.makeLiteral(aSolver, secondSender, second,
          false);
      if (firstPosS.getNumber() < secondPosS.getNumber()) {
        this.addNotTogetherClause(aSolver, firstPosS, secondPosS);
        // SATLit firstPosR = makeLiteral(aSolver, first.getReceiver(), first,
        // false);
        // SATLit secondPosR = makeLiteral(aSolver, second.getReceiver(),
        // second, false);
        // addNotTogetherClause(aSolver, firstPosR, secondPosR);
      }
    }
  }

  private void addNotTogetherClause(SATSolver aSolver, SATLit firstPos,
      SATLit secondPos) {
    final SATLit togetherFirstSecond = aSolver.allTogethers()
        .makeTogetherLiteral(aSolver, firstPos, secondPos);
    final int[] notTogether = { -togetherFirstSecond.getNumber() };
    aSolver.addClause(notTogether);
    Checker.logger.warn("Messages _NOT_ together: ("
        + togetherFirstSecond.getName() + ")");
  }

  /*
   * This method not only generates the clauses for each message, but also
   * builds the maps used by subsequent methods.
   */
  private void generateMessageClauses(SATSolver aSolver, Message m) {
    final SATLit senderMessagePos = this.makeLiteral(aSolver, m.getSender(), m,
        false);
    final SATLit senderMessageNeg = this.makeLiteral(aSolver, m.getSender(), m,
        true);
    final SATLit receiverMessagePos = this.makeLiteral(aSolver,
        m.getReceiver(), m, false);
    final SATLit receiverMessageNeg = this.makeLiteral(aSolver,
        m.getReceiver(), m, true);

    this.causalitySenderToReceiver(aSolver, senderMessagePos,
        receiverMessagePos, receiverMessageNeg);

    final EList<Parameter> inParams = ProtocolUtils.selectParametersInRef(m,
        kAdornment.IN);
    for (final Parameter p : inParams) {
      this.storeRoleMap(m.getSender(), m, p);
      this.storeRoleMap(m.getReceiver(), m, p);
      this.senderInParam(aSolver, m, senderMessagePos, senderMessageNeg, p);
      this.receiverInOutParam(aSolver, m, receiverMessagePos,
          receiverMessageNeg, p);
    }

    final EList<Parameter> outParams = ProtocolUtils.selectParametersInRef(m,
        kAdornment.OUT);
    for (final Parameter p : outParams) {
      this.storeOutMap(m, p);
      this.storeRoleMap(m.getSender(), m, p);
      this.storeRoleMap(m.getReceiver(), m, p);
      this.storeParameterMap(m.getReceiver(), m, p);
      this.senderOutParam(aSolver, m, senderMessagePos, senderMessageNeg, p);
      this.receiverInOutParam(aSolver, m, receiverMessagePos,
          receiverMessageNeg, p);
    }

    final EList<Parameter> nilParams = ProtocolUtils.selectParametersInRef(m,
        kAdornment.NIL);
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
  private void receiverInOutParam(SATSolver aSolver, Message m,
      SATLit receiverMessagePos, SATLit receiverMessageNeg, Parameter p) {
    final SATLit receiverParameterPos = this.makeLiteral(aSolver,
        m.getReceiver(), p, false);
    final SATLit paramBeforeMessage = aSolver.allSequences()
        .makeSequenceLiteral(aSolver, receiverParameterPos, receiverMessagePos);
    final SATLit paramUponMessage = aSolver.allTogethers().makeTogetherLiteral(
        aSolver, receiverMessagePos, receiverParameterPos);
    aSolver.addClause(receiverMessageNeg, paramBeforeMessage, paramUponMessage);
    Checker.logger.warn("IN: (" + receiverMessageNeg.getName() + " + "
        + paramBeforeMessage.getName() + " + " + paramUponMessage.getName()
        + ")");
  }

  /*
   * Capturing causality. If a message is received, it must have been sent
   * before. (-receiver:m + sender:m.receiver:m)
   */
  private void causalitySenderToReceiver(SATSolver aSolver,
      SATLit senderMessagePos, SATLit receiverMessagePos,
      SATLit receiverMessageNeg) {
    final SATLit sendBeforeReceive = aSolver.allSequences()
        .makeSequenceLiteral(aSolver, senderMessagePos, receiverMessagePos);
    aSolver.addClause(receiverMessageNeg, sendBeforeReceive);
    Checker.logger.warn("Causality (message occurrence): ("
        + receiverMessageNeg.getName() + " + " + sendBeforeReceive.getName()
        + ")");
  }

  /*
   * NIL p must _not_ be known to the sender _any time prior_ to m. (-m + -p +
   * m.p)
   */
  private void senderNilParam(SATSolver aSolver, Message m,
      SATLit senderMessagePos, SATLit senderMessageNeg, Parameter p) {
    final SATLit senderParameterPos = this.makeLiteral(aSolver, m.getSender(),
        p, false);
    final SATLit senderParameterNeg = this.makeLiteral(aSolver, m.getSender(),
        p, true);
    final SATLit messageBeforeParam = aSolver.allSequences()
        .makeSequenceLiteral(aSolver, senderMessagePos, senderParameterPos);
    aSolver.addClause(senderMessageNeg, senderParameterNeg, messageBeforeParam);
    Checker.logger.warn("NIL: (" + senderMessageNeg.getName() + " + "
        + messageBeforeParam.getName() + ")");
  }

  /*
   * OUT p is known _immediately upon_ m to the sender. (-m + m*p)
   */
  private void senderOutParam(SATSolver aSolver, Message m,
      SATLit senderMessagePos, SATLit senderMessageNeg, Parameter p) {
    final SATLit senderParameterPos = this.makeLiteral(aSolver, m.getSender(),
        p, false);
    final SATLit paramUponMessage = aSolver.allTogethers().makeTogetherLiteral(
        aSolver, senderMessagePos, senderParameterPos);
    aSolver.addClause(senderMessageNeg, paramUponMessage);
    Checker.logger.warn("OUT: (" + senderMessageNeg.getName() + " + "
        + paramUponMessage.getName() + ")");
  }

  /*
   * IN p means that p become known to the sender _any time prior_ to m. (-m +
   * p.m)
   */
  private void senderInParam(SATSolver aSolver, Message m,
      SATLit senderMessagePos, SATLit senderMessageNeg, Parameter p) {
    final SATLit senderParameterPos = this.makeLiteral(aSolver, m.getSender(),
        p, false);
    final SATLit paramBeforeMessage = aSolver.allSequences()
        .makeSequenceLiteral(aSolver, senderParameterPos, senderMessagePos);
    aSolver.addClause(senderMessageNeg, paramBeforeMessage);
    Checker.logger.warn("IN: (" + senderMessageNeg.getName() + " + "
        + paramBeforeMessage.getName() + ")");
  }

  private SATLit makeLiteral(SATSolver aSolver, Role r, Message m,
      boolean negated) {
    return aSolver.allLiterals().makeLiteral(aSolver,
        this.msgName(m, r.getName()), negated);
  }

  private SATLit makeLiteral(SATSolver aSolver, Role r, Parameter p,
      boolean negated) {
    return aSolver.allLiterals().makeLiteral(aSolver,
        this.paramName(p, r.getName()), negated);
  }

  private String msgName(Message m, String roleName) {
    return roleName + ":" + "m_" + m.getName();
  }

  private String paramName(Parameter p, String roleName) {
    return roleName + ":" + "p_" + p.getName();
  }

}
