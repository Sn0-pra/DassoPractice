package com.rutup.employeeServices;

import java.util.List;

import com.rutup.employeeDTO.EmployeeDTO;

public abstract interface EmployeeServices{
	
	abstract EmployeeDTO addEmployee(Integer empId, String empName);
	abstract List<EmployeeDTO> getAllEmployees();
	abstract EmployeeDTO getEmployee(Integer id);
	abstract EmployeeDTO updateEmployeeId(Integer id, Integer newId);
	abstract EmployeeDTO updateEmployeeName(Integer id, String newName);
	abstract void deleteEmployee(Integer id);

}
