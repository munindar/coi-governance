package ooi.coi.bspl.tests.agent;

public abstract class Agent implements Runnable {

  private String agentName;
  private Class actualAgent;
  
  public Agent() {
    
  }
  
  public Agent(String aName) {
    agentName = aName;
    try {
      actualAgent = Class.forName(aName);
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  

}
