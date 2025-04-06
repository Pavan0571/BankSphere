package bank.management.system;

import java.beans.Statement;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


public class Conn {
	
	
	Connection connection;
	java.sql.Statement statement;
	public Conn() {
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root", "Billaer@2002");
			statement = connection.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	}
}
