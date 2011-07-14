package ooi.coi.bspl.lost;

import java.io.IOException;
import java.util.List;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;
import com.rabbitmq.tools.json.JSONReader;
import com.rabbitmq.tools.json.JSONWriter;

public class Communicator {

  private static final String HOST = "localhost";

  private String thisRole;
  private RelationalLog logLoST;

  ConnectionFactory cFactory;

  public Communicator(String me, RelationalLog log) {
    thisRole = me;
    logLoST = log;

    try {
      this.initialize();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void initialize() throws java.io.IOException {
    cFactory = new ConnectionFactory();
    cFactory.setHost(Communicator.HOST);
  }

  public boolean send(String receiverName, List<String> messageContents) {

    try {
    Connection connection = cFactory.newConnection();
    Channel channel = connection.createChannel();

    JSONWriter jw = new JSONWriter();
    String message = jw.write(messageContents);

   
    channel.queueDeclare(receiverName, false, false, false, null);
    channel.basicPublish("", receiverName, null, message.getBytes());
    System.out.println("[x] Sent '" + message + "' to " + receiverName);

    channel.close();
    connection.close();
    } catch (java.io.IOException e) {
      return false;
    }
    return true;
  }

  public void receive() throws java.io.IOException, java.lang.InterruptedException {

    Connection connection = cFactory.newConnection();
    Channel channel = connection.createChannel();

    channel.queueDeclare(thisRole, false, false, false, null);
    System.out.println(" [*] Waiting for messages. To exit press CTRL+C");

    QueueingConsumer consumer = new QueueingConsumer(channel);
    channel.basicConsume(thisRole, true, consumer);

    while (true) {
      QueueingConsumer.Delivery delivery = consumer.nextDelivery();
      String message = new String(delivery.getBody());
      System.out.println("[x] Received '" + message + "'");

      JSONReader jr = new JSONReader();
      Object incoming = jr.read(message);
      System.out.println("[x] Incoming '" + incoming.toString() + "'");

      @SuppressWarnings("unchecked")
      List<String> messageContents = (List<String>) incoming;
      
      System.out.print("[x] Received messageContents ");
      
      for (String elem : messageContents) {
        System.out.print(elem + ", ");
      }
      System.out.println();
      
      logLoST.insertMessage(messageContents);
    }

  }

}
