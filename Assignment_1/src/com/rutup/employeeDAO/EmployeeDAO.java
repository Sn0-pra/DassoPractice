package com.rutup.employeeDAO;

import java.util.List;

import com.rutup.employeeDTO.EmployeeDTO;

public interface EmployeeDAO {
	
	abstract void addEmployee(EmployeeDTO employeeDTO);
	abstract List<EmployeeDTO> getEmployees();
	abstract EmployeeDTO updateEmployeeId(Integer id,Integer newId);
	abstract EmployeeDTO updateEmployeeName(Integer id, String newName);
	abstract EmployeeDTO getEmployee(Integer id);
	abstract void deleteEmployee(Integer id);

}
