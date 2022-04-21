package com.alumne.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionJDBC {
	private static String db = "prova_java";
	private static String login = "admin";
	private static String password = "admin";
	private static String url = "jdbc:mysql://localhost/" + db;
	private static Connection connection;
	private static PreparedStatement statement = null;

	public ConnectionJDBC() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, login, password);
			if (connection != null) {
				//statement = connection.createStatement();
				System.out.println("Conexion a base de datos " + db + " correcta.");
			}
			else
			System.out.println("Conexion fallida.");
			
		} catch (SQLException e) {e.printStackTrace();}
		  catch (ClassNotFoundException e) {e.printStackTrace();}
		  catch (Exception e) {e.printStackTrace();}		
	}
	
	public PreparedStatement getPreparedStatement() {
		return statement;
	}
	
	public void setPreparedStatement(String query) {
		try {
			ConnectionJDBC.statement = connection.prepareStatement(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
