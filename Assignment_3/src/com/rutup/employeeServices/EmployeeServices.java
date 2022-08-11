package com.rutup.employeeServices;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.rutup.employeeDTO.EmployeeDTO;

public abstract interface EmployeeServices{
	
	abstract EmployeeDTO addEmployee(Integer empId, String empName) throws SQLException, IOException;
	abstract List<EmployeeDTO> getAllEmployees() throws SQLException, IOException;
	abstract EmployeeDTO getEmployee(Integer id) throws SQLException, IOException;
	abstract EmployeeDTO updateEmployeeId(Integer id, Integer newId) throws SQLException, IOException;
	abstract EmployeeDTO updateEmployeeName(Integer id, String newName) throws SQLException, IOException;
	abstract void deleteEmployee(Integer id) throws SQLException, IOException;

}
