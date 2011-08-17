package ooi.coi.bspl.semantic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;
import com.google.common.collect.Iterators;

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

import com.ektimisi.precedence.solver.SATLit;
import com.ektimisi.precedence.solver.SATSolver;
import com.ektimisi.precedence.util.MapSet;

public class Checker extends WorkflowComponentWithSlot {

  private static final int NUMBER_OF_MODELS = 3;

  private static Logger logger = Logger.getLogger(Checker.class);
  static {
    logger.setLevel(Level.INFO); // ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF
    Logger.getLogger(com.ektimisi.precedence.util.Graph.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.util.MapSet.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.SATSolver.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Pairings.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Literal.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Sequence.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Literals.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Nexts.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Sequences.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Together.class).setLevel(Level.WARN);
    Logger.getLogger(com.ektimisi.precedence.solver.Togethers.class).setLevel(Level.WARN);
  }

  private SATSolver theSolver;
  private List<SATLit[]> theClauses = new ArrayList<SATLit[]>();
  private NestedMap<Role, Parameter, Message> rolesToParamsToRefs = new NestedMap<Role, Parameter, Message>();  
  private NestedMap<Parameter, Role, Message> paramsToRolesToRefs = new NestedMap<Parameter, Role, Message>();  
  private MapSet<Parameter, Message> outParamsToRolesToRefs = new MapSet<Parameter, Message>();  


  @Override
  public void invoke(IWorkflowContext ctx) {
    Resource resource = (Resource) ctx.get(this.getSlot());

    Iterator<Object> contents = EcoreUtil.getAllContents(resource, true);
    Iterator<BSPL> iter = Iterators.filter(contents, BSPL.class);
    BSPL theProtocol = Iterators.getOnlyElement(iter);

    theSolver = new SATSolver(null);
    this.generateCausalStructure(theSolver, theProtocol);

    boolean result = false;
    result = this.checkEnactability(theSolver, theProtocol);
    result &= this.checkIntegrity(theSolver, theProtocol);
    
    ctx.put(this.getSlot(), result);
  }
 
  private boolean checkIntegrity(SATSolver aSolver, BSPL theProtocol) {
    boolean clausesAdded = this.generateIntegrityClauses(aSolver, theProtocol);
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
      Checker.logger.info("Violates integrity on some enactments");
    } else {
      Checker.logger.info("Ensures integrity");
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
      Checker.logger.info("Enactable");
    } else {
      Checker.logger.info("Not enactable");
    }
    return result;
  }

  private void loadSolver(SATSolver aSolver) {
    for (SATLit[] aClause : theClauses)
      aSolver.addOneClause(aClause);
  }
  
  private void addClause(SATLit[] aClause) {
    theClauses.add(aClause);
  }
  
  private void generateCausalStructure(SATSolver aSolver, BSPL theProtocol) {
    for (EObject aRef : theProtocol.getReferences()) {
      /* TODO Should generate different literals for each copy of an overloaded message 
       * schema. For example, if the protocol has two rfq messages with different schemas,
       * we need two rfq literals for the sender and two for the receiver.
       */
      Message aMessage = (Message) aRef;
      generateMessageClauses(aSolver, aMessage);

      for (EObject anotherRef : theProtocol.getReferences()) {
        Message anotherMessage = (Message) anotherRef;
          messageMessageClauses(aSolver, aMessage, anotherMessage);
      }
    }
    generateParameterClauses(aSolver, theProtocol);
  }
  
  private boolean generateIntegrityClauses(SATSolver aSolver, BSPL theProtocol) {
	List<ArrayList<SATLit>> competingMessages = getCompetingMessages(aSolver);
	
	if (!competingMessages.isEmpty()) {
	  List<ArrayList<SATLit>> allPairwiseClauses = generateAllPairwise(aSolver, competingMessages);
      for (ArrayList<SATLit> pairwiseClause : allPairwiseClauses) {
        SATLit[] params = pairwiseClause.toArray(new SATLit[pairwiseClause.size()]);
        this.addClause(params);
        Checker.logger.warn("Integrity clause: " + ProtocolUtils.stringify(pairwiseClause));
      }
      return true;
	}
	else
		return false;
  }

  private List<ArrayList<SATLit>> generateAllPairwise(SATSolver aSolver, List<ArrayList<SATLit>> competingMessages) {
	List<ArrayList<SATLit>> allPairwiseClauses = makePairwiseClauses(aSolver, competingMessages.get(0));
	List<ArrayList<SATLit>> newPairwiseClauses = new ArrayList<ArrayList<SATLit>>();

    for (int i = 1; i < competingMessages.size(); i++) {
      ArrayList<SATLit> messageLiterals = competingMessages.get(i);
      List<ArrayList<SATLit>> pairwiseClauses = makePairwiseClauses(aSolver, messageLiterals);
	  for (ArrayList<SATLit> oldClause : allPairwiseClauses) {    	
	    for (ArrayList<SATLit> addedClause : pairwiseClauses) {
	  	  ArrayList<SATLit> newClause = new ArrayList<SATLit>();
	   	  newClause.addAll(oldClause);
	   	  newClause.addAll(addedClause);
	   	  newPairwiseClauses.add(newClause);
	    }
	  }
    allPairwiseClauses = newPairwiseClauses;
    }
    Checker.logger.warn("Pairwise clauses: " + ProtocolUtils.stringify(allPairwiseClauses));
	return allPairwiseClauses;
  }

  private List<ArrayList<SATLit>> getCompetingMessages(SATSolver aSolver) {
    List<ArrayList<SATLit>> competingMessages = new ArrayList<ArrayList<SATLit>>();
	for (Parameter p : outParamsToRolesToRefs.keySet()) {
      Collection<Message> messagesForParam = outParamsToRolesToRefs.getValues(p);
      if (messagesForParam.size() > 1) {
    	ArrayList<SATLit> messageLiterals = new ArrayList<SATLit>();
    	for (Message m : messagesForParam) {
    	  SATLit messageLiteral = makeLiteral(aSolver, m.getSender(), m, false);
    	  messageLiterals.add(messageLiteral);
    	}
    	competingMessages.add(messageLiterals); //TODO Remove this
      }
	}
    Checker.logger.warn("Competing Messages: " + ProtocolUtils.stringify(competingMessages));
	return competingMessages;
  }

  private List<ArrayList<SATLit>> makePairwiseClauses(SATSolver aSolver, ArrayList<SATLit> messageLiterals) {
	List<ArrayList<SATLit>> pairwiseClauses = new ArrayList<ArrayList<SATLit>>();
	for (SATLit messageParam : messageLiterals) {
	  ArrayList<SATLit> conjunct = new ArrayList<SATLit>();
	  for (SATLit mLit : messageLiterals) {
        if (mLit != messageParam) {
          conjunct.add(mLit);
        }
	  }
	  pairwiseClauses.add(conjunct);
    }
    Checker.logger.warn("makePairwiseClauses: " + ProtocolUtils.stringify(pairwiseClauses));
	return pairwiseClauses;
  }

  private void generateCompletionClauses(SATSolver aSolver, BSPL theProtocol) {
    for (Parameter p : paramsToRolesToRefs.keySet()) {
      if (isPublicOut(theProtocol, p)) {
        MapSet<Role, Message> roleMap = paramsToRolesToRefs.get(p);
  
        List<SATLit> outParamLiterals = new ArrayList<SATLit>();
        for (Role r: roleMap.keySet()) {
  
          for (Message m : roleMap.getValues(r)) {
            if (isMessageOut(m, p) && (r == m.getReceiver())) {
              SATLit roleParameterPos = makeLiteral(aSolver, r, p, false);
              outParamLiterals.add(roleParameterPos);
            }
          }
        }
        if (!outParamLiterals.isEmpty()) {
          SATLit[] params = outParamLiterals.toArray(new SATLit[outParamLiterals.size()]);
          this.addClause(params);
          Checker.logger.warn("Completion clause: " + ProtocolUtils.stringify(outParamLiterals));
        }
      }
    }
  }

  private void generateParameterClauses(SATSolver aSolver, BSPL theProtocol) {
    for (Role r: rolesToParamsToRefs.keySet()) {
      MapSet<Parameter, Message> paramMap = rolesToParamsToRefs.get(r);
      for (Parameter p : paramMap.keySet()) {
        SATLit roleParameterPos = makeLiteral(aSolver, r, p, false);
        SATLit roleParameterNeg = makeLiteral(aSolver, r, p, true);
        
        List<SATLit> togethers = new ArrayList<SATLit>();
        togethers.add(roleParameterNeg);

        for (Message m : paramMap.getValues(p)) {
          SATLit roleMessagePos = makeLiteral(aSolver, r, m, false);
          SATLit paramUponMessageRole = aSolver.allTogethers().makeTogetherLiteral(aSolver, roleMessagePos, roleParameterPos);
          togethers.add(paramUponMessageRole);
        }

        SATLit[] togs = togethers.toArray(new SATLit[togethers.size()]);
        this.addClause(togs);
        Checker.logger.warn("Parameter from message: " + ProtocolUtils.stringify(togethers));
      }
    }
  }

  private boolean isMessageOut(Message m, Parameter p) {
    for (ParamRef pRef : m.getParams()) {
      if (p == pRef.getParam() && (pRef.getAdornment() == kAdornment.OUT))
        return true;
    }   
    return false;      
  }

  private boolean isPublicOut(BSPL theProtocol, Parameter p) {
    for (ParamDecl pDecl : theProtocol.getPublicParams()) {
      if (p == pDecl.getParam() && (pDecl.getAdornment() == kAdornment.OUT))
        return true;
    }   
    return false;      
   }

  private void messageMessageClauses(SATSolver aSolver, Message first, Message second) {
	Role firstSender = first.getSender();
	Role secondSender = second.getSender();

	if (firstSender == secondSender) {
	  SATLit firstPosS = makeLiteral(aSolver, firstSender, first, false);
	  SATLit secondPosS = makeLiteral(aSolver, secondSender, second, false);
	  if (firstPosS.getNumber() < secondPosS.getNumber()) {
		addNotTogetherClause(aSolver, firstPosS, secondPosS);
//		SATLit firstPosR = makeLiteral(aSolver, first.getReceiver(), first, false);
//		SATLit secondPosR = makeLiteral(aSolver, second.getReceiver(), second, false);
//		addNotTogetherClause(aSolver, firstPosR, secondPosR);
	  }
	}
  }

  private void addNotTogetherClause(SATSolver aSolver, SATLit firstPos, SATLit secondPos) {
    SATLit togetherFirstSecond = aSolver.allTogethers().makeTogetherLiteral(aSolver, firstPos, secondPos);
    int[] notTogether = {-togetherFirstSecond.getNumber()};
    aSolver.addClause(notTogether);
    Checker.logger.warn("NEGATING: (" + togetherFirstSecond.getName() + ")");
  }

  /* This method not only generates the clauses for each message, but also builds the maps used by
   * subsequent methods.
   */
  private void generateMessageClauses(SATSolver aSolver, Message m) {
    SATLit senderMessagePos = makeLiteral(aSolver, m.getSender(), m, false);
    SATLit senderMessageNeg = makeLiteral(aSolver, m.getSender(), m, true);
    SATLit receiverMessagePos = makeLiteral(aSolver, m.getReceiver(), m, false);
    SATLit receiverMessageNeg = makeLiteral(aSolver, m.getReceiver(), m, true);

    causalitySenderToReceiver(aSolver, senderMessagePos, receiverMessagePos, receiverMessageNeg);
    
    EList<Parameter> inParams = ProtocolUtils.selectParametersInRef(m, kAdornment.IN);
    for (Parameter p : inParams) {
      storeRoleMap(m.getSender(), m, p);
      storeRoleMap(m.getReceiver(), m, p);
      senderInParam(aSolver, m, senderMessagePos, senderMessageNeg, p);
      receiverInOutParam(aSolver, m, receiverMessagePos, receiverMessageNeg, p);
    }
    
    EList<Parameter> outParams = ProtocolUtils.selectParametersInRef(m, kAdornment.OUT);
    for (Parameter p : outParams) {
      storeOutMap(m, p);
      storeRoleMap(m.getSender(), m, p);
      storeRoleMap(m.getReceiver(), m, p);
      storeParameterMap(m.getReceiver(), m, p);
      senderOutParam(aSolver, m, senderMessagePos, senderMessageNeg, p);
      receiverInOutParam(aSolver, m, receiverMessagePos, receiverMessageNeg, p);
    } 
    
    EList<Parameter> nilParams = ProtocolUtils.selectParametersInRef(m, kAdornment.NIL);
    for (Parameter p : nilParams) {
      senderNilParam(aSolver, m, senderMessagePos, senderMessageNeg, p);
      /* Notice there is no effect on the receiver of an incoming NIL p */
    }
  }

  /* This method is used for senders of messages wherein the parameter occurs 
   * adorned OUT. It stores the information we need to construct integrity clauses,
   * essentially to make sure that no two messages may both occur if they include
   * the same OUT parameter. */
  private void storeOutMap(Message m, Parameter p) {
	outParamsToRolesToRefs.insertValue(p, m);	
}

  /* This method is used for senders and receivers of messages wherein the parameter 
   * occurs adorned IN or OUT. */
  private void storeRoleMap(Role r, Message m, Parameter p) {
	rolesToParamsToRefs.storeValueInNestedMap(r, p, m);
  }

  /* This method is used only for receivers of messages wherein the parameter occurs 
   * adorned OUT, which is what we need for the completion clauses. */
  private void storeParameterMap(Role r, Message m, Parameter p) {
	paramsToRolesToRefs.storeValueInNestedMap(p, r, m);
    Checker.logger.warn("storeParameterMap: Role r, Message m, Parameter p= " + r +" " + m + " "+ p +" ");
  }

  /* For the receiver there is _no_ distinction between an IN and an OUT parameter. It must come to
   * know the parameter: either prior to receiving the message or together with receiving the message.
   * (-m + p.m + m*p)
   */
  private void receiverInOutParam(SATSolver aSolver, Message m, SATLit receiverMessagePos, SATLit receiverMessageNeg,
      Parameter p) {
    SATLit receiverParameterPos = makeLiteral(aSolver, m.getReceiver(), p, false);
    SATLit paramBeforeMessage = aSolver.allSequences().makeSequenceLiteral(aSolver, receiverParameterPos, receiverMessagePos);
    SATLit paramUponMessage = aSolver.allTogethers().makeTogetherLiteral(aSolver, receiverMessagePos, receiverParameterPos);
    aSolver.addClause(receiverMessageNeg, paramBeforeMessage, paramUponMessage);
    Checker.logger.warn("IN: (" + receiverMessageNeg.getName() + " + " +paramBeforeMessage.getName() + " + " +paramUponMessage.getName() + ")");
  }

  /* Capturing causality.
   * If a message is received, it must have been sent before.
   * (-receiver:m + sender:m.receiver:m)
   */
  private void causalitySenderToReceiver(SATSolver aSolver, SATLit senderMessagePos, SATLit receiverMessagePos, SATLit receiverMessageNeg) {
    SATLit sendBeforeReceive = aSolver.allSequences().makeSequenceLiteral(aSolver, senderMessagePos, receiverMessagePos);
    aSolver.addClause(receiverMessageNeg, sendBeforeReceive);
    Checker.logger.warn("Causality: (" + receiverMessageNeg.getName() + " + " +sendBeforeReceive.getName() + ")");
  }

  /* NIL p must _not_ be known to the sender _any time prior_ to m.
   * (-m + -p + m.p)
   */
  private void senderNilParam(SATSolver aSolver, Message m, SATLit senderMessagePos, SATLit senderMessageNeg, Parameter p) {
    SATLit senderParameterPos = makeLiteral(aSolver, m.getSender(), p, false);
    SATLit senderParameterNeg = makeLiteral(aSolver, m.getSender(), p, true);
    SATLit messageBeforeParam = aSolver.allSequences().makeSequenceLiteral(aSolver, senderMessagePos, senderParameterPos);
    aSolver.addClause(senderMessageNeg, senderParameterNeg, messageBeforeParam);
    Checker.logger.warn("NIL: (" + senderMessageNeg.getName() + " + " +messageBeforeParam.getName() + ")");
  }

  /* OUT p is known _immediately upon_ m to the sender.
   * (-m + m*p)
   */ 
  private void senderOutParam(SATSolver aSolver, Message m, SATLit senderMessagePos, SATLit senderMessageNeg, Parameter p) {
    SATLit senderParameterPos = makeLiteral(aSolver, m.getSender(), p, false);
    SATLit paramUponMessage = aSolver.allTogethers().makeTogetherLiteral(aSolver, senderMessagePos, senderParameterPos);
    aSolver.addClause(senderMessageNeg, paramUponMessage);
    Checker.logger.warn("OUT: (" + senderMessageNeg.getName() + " + " +paramUponMessage.getName() + ")");
  }

  /* IN p means that p become known to the sender _any time prior_ to m.
   * (-m + p.m)
   */
  private void senderInParam(SATSolver aSolver, Message m, SATLit senderMessagePos, SATLit senderMessageNeg, Parameter p) {
    SATLit senderParameterPos = makeLiteral(aSolver, m.getSender(), p, false);
    SATLit paramBeforeMessage = aSolver.allSequences().makeSequenceLiteral(aSolver, senderParameterPos, senderMessagePos);
    aSolver.addClause(senderMessageNeg, paramBeforeMessage);
    Checker.logger.warn("IN: (" + senderMessageNeg.getName() + " + " +paramBeforeMessage.getName() + ")");
  }

  private SATLit makeLiteral(SATSolver aSolver, Role r, Message m, boolean negated) {
    return aSolver.allLiterals().makeLiteral(aSolver, msgName(m, r.getName()), negated);
  }

  private SATLit makeLiteral(SATSolver aSolver, Role r, Parameter p, boolean negated) {
    return aSolver.allLiterals().makeLiteral(aSolver, paramName(p, r.getName()), negated);
  }
  
  private String msgName(Message m, String roleName) {
    return roleName + ":" + "m_" + m.getName();
  }

  private String paramName(Parameter p, String roleName) {
    return roleName + ":" + "p_" + p.getName();
  }

}
