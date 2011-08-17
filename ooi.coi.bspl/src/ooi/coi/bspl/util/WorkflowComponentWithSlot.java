package ooi.coi.bspl.util;

import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowComponent;
import org.eclipse.emf.mwe2.runtime.workflow.IWorkflowContext;

public abstract class WorkflowComponentWithSlot implements IWorkflowComponent {

  @Override
  public void invoke(IWorkflowContext arg0) {

  }

  @Override
  public void postInvoke() {

  }

  @Override
  public void preInvoke() {

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
