package com.rutup.employeeDAO;

import java.sql.SQLException;
import java.util.List;

import com.rutup.employeeDTO.EmployeeDTO;

public interface EmployeeDAO {
	
	abstract void addEmployee(EmployeeDTO employeeDTO) throws SQLException;
	abstract List<EmployeeDTO> getEmployees() throws SQLException;
	abstract EmployeeDTO updateEmployeeId(Integer id,Integer newId) throws SQLException;
	abstract EmployeeDTO updateEmployeeName(Integer id, String newName) throws SQLException;
	abstract EmployeeDTO getEmployee(Integer id) throws SQLException;
	abstract void deleteEmployee(Integer id) throws SQLException;

}
