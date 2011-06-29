package ooi.bspl.schema;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Map;


import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

import com.healthmarketscience.sqlbuilder.dbspec.basic.DbTable;

public class SQLWriter extends WorkflowComponentWithSlot {

  private static final String CREATE_DATABASE = "CREATE DATABASE IF NOT EXISTS ";
  private static final String USE_DATABASE = "USE ";
private static final String SEMICOLON = ";";
  private String uriPrefix;
  private String uriSuffix;
  
  public void invoke(IWorkflowContext ctx) {
	@SuppressWarnings("unchecked")
	Map<String, RoleMessageLogSchema> roleSchemas = 
		(Map<String, RoleMessageLogSchema>) ctx.get(getSlot());
	
	for (String roleName : roleSchemas.keySet()) {
      try {
        URI uri = URI.createFileURI(getUriPrefix() + roleName + getUriSuffix());
        FileOutputStream outFile = new FileOutputStream(uri.toFileString());
        PrintStream pStream = new PrintStream(outFile);
        
        pStream.println(CREATE_DATABASE + roleName + SEMICOLON);
        pStream.println(USE_DATABASE + roleName + SEMICOLON);

        RoleMessageLogSchema roleSchemaEntry = roleSchemas.get(roleName);
        for (DbTable roleTable : roleSchemaEntry.getRoleTables()) {
          SafeCreateTableQuery tableSpec = new SafeCreateTableQuery(roleTable, true); 
          String tableAsSQL = tableSpec.validate().toString(); 
          pStream.print(tableAsSQL);  
          pStream.println(SEMICOLON);
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
