package br.com.muambyte.jdbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		 try {
			 
	         return DriverManager.getConnection(
	 "jdbc:mysql://localhost/muambyte", "root", "lima3236");
	     } catch (SQLException e) {
	         throw new RuntimeException(e);
	     }
		
	}

}
