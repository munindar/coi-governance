package ooi.coi.bspl.schema;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public abstract class WorkflowComponentWithSlot implements IWorkflowComponent {

  @Override
  public void invoke(IWorkflowContext arg0) {
    // TODO Auto-generated method stub

  }

  @Override
  public void postInvoke() {
    // TODO Auto-generated method stub

  }

  @Override
  public void preInvoke() {
    // TODO Auto-generated method stub

  }

  // Copied from Xtext documentation
  private String slot = "model";

  public void setSlot(String slot) {
    this.slot = slot;
  }

  public String getSlot() {
    return slot;
  }

}
