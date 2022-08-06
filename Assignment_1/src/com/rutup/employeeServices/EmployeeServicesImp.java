package com.rutup.employeeServices;

import java.util.List;

import com.rutup.employeeDTO.EmployeeDTO;
import com.rutup.employeeController.EmployeeController;

public class EmployeeServicesImp implements EmployeeServices{
	
	EmployeeController employeeController = new EmployeeController();

	public EmployeeDTO addEmployee(Integer empId, String empName) {
		
		EmployeeDTO employeeDTO = new EmployeeDTO(empId,empName.toUpperCase());
		employeeController.addEmployee(employeeDTO);
		return employeeDTO;
		
	}

	public List<EmployeeDTO> getAllEmployees() {
		List<EmployeeDTO> emplist = employeeController.getEmployees();
		return emplist;
		
	}

	public EmployeeDTO getEmployee(Integer id) {
		EmployeeDTO employee = employeeController.getEmployee(id);
		return employee;
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeController.deleteEmployee(id);
		
	}

	@Override
	public EmployeeDTO updateEmployeeId(Integer id, Integer newId) {
		EmployeeDTO employeeDTO = employeeController.updateEmployeeId(id,newId);
		return employeeDTO;
	}

	@Override
	public EmployeeDTO updateEmployeeName(Integer id, String newName) {
		EmployeeDTO employeeDTO = employeeController.updateEmployeeName(id,newName);
		return employeeDTO;
	}


}