package com.n2s.StrutsMiniProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoginDao {
	static final String JDBC_DRIVER= "com.mysql.jdbc.Driver";
	static final String URL = "jdbc:mysql://localhost:3306/admin";
	static final String USER_NAME = "root"; 
	static final String PASSWORD = "root";
	
	private Connection conn = null;
	
	public Connection DBConnection(){
		try {
			Class.forName(JDBC_DRIVER);
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			return conn = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void DBDisconnect(){
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
