package com.rutup.employeeServices;

import java.sql.SQLException;
import java.util.List;

import com.rutup.employeeDTO.EmployeeDTO;

public abstract interface EmployeeServices{
	
	abstract EmployeeDTO addEmployee(Integer empId, String empName) throws SQLException;
	abstract List<EmployeeDTO> getAllEmployees() throws SQLException;
	abstract EmployeeDTO getEmployee(Integer id) throws SQLException;
	abstract EmployeeDTO updateEmployeeId(Integer id, Integer newId) throws SQLException;
	abstract EmployeeDTO updateEmployeeName(Integer id, String newName) throws SQLException;
	abstract void deleteEmployee(Integer id) throws SQLException;

}
