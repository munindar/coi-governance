package ooi.coi.bspl.schema.pyke;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Collection;

import ooi.coi.bspl.util.WorkflowComponentWithSlot;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

import com.ektimisi.precedence.util.MapSet;

public class PyKEWriter extends WorkflowComponentWithSlot {

  private String uriPrefix;
  private String uriSuffix;

  @Override
  public void invoke(IWorkflowContext ctx) {
    @SuppressWarnings("unchecked")
    MapSet<String, MessageLogTable> roleSchemas = (MapSet<String, MessageLogTable>) ctx.get(this.getSlot());

    for (String roleName : roleSchemas.keySet()) {
      try {
        URI uri = URI.createFileURI(this.getUriPrefix() + roleName + this.getUriSuffix());
        FileOutputStream outFile = new FileOutputStream(uri.toFileString());
        PrintStream pStream = new PrintStream(outFile);

        Collection<MessageLogTable> roleTables = roleSchemas.getValues(roleName);
        for (MessageLogTable roleTable : roleTables) {
          pStream.print(roleTable.toPyKE());
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
