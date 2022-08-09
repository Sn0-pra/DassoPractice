package com.rutup.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class dbConnection {


	public Connection con = null;
	
	
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

//	public dbConnection() {
			
//			try {
//			
//				Driver driver = new com.mysql.cj.jdbc.Driver();
//				DriverManager.registerDriver(driver);
//				
//				String url = "jdbc:mysql://localhost:3306/rutuja";
//				con = DriverManager.getConnection(url,"root","root");
//			
//			} catch (SQLException e) {
//				
//				e.printStackTrace();
//			}
		
		static {


		}
		
		public static Connection getConnection() {
				
				String url = null ;
				String username = null ;
				String password = null ;
				String database = null ;
				Properties dbProps = new Properties();
					
					FileReader fr = new FileReader("db.properties");
					dbProps.load(fr);
					url = dbProps.getProperty("url");
					username = dbProps.getProperty("username");
					password = dbProps.getProperty("password");
					database = dbProps.getProperty("database"); 
					
				
				Driver driver = new com.mysql.cj.jdbc.Driver();
				DriverManager.registerDriver(driver);
				Connection con = DriverManager.getConnection(url + "/" + database, username, password);
				return con;
				
		}

	
}
