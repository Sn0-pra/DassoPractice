package com.rutup.employeeDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.rutup.employeeDTO.EmployeeDTO;

public class EmployeeDAOImp implements EmployeeDAO{
	
	public static List<EmployeeDTO> employeeList = new ArrayList<EmployeeDTO>();

	@Override
	public void addEmployee(EmployeeDTO employeeDTO) {
		// TODO Auto-generated method stub
		
		employeeList.add(employeeDTO);
		System.out.println(employeeList);
		
	}

	@Override
	public List<EmployeeDTO> getEmployees() {
		
		if(employeeList.size() == 0) {
			System.out.println("Employee list is Empty");
		
		}
			return employeeList;
		
	}
	

	@Override
	public EmployeeDTO getEmployee(Integer id) {
		Stream<EmployeeDTO> employeeStream = employeeList.stream();
		employeeStream.forEach(System.out::println);

		for (EmployeeDTO employeeDTO : employeeList) {
			
			if (employeeDTO.getEmployeeId() == id) {
				
				return employeeDTO;
			
			}
		}
		return null;
	}

	
	@Override
	public void deleteEmployee(Integer id) {
		if(employeeList.size() == 0) {
			System.out.println("Employee list is Empty");
		}else {
			employeeList.remove(getEmployee(id));
		}
	}

	@Override
	public EmployeeDTO updateEmployeeId(Integer id, Integer newId) {
	
		EmployeeDTO employee = getEmployee(id);
		if(employee == null) {
			System.out.println("Employee not present");
			return null;
		}else {
			employee.setEmployeeId(newId);
			return employee;	
		}
	
	}

	@Override
	public EmployeeDTO updateEmployeeName(Integer id, String newName) {
		
		EmployeeDTO employee = getEmployee(id);
		if(employee == null) {
			System.out.println("Employee not present");
			return null;
		}else {
			employee.setEmployeeName(newName);
			return employee;
		}
		
	}

}
