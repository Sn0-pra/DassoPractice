package com.rutup.employeeController;

import java.util.List;

import com.rutup.employeeDAO.EmployeeDAOImp;
import com.rutup.employeeDTO.EmployeeDTO;

public class EmployeeController {
	
	EmployeeDAOImp employeeDAOImp = new EmployeeDAOImp();

	public void addEmployee(EmployeeDTO employeeDTO) {
		
		employeeDAOImp.addEmployee(employeeDTO);
		
	}

	public List<EmployeeDTO> getEmployees() {
		
		List<EmployeeDTO> employeeList = employeeDAOImp.getEmployees();
		return employeeList;
	
	}

	public EmployeeDTO updateEmployeeId(Integer id, Integer newId) {
		
		return employeeDAOImp.updateEmployeeId(id, newId);
	
	}
	
	public EmployeeDTO updateEmployeeName(Integer id, String newName) {
		
		return employeeDAOImp.updateEmployeeName(id, newName);
	
	}

	public EmployeeDTO getEmployee(Integer id) {
		EmployeeDTO employeeDTO = employeeDAOImp.getEmployee(id);
		return employeeDTO;
	
	}

	public void deleteEmployee(Integer id) {
		
		employeeDAOImp.deleteEmployee(id);
		
	}

}
