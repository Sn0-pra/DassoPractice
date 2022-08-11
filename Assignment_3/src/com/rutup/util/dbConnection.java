package com.rutup.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class dbConnection {


//	public Connection con = null;
//	
//	
//	public Connection getCon() {
//		return con;
//	}
//
//	public void setCon(Connection con) {
//		this.con = con;
//	}

//	public dbConnection()
			
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
		
//		static {
//
//
//		}
		
		public static Connection getConnection() throws SQLException, IOException {
				
				String url = null ;
				String username = null ;
				String password = null ;
				String database = null ;
				Properties dbProps = new Properties();
					
				InputStream fr;
					try {
						fr = dbConnection.class.getResourceAsStream("db.properties");
						dbProps.load(fr);
						url = dbProps.getProperty("url");
						username = dbProps.getProperty("username");
						password = dbProps.getProperty("password");
						database = dbProps.getProperty("database");
						
						
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
					
				
//				Driver driver = new com.mysql.cj.jdbc.Driver();
//				DriverManager.registerDriver(driver);
				Connection con = DriverManager.getConnection(url + "/" + database, username, password);
				return con;
				
		}

	
}
