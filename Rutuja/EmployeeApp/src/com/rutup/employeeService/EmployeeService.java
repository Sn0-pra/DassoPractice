package com.rutup.employeeService;

import java.util.List;
import java.util.stream.Stream;

import com.rutup.employeeDao.EmployeeDAO;
import com.rutup.employeeDto.EmployeeDTO;

public class EmployeeService {
	
	private EmployeeService() {
		System.out.println("Application in EmployeeService");
	}

	
	public static void addEmployee(EmployeeDTO employeeDTO) {
		//convert all fields to capital case
		EmployeeDAO.addEmployeeInDB(employeeDTO);
	}


	public static Stream<EmployeeDTO> getAllEmployees() {
		
		List<EmployeeDTO> employeeList = EmployeeDAO.getAllEmployeesFromDB();
		Stream<EmployeeDTO> employeeStream = employeeList.stream();
//		employeeStream.forEach(System.out::println)
		return employeeStream;
		
	}
	
	public static EmployeeDTO getEmployee(Integer id) {
		Stream<EmployeeDTO> employeeStream = getAllEmployees();
		Object employeeObj = employeeStream.filter((e) -> e.getId() == id).toArray()[0];
		return employeeObj;

	}
	
	public static void updateEMployee(int id) {
		
	}


	public static void deleteEmployee(Integer employeeId) {
		
		
	}
}

