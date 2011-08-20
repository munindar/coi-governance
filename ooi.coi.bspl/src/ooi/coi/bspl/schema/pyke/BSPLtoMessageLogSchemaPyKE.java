package ooi.coi.bspl.schema.pyke;

import java.util.Collection;
import java.util.Iterator;
import ooi.coi.bspl.bSPL.BSPL;
import ooi.coi.bspl.bSPL.Message;
import ooi.coi.bspl.bSPL.ParamDecl;
import ooi.coi.bspl.bSPL.ParamRef;
import ooi.coi.bspl.bSPL.Parameter;
import ooi.coi.bspl.bSPL.Role;
import ooi.coi.bspl.semantic.Checker;
import ooi.coi.bspl.util.WorkflowComponentWithSlot;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

import com.ektimisi.precedence.util.MapSet;
import com.google.common.collect.Iterators;

public class BSPLtoMessageLogSchemaPyKE extends WorkflowComponentWithSlot {

  private static Logger logger = Logger.getLogger(BSPLtoMessageLogSchemaPyKE.class);
  static {
    logger.setLevel(Level.INFO); // ALL < DEBUG < INFO < WARN < ERROR < FATAL < OFF
  }

  private MapSet<String, MessageLogTable> roleSchemas = new MapSet<String, MessageLogTable>();

  @Override
  public void invoke(IWorkflowContext ctx) {
    Resource resource = (Resource) ctx.get(this.getSlot());

    Iterator<Object> contents = EcoreUtil.getAllContents(resource, true);
    Iterator<BSPL> iter = Iterators.filter(contents, BSPL.class);
    BSPL theProtocol = Iterators.getOnlyElement(iter);
    this.generateLogSchemas(theProtocol);

    ctx.put(this.getSlot(), roleSchemas);
  }

  // Only works for one protocol at a time
  private void generateLogSchemas(BSPL theProtocol) {

    for (EObject aRef : theProtocol.getReferences()) {
      Message aMessage = (Message) aRef;

      Role sender = aMessage.getSender();
      this.makeMessageTable(theProtocol, sender, aMessage);

      Role receiver = aMessage.getReceiver();
      this.makeMessageTable(theProtocol, receiver, aMessage);
    }
  }

  private void makeMessageTable(BSPL theProtocol, Role aRole, Message aMessage) {
    MessageLogTable messageTable = this.findOrMakeTable(aRole.getName(), aMessage.getName());
    EList<ParamRef> allParams = aMessage.getParams();

    Iterator<ParamRef> paramIterator = allParams.iterator();
    while (paramIterator.hasNext()) {
      ParamRef pRef = paramIterator.next();
      Parameter param = pRef.getParam();
      messageTable.makeColumn(param.getName());
      if (this.isDeclaredKey(theProtocol, pRef)) {
    	  messageTable.makeKeyColumn(param.getName());
      }
    }
  }

  private MessageLogTable findOrMakeTable(String roleName, String messageName) {
    Collection<MessageLogTable> foundTables = roleSchemas.getValues(roleName);
    MessageLogTable foundTable = null;
    boolean found = false;
    Iterator<MessageLogTable> tableIterator = foundTables.iterator();
    while (!found && tableIterator.hasNext()) {
    	foundTable = tableIterator.next();
    	if (foundTable.getName().equalsIgnoreCase(messageName)) 
    		found = true;
    }
    if (!found) {
    	foundTable = new MessageLogTable(messageName);
      logger.info("Created table= " + foundTable + " of name= " + foundTable.getName() + " for role= " + roleName);
    	roleSchemas.insertValueUnique(roleName, foundTable);
    }
    return foundTable;
  }

  private boolean isDeclaredKey(BSPL theProtocol, ParamRef pRef) {
    if (pRef.isIsKey()) return true;

    for (ParamDecl pDecl : theProtocol.getPublicParams()) {
      if (pDecl.getParam() == pRef.getParam()) return pDecl.isIsKey();
    }
    return false;
  }

}
