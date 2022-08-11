package com.rutup.employeeServices;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.rutup.employeeDTO.EmployeeDTO;
import com.rutup.employeeController.EmployeeController;

public class EmployeeServicesImp implements EmployeeServices{
	
	EmployeeController employeeController = new EmployeeController();

	public EmployeeDTO addEmployee(Integer empId, String empName) throws SQLException, IOException {
		
		EmployeeDTO employeeDTO = new EmployeeDTO(empId,empName.toUpperCase());
		employeeController.addEmployee(employeeDTO);
		return employeeDTO;
		
	}

	public List<EmployeeDTO> getAllEmployees() throws SQLException, IOException {
		List<EmployeeDTO> emplist = employeeController.getEmployees();
		return emplist;
		
	}

	public EmployeeDTO getEmployee(Integer id) throws SQLException, IOException {
		EmployeeDTO employee = employeeController.getEmployee(id);
		return employee;
	}

	@Override
	public void deleteEmployee(Integer id) throws SQLException, IOException {
		employeeController.deleteEmployee(id);
		
	}

	@Override
	public EmployeeDTO updateEmployeeId(Integer id, Integer newId) throws SQLException, IOException {
		EmployeeDTO employeeDTO = employeeController.updateEmployeeId(id,newId);
		return employeeDTO;
	}

	@Override
	public EmployeeDTO updateEmployeeName(Integer id, String newName) throws SQLException, IOException {
		EmployeeDTO employeeDTO = employeeController.updateEmployeeName(id,newName);
		return employeeDTO;
	}


}