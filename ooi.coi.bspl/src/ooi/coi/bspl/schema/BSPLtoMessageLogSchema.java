package ooi.coi.bspl.schema;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import ooi.coi.bspl.bSPL.BSPL;
import ooi.coi.bspl.bSPL.Message;
import ooi.coi.bspl.bSPL.ParamDecl;
import ooi.coi.bspl.bSPL.ParamRef;
import ooi.coi.bspl.bSPL.Parameter;
import ooi.coi.bspl.bSPL.Role;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

import com.google.common.collect.Iterators;
import com.healthmarketscience.sqlbuilder.dbspec.basic.DbColumn;
import com.healthmarketscience.sqlbuilder.dbspec.basic.DbSchema;
import com.healthmarketscience.sqlbuilder.dbspec.basic.DbSpec;
import com.healthmarketscience.sqlbuilder.dbspec.basic.DbTable;

public class BSPLtoMessageLogSchema extends WorkflowComponentWithSlot {
  private static final String PRIMARY_PREF = "PK_";

  private static final Integer DEFAULT_TYPE_LENGTH = 32;

  private static final String DEFAULT_TYPE = "varchar";

  private Map<String, RoleMessageLogSchema> roleSchemas = new HashMap<String, RoleMessageLogSchema>();

  @Override
  public void invoke(IWorkflowContext ctx) {
    Resource resource = (Resource) ctx.get(this.getSlot());

    Iterator<Object> contents = EcoreUtil.getAllContents(resource, true);
    Iterator<BSPL> iter = Iterators.filter(contents, BSPL.class);
    BSPL theProtocol = Iterators.getOnlyElement(iter);
    this.generateLogSchemas(theProtocol);

    ctx.put(this.getSlot(), roleSchemas);
  }

  // Only works for one protocol
  private void generateLogSchemas(BSPL theProtocol) {
    DbSpec dbSpec = new DbSpec();

    for (EObject aRef : theProtocol.getReferences()) {
      Message aMessage = (Message) aRef;

      Role sender = aMessage.getSender();
      this.makeMessageTable(theProtocol, dbSpec, sender, aMessage);

      Role receiver = aMessage.getReceiver();
      this.makeMessageTable(theProtocol, dbSpec, receiver, aMessage);
    }
  }

  private void makeMessageTable(BSPL theProtocol, DbSpec dbSpec, Role aRole, Message aMessage) {
    DbSchema roleSchema = this.findOrMakeSchema(dbSpec, aRole.getName());
    DbTable messageTable = this.findOrMakeTable(roleSchema, aRole.getName(), aMessage.getName());
    EList<ParamRef> allParams = aMessage.getParams();
    ArrayList<String> keyColumnNames = new ArrayList<String>();

    Iterator<ParamRef> paramIterator = allParams.iterator();
    while (paramIterator.hasNext()) {
      ParamRef pRef = paramIterator.next();
      Parameter param = pRef.getParam();
      this.findOrMakeColumn(messageTable, param.getName());
      if (this.isDeclaredKey(theProtocol, pRef)) {
        keyColumnNames.add(param.getName());
      }
    }

    messageTable.primaryKey(BSPLtoMessageLogSchema.PRIMARY_PREF + aMessage.getName(),
        keyColumnNames.toArray(new String[keyColumnNames.size()]));
  }

  private boolean isDeclaredKey(BSPL theProtocol, ParamRef pRef) {
    if (pRef.isIsKey()) return true;

    Iterator<ParamDecl> paramIterator = theProtocol.getPublicParams().iterator();
    while (paramIterator.hasNext()) {
      ParamDecl pDecl = paramIterator.next();
      if (pDecl.getParam() == pRef.getParam()) return pDecl.isIsKey();
    }
    return false;
  }

  private DbSchema findOrMakeSchema(DbSpec dbSpec, String roleName) {
    DbSchema foundSchema = dbSpec.findSchema(roleName);
    if (foundSchema == null) {
      foundSchema = dbSpec.addSchema(roleName);
      RoleMessageLogSchema roleSchemaEntry = new RoleMessageLogSchema(roleName);
      roleSchemas.put(roleName, roleSchemaEntry);
    }
    return foundSchema;
  }

  private DbTable findOrMakeTable(DbSchema roleSchema, String roleName, String messageName) {
    DbTable foundTable = roleSchema.findTable(messageName);
    if (foundTable == null) {
      foundTable = roleSchema.addTable(messageName);
      RoleMessageLogSchema roleSchemaEntry = roleSchemas.get(roleName);
      roleSchemaEntry.add(foundTable);
    }
    return foundTable;
  }

  private DbColumn findOrMakeColumn(DbTable messageTable, String columnName) {
    DbColumn foundColumn = messageTable.findColumn(columnName);
    if (foundColumn == null) {
      foundColumn = messageTable.addColumn(columnName, BSPLtoMessageLogSchema.DEFAULT_TYPE,
          BSPLtoMessageLogSchema.DEFAULT_TYPE_LENGTH);
      foundColumn.notNull();
    }
    return foundColumn;
  }
}
