package Utilities;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.Statement;


public class DataBaseUtility {
	Connection con;
	
	public void getDBconnection(String url,String username,String password) throws Exception {
	try {
		Driver driver = new com.mysql.jdbc.Driver();
		
		DriverManager.registerDriver(driver);
		
	   con = DriverManager.getConnection(url,username,password);
	}
	catch(Exception e) {
	}
	}
	
	public void getDBconnection() throws Exception {
		try {
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			
		   con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_demo","root","Lenevo@123");
		}
		catch(Exception e) {
		}
		}
	
	public void closeDbconnection() {
		try {
		con.close();
		}
		catch(Exception e) {
		}
	}
	
	public ResultSet executeSelectQuery(String query) {
		ResultSet result=null;
		try {
		Statement stmt=con.createStatement();
		result = stmt.executeQuery(query);
		}
		catch(Exception e) {
		}
		return result;
	}
	
	public int executeNonSelectQuery(String query) {
		int result=0;
		try {
		Statement stmt=con.createStatement();
		result = stmt.executeUpdate(query);
		}
		catch(Exception e) {
		}
		return result;
	}		
	}	
	
	

