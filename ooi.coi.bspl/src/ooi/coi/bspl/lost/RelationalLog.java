package ooi.coi.bspl.lost;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.List;

public class RelationalLog {

  private static final String DBMS = "jdbc:mysql://localhost:3306/";
  private static final String DRIVER = "com.mysql.jdbc.Driver";
  private static final String USERNAME = "root";
  private static final String PASSWORD = "rootpass";

  private static final String PREFIX = "logSchemas/";
  private static final String SUFFIX = ".sql";
  private static final String INSERT = "INSERT INTO ";
  private static final String VALUES = " VALUES (";
  private static final String RPAREN = ")";
  private static final String COMMA = ",";
  private static final String QUOTE = "'";

  private Connection conn = null;
  private String dbName;

  public RelationalLog(String qName) {
    dbName = qName;
    try {
      Class.forName(RelationalLog.DRIVER).newInstance();
      conn = DriverManager.getConnection(RelationalLog.DBMS, RelationalLog.USERNAME, RelationalLog.PASSWORD);
      System.out.println("Connected to the MySQL installation");

      Statement initializeDB = conn.createStatement();

      FileReader sqlDMLfile = new FileReader(RelationalLog.PREFIX + dbName + RelationalLog.SUFFIX);
      BufferedReader sqlDMLbuffer = new BufferedReader(sqlDMLfile);

      String stmt;
      while ((stmt = sqlDMLbuffer.readLine()) != null) {
        initializeDB.addBatch(stmt);
        System.out.println("STMT: " + stmt);
      }

      int[] batchcounts = initializeDB.executeBatch();
      System.out.print("batchcounts= ");
      for (int batchcount : batchcounts) {
        System.out.print(batchcount + " ");
      }
      System.out.println();

      conn.close();
      System.out.println("Disconnected from the database");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void insertMessage(List<String> messageContents) {
    StringBuffer insertSQL = new StringBuffer();
    try {
      conn = DriverManager.getConnection(RelationalLog.DBMS + dbName, RelationalLog.USERNAME, RelationalLog.PASSWORD);

      Statement insertStmt = conn.createStatement();

      insertSQL.append(RelationalLog.INSERT);
      insertSQL.append(messageContents.get(0));
      insertSQL.append(RelationalLog.VALUES);

      insertSQL.append(RelationalLog.QUOTE + messageContents.get(1) + RelationalLog.QUOTE);

      for (int i = 2; i < messageContents.size(); i++) {
        insertSQL.append(RelationalLog.COMMA);
        insertSQL.append(RelationalLog.QUOTE + messageContents.get(i) + RelationalLog.QUOTE);
      }

      insertSQL.append(RelationalLog.RPAREN);
      System.out.println("Created an Insert statement " + "'" + insertSQL.toString() + "'");

      insertStmt.executeUpdate(insertSQL.toString());

      conn.close();
    } catch (SQLIntegrityConstraintViolationException integrityE) {
      System.out.println("Insert statement ignored as it would cause an integrity constraint violation");
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

}