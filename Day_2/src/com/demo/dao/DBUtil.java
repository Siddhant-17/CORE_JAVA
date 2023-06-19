package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	private static Connection con=null;
	public static Connection getConnection() {
		
		
		try {
		
		if(con==null) {
		//register driver
		
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			//get connection

			String url="jdbc:mysql://192.168.10.150:3306/dac40?useSSL=false";
			con=DriverManager.getConnection(url,"dac40","welcome");
			
			if(con!=null) {
				System.out.println("Connection done");
			}
			
			return con;
			
		} 
		}catch (SQLException e) {
						e.printStackTrace();
						
		}	
	
		return null;
	}
	
	
	
	
	
	
	
	

}
