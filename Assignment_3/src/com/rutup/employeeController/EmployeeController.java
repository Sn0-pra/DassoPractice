package com.rutup.employeeController;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.rutup.employeeDTO.EmployeeDTO;
import com.rutup.util.EmployeeDAOImp;

public class EmployeeController {
	
	EmployeeDAOImp employeeDAOImp = new EmployeeDAOImp();

	public void addEmployee(EmployeeDTO employeeDTO) throws SQLException, IOException {
		
		employeeDAOImp.addEmployee(employeeDTO);
		
	}

	public List<EmployeeDTO> getEmployees() throws SQLException, IOException {
		
		List<EmployeeDTO> employeeList = employeeDAOImp.getEmployees();
		return employeeList;
	
	}

	public EmployeeDTO updateEmployeeId(Integer id, Integer newId) throws SQLException, IOException {
		
		return employeeDAOImp.updateEmployeeId(id, newId);
	
	}
	
	public EmployeeDTO updateEmployeeName(Integer id, String newName) throws SQLException, IOException {
		
		return employeeDAOImp.updateEmployeeName(id, newName);
	
	}

	public EmployeeDTO getEmployee(Integer id) throws SQLException, IOException {
		EmployeeDTO employeeDTO = employeeDAOImp.getEmployee(id);
		return employeeDTO;
	
	}

	public void deleteEmployee(Integer id) throws SQLException, IOException {
		
		employeeDAOImp.deleteEmployee(id);
		
	}

}
