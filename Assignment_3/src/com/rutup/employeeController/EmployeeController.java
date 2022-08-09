package com.rutup.employeeController;

import java.sql.SQLException;
import java.util.List;

import com.rutup.employeeDAO.EmployeeDAOImp;
import com.rutup.employeeDTO.EmployeeDTO;

public class EmployeeController {
	
	EmployeeDAOImp employeeDAOImp = new EmployeeDAOImp();

	public void addEmployee(EmployeeDTO employeeDTO) throws SQLException {
		
		employeeDAOImp.addEmployee(employeeDTO);
		
	}

	public List<EmployeeDTO> getEmployees() throws SQLException {
		
		List<EmployeeDTO> employeeList = employeeDAOImp.getEmployees();
		return employeeList;
	
	}

	public EmployeeDTO updateEmployeeId(Integer id, Integer newId) throws SQLException {
		
		return employeeDAOImp.updateEmployeeId(id, newId);
	
	}
	
	public EmployeeDTO updateEmployeeName(Integer id, String newName) throws SQLException {
		
		return employeeDAOImp.updateEmployeeName(id, newName);
	
	}

	public EmployeeDTO getEmployee(Integer id) throws SQLException {
		EmployeeDTO employeeDTO = employeeDAOImp.getEmployee(id);
		return employeeDTO;
	
	}

	public void deleteEmployee(Integer id) throws SQLException {
		
		employeeDAOImp.deleteEmployee(id);
		
	}

}
