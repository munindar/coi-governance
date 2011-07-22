package ooi.coi.bspl.schema;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public class BSPLReader extends WorkflowComponentWithSlot {
  // Lifted from the Xtext documentation
  private String uri;

  @Override
  public void invoke(IWorkflowContext ctx) {
    ResourceSet resourceSet = new ResourceSetImpl();
    URI fileURI = URI.createFileURI(uri);
    Resource resource = resourceSet.getResource(fileURI, true);
    ctx.put(this.getSlot(), resource);
  }

  public void setUri(String uri) {
    this.uri = uri;
  }

  public String getUri() {
    return uri;
  }
}
