package com.rutup.employeeDAO;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
	
	Connection con = null;
	
	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public ConnectionDb() {
			
			try {
			
				Driver driver = new com.mysql.cj.jdbc.Driver();
				DriverManager.registerDriver(driver);
				
				String url = "jdbc:mysql://localhost:3306/rutuja";
				con = DriverManager.getConnection(url,"root","root");
			
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
	}

}
