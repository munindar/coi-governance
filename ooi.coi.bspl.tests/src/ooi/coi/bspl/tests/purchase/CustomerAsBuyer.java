package ooi.coi.bspl.tests.purchase;

import java.util.ArrayList;
import java.util.Arrays;

import ooi.coi.bspl.lost.LoST;
import ooi.coi.bspl.tests.agent.Agent;

public class CustomerAsBuyer extends Agent {

  public CustomerAsBuyer(String aName) {
    super(aName);
    // TODO Auto-generated constructor stub
  }

  public void run() {
    // TODO Auto-generated method stub
  }
  
  public static void main (String[] args) {
    
    LoST newLoST = new LoST("Buyer");
    try {
      String[] msg = { "rfq", "ID7", "Item7a" };
      ArrayList<String> msgList = new ArrayList<String>(Arrays.asList(msg));

      newLoST.send("Seller", msgList);

    } catch (Exception e) {
      e.printStackTrace();
 
    
  }

  
}
  
}
