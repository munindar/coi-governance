package ooi.coi.bspl.semantic;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.ektimisi.precedence.solver.AbstractLiteral;
import com.ektimisi.precedence.solver.PrecedenceSolver;

import ooi.coi.bspl.bSPL.BSPL;
import ooi.coi.bspl.bSPL.Message;
import ooi.coi.bspl.bSPL.Parameter;
import ooi.coi.bspl.bSPL.Role;


public class SolverFacade {

  private static Logger logger = Logger.getLogger(SolverFacade.class);

  private static final int NUMBER_OF_MODELS = 3;
  private static final String ROLE_SEPARATOR = "_";
  private static final String PARAMETER_PREFIX = "p_";
  private static final String MESSAGE_PREFIX = "m_";

  private PrecedenceSolver thePrecedenceSolver;
  private final List<AbstractLiteral[]> theClauses;

  SolverFacade() {
    thePrecedenceSolver = new PrecedenceSolver(null);
    theClauses = new ArrayList<AbstractLiteral[]>();
  }

  boolean solve(BSPL theProtocol, String uriPrefix, String graphVizFile) {
    boolean result = false;
    try {
      String fName = uriPrefix + theProtocol.getName() + "_"+ graphVizFile;
      logger.info("Protocol " + theProtocol.getName() + "'s model graph is in '" + fName + "'");
      result = thePrecedenceSolver.solve(NUMBER_OF_MODELS, fName);
    } catch (final Exception e) {
      logger.error(e.getMessage());
      e.printStackTrace();
    }
    return result;
  }

  void numberOfClauses(String msg) {
    logger.info("Currently " + theClauses.size() + " Precedence clauses: "+msg);
  }

  void loadSolver() {
    this.numberOfClauses("loadSolver");
    for (final AbstractLiteral[] aClause : theClauses)
      thePrecedenceSolver.addOneClause(aClause);
  }

  void assertClause(AbstractLiteral[] aClause) {
    theClauses.add(aClause);
  }

  void assertClause(List<AbstractLiteral> listClause) {
    final AbstractLiteral[] aClause = listClause.toArray(new AbstractLiteral[listClause.size()]);
    this.assertClause(aClause);
  }

  void assertLiteralsAsClause(AbstractLiteral... literals) {
    this.assertClause(literals);
  }

  AbstractLiteral makeLiteral(Role r, Message m, boolean negated) {
    return thePrecedenceSolver.makeLiteral(this.msgName(m, r.getName()), negated);
  }

  AbstractLiteral makeLiteral(Role r, Parameter p, boolean negated) {
    return thePrecedenceSolver.makeLiteral(this.paramName(p, r.getName()), negated);
  }

  AbstractLiteral makeLiteral(String prefix, Parameter p, boolean negated) {
    return thePrecedenceSolver.makeLiteral(this.paramName(p, prefix), negated);
  }

  private String msgName(Message m, String roleName) {
    return roleName + ROLE_SEPARATOR + MESSAGE_PREFIX + m.getName();
  }

  private String paramName(Parameter p, String roleName) {
    return roleName + ROLE_SEPARATOR + PARAMETER_PREFIX + p.getName();
  }

  AbstractLiteral makeSequenceLiteral(AbstractLiteral one, AbstractLiteral two) {
    return thePrecedenceSolver.makeSequenceLiteral(one, two);
  }

  AbstractLiteral makeTogetherLiteral(AbstractLiteral one, AbstractLiteral two) {
    return thePrecedenceSolver.makeTogetherLiteral(one, two);
  }

  AbstractLiteral getNegatedLiteral(AbstractLiteral literal) {
    return thePrecedenceSolver.getNegatedLiteral(literal);
  }
  
}
