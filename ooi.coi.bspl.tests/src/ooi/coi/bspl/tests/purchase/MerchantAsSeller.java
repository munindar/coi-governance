package ooi.coi.bspl.tests.purchase;

import java.util.ArrayList;
import java.util.Arrays;

import ooi.coi.bspl.lost.LoST;
import ooi.coi.bspl.tests.agent.Agent;

public class MerchantAsSeller extends Agent {

  public MerchantAsSeller(String aName) {
    super(aName);
    // TODO Auto-generated constructor stub
  }

  public void run() {
    // TODO Auto-generated method stub

  }

  /**
   * @param args
   */
  public static void main(String[] args) {
    LoST newLoST = new LoST("Seller");
    try {
      String[] msg = { "quote", "ID7", "Item7a", "$13" };
      ArrayList<String> msgList = new ArrayList<String>(Arrays.asList(msg));

      newLoST.send("Buyer", msgList);

    } catch (Exception e) {
      e.printStackTrace();

  }
}
}