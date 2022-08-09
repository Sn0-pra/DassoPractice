package com.rutup.employeeDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;

import com.rutup.employeeDTO.EmployeeDTO;
import com.rutup.util.dbConnection;

public class EmployeeDAOImp implements EmployeeDAO{

	
	@Override
	public void addEmployee(EmployeeDTO employeeDTO) throws SQLException {
		String employeeName = employeeDTO.getEmployeeName();
		String sql = " insert into employee(employee_name) values(?);"; 
		
		Connection con = dbConnection.getConnection();
		
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, employeeName);
		
		st.executeUpdate();
		con.close();
	}

	@Override
	public List<EmployeeDTO> getEmployees() throws SQLException {
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
	public EmployeeDTO updateEmployeeId(Integer id, Integer newId) throws SQLException {
	
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
	public EmployeeDTO updateEmployeeName(Integer id, String newName) throws SQLException {
	
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
	public EmployeeDTO getEmployee(Integer id) throws SQLException {

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
	public void deleteEmployee(Integer id) throws SQLException {

		String sql = " delete from employee where employee_id = ?;";
		
//		dbConnection connectionDb = new dbConnection();
		Connection con = dbConnection.getConnection(); 

		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, id);
		st.executeUpdate();
		
		con.close();
		
	}
	
}
