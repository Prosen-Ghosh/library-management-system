package model;

import java.sql.*;

public class Connector {
	   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost/lms";

	   static final String USERNAME = "root";
	   static final String PASSWORD = "root";
	   static Connection conn = null;
	public static Connection connector(){
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
		}catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
		return conn;
	}
}
