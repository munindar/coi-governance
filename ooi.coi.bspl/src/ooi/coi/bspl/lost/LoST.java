package ooi.coi.bspl.lost;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoST {

  private String agentName;
  private RelationalLog logLoST = null;
  private Communicator communicator = null;

  public LoST(String qName) {
    agentName = qName;
    logLoST = new RelationalLog(agentName);
    communicator = new Communicator(agentName, logLoST);
  }

  public void send(String receiverName, List<String> messageContents) throws IOException {
    System.out.println("LoST send");

    logLoST.insertMessage(messageContents);

    communicator.send(receiverName, messageContents);
  }

  /* Main to test */
  public static void main(String[] args) {
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
