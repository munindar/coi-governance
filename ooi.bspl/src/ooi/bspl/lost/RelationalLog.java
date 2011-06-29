package ooi.bspl.lost;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class RelationalLog {

    private static final String CREATE_DATABASE = "CREATE DATABASE IF NOT EXISTS ";
	private static final String DBMS = "jdbc:mysql://localhost:3306/";
    private static final String driver = "com.mysql.jdbc.Driver";

	public static void main(String[] args) {
	  System.out.println("MySQL Connect Example.");
	  Connection conn = null;
	  String buyerDBName = "Buyer";
	  String userName = "root"; 
	  String password = "rootpass";

	  try {
		Class.forName(driver).newInstance();
		conn = DriverManager.getConnection (DBMS + buyerDBName, userName, password);
		System.out.println("Connected to the MySQL installation");

		Statement stmt = conn.createStatement();
		 
		stmt.executeUpdate("INSERT INTO " + "rfq" + " VALUES (" + "'Ident-1', 'Itemtype-2'" +")");
		 
		System.out.println("Created the database");

		conn.close();
		System.out.println("Disconnected from database");
	  } catch (Exception e) {
		e.printStackTrace();
	  }
	  }
	}

