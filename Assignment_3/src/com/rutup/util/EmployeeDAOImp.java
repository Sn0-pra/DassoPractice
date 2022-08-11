package com.rutup.util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

import com.rutup.employeeDTO.EmployeeDTO;

public class EmployeeDAOImp implements EmployeeDAO{

	
	@Override
	public void addEmployee(EmployeeDTO employeeDTO) throws SQLException, IOException{
		String employeeName = employeeDTO.getEmployeeName();
		Integer employeeId = employeeDTO.getEmployeeId();
		String sql = " insert into employee(employee_id,employee_name) values(?,?);"; 
		
		Connection con = dbConnection.getConnection();
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, employeeId);
		st.setString(2, employeeName);
		
		st.executeUpdate();
		con.close();
	}

	@Override
	public List<EmployeeDTO> getEmployees() throws SQLException, IOException{
		String sql = " select * from employee;";
		
		Connection con = dbConnection.getConnection();
	
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery(sql);
		ResultSetMetaData rsmd = rs.getMetaData();
		
		int count = rsmd.getColumnCount();
		
		while(rs.next()) {
			for (int i = 1; i <= count; i++) {
				System.out.println(rsmd.getColumnLabel(i) + " -> " + rs.getObject(i));
			}
		}
		
		con.close();
		
		return null;
	}

	@Override
	public EmployeeDTO updateEmployeeId(Integer id, Integer newId) throws SQLException, IOException{
	
		String sql = " update employee set employee_id = ? where employee_id = ?;";
		
		Connection con = dbConnection.getConnection(); 

		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, newId);
		st.setInt(2, id);
		st.executeUpdate();
		
		con.close();
		return null;
		
	}

	@Override
	public EmployeeDTO updateEmployeeName(Integer id, String newName) throws SQLException, IOException{
	
		String sql = " update employee set employee_name = ? where employee_id = ?;";
		
		Connection con = dbConnection.getConnection();

		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, newName);
		st.setInt(2, id);
		st.executeUpdate();
		
		con.close();
		return null;
		
	}

	@Override
	public EmployeeDTO getEmployee(Integer id) throws SQLException, IOException {

		String sql = " select * from employee where employee_id = ?;";
		
		Connection con = dbConnection.getConnection();

		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, id);
		ResultSet rs = st.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		
		int count = rsmd.getColumnCount();
		
		while(rs.next()) {
			for (int i = 1; i <= count; i++) {
				System.out.println(rsmd.getColumnLabel(i) + " -> " +rs.getObject(i));
			}
		}
		
		con.close();
		
		return null;
	}

	@Override
	public void deleteEmployee(Integer id) throws SQLException, IOException{

		String sql = " delete from employee where employee_id = ?;";
		
//		dbConnection connectionDb = new dbConnection();
		Connection con = dbConnection.getConnection(); 

		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, id);
		st.executeUpdate();
		
		con.close();
		
	}
	
}
