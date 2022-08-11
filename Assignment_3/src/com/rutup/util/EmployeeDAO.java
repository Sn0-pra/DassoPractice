package com.rutup.util;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.rutup.employeeDTO.EmployeeDTO;

public interface EmployeeDAO {
	
	abstract void addEmployee(EmployeeDTO employeeDTO) throws SQLException, IOException;
	abstract List<EmployeeDTO> getEmployees() throws SQLException, IOException;
	abstract EmployeeDTO updateEmployeeId(Integer id,Integer newId) throws SQLException, IOException;
	abstract EmployeeDTO updateEmployeeName(Integer id, String newName) throws SQLException, IOException;
	abstract EmployeeDTO getEmployee(Integer id) throws SQLException, IOException;
	abstract void deleteEmployee(Integer id) throws SQLException, IOException;

}
