package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
	Statement st;
	Connection conn;
	
	public boolean isAuthentictUser(String userName,String password){
		try{
			conn = Connector.connector();
			st = conn.createStatement();
			String sql = "SELECT * FROM `users` WHERE username = '"+userName+"' AND password = '"+password+"'"; 
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()){
				rs.close(); 
				return true;
			}
			else return false;
		      
		}catch(SQLException se){
			se.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(st!=null)conn.close();
			}catch(SQLException se){}
			try{
				if(conn!=null)conn.close();
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return false;
	}
}
