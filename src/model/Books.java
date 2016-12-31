package model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.swing.JOptionPane;

public class Books {

	Statement st;
	Connection conn;
	
	public boolean insertNewBook(Map<String,String> list){
		
		String authorName = list.get("authorName").toString();
		String bookName = list.get("bookName").toString();
		String publicationName = list.get("publicationName").toString();
		String bookEdition = list.get("bookEdition").toString();
		
		int noOfCopies = Integer.parseInt(list.get("noOfCopies").toString());
		
		Date date = new Date();
	  	DateFormat df = new SimpleDateFormat("dd/MM/yy");
	  	String currentdate = df.format(date);
	  	
	  	double price = Double.parseDouble(list.get("price").toString());
	  	
		try{
			conn = Connector.connector();
			st = conn.createStatement();
			String sql = "INSERT INTO `bookdetails`(`id`, `author`, `title`, `publication`, `edition`, `no_of_copies`, `date`, `price`, `status`) VALUES (null,'"+authorName+"','"+bookName+"','"+publicationName+"','"+bookEdition+"',"+noOfCopies+",'"+currentdate+"',"+price+",'Available')";
			st.execute(sql); 
			return true;
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
