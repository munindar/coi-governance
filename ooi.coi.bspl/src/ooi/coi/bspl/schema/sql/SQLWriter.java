package ooi.coi.bspl.schema.sql;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;

import ooi.coi.bspl.util.WorkflowComponentWithSlot;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

import com.healthmarketscience.sqlbuilder.dbspec.basic.DbTable;

public class SQLWriter extends WorkflowComponentWithSlot {

  private static final String SQL = ".sql";
  private static final String CREATE_DATABASE = "CREATE DATABASE IF NOT EXISTS ";
  private static final String USE_DATABASE = "USE ";
  private static final String SEMICOLON = ";";
  private String uriPrefix;
  private String uriSuffix;

  @Override
  public void invoke(IWorkflowContext ctx) {
    @SuppressWarnings("unchecked")
    Map<String, RoleMessageLogSchemaSQL> roleSchemas = (Map<String, RoleMessageLogSchemaSQL>) ctx.get(this.getSlot());

    for (String roleName : roleSchemas.keySet()) {
      try {
        URI uri = URI.createFileURI(this.getUriPrefix() + roleName + this.getUriSuffix());
        FileOutputStream outFile = new FileOutputStream(uri.toFileString());
        PrintStream pStream = new PrintStream(outFile);

        if (this.getUriSuffix().equalsIgnoreCase(SQL)) {
        	pStream.println(SQLWriter.CREATE_DATABASE + roleName + SQLWriter.SEMICOLON);
        	pStream.println(SQLWriter.USE_DATABASE + roleName + SQLWriter.SEMICOLON);
        }

        RoleMessageLogSchemaSQL roleSchemaEntry = roleSchemas.get(roleName);
        for (DbTable roleTable : roleSchemaEntry.getRoleTables()) {
          SQLCreateTable tableSpec = new SQLCreateTable(roleTable, true);
          String tableAsSQL = tableSpec.validate().toString();
          pStream.print(tableAsSQL);
          pStream.println(SQLWriter.SEMICOLON);
        }
      } catch (IOException e) {
        throw new WrappedException(e);
      }
    }
  }

  public void setUriPrefix(String uriPrefix) {
    this.uriPrefix = uriPrefix;
  }

  public String getUriPrefix() {
    return uriPrefix;
  }

  public void setUriSuffix(String uriSuffix) {
    this.uriSuffix = uriSuffix;
  }

  public String getUriSuffix() {
    return uriSuffix;
  }
}
