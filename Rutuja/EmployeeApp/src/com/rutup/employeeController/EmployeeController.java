package com.rutup.employeeController;

import java.util.stream.Stream;

import com.rutup.employeeDto.EmployeeDTO;
import com.rutup.employeeService.EmployeeService;


public class EmployeeController {
	
	private EmployeeController(){
	
	}
	
	public static void sendEmployee(EmployeeDTO employeeDTO) {
		System.out.println("Application in EmployeeController");
		
		EmployeeService.addEmployee(employeeDTO);
	}

	public static void viewEmployees() {
		
		EmployeeService.getAllEmployees().forEach(System.out::println);
		
	}
	
	public static void viewEmployee(Integer employeeId) {
		
		EmployeeService.getEmployee(employeeId).forEach(System.out::println);;
		
	}

	public static void updateEmployee(Integer employeeId) {
		
//		EmployeeService.updateEmployee();
		
	}

	public static void deleteEmployee(Integer employeeId) {
		
		EmployeeService.deleteEmployee(employeeId);
		
	}

}
