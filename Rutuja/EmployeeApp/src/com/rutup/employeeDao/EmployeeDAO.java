package com.rutup.employeeDao;

import java.util.ArrayList;
import java.util.List;

import com.rutup.employeeDto.EmployeeDTO;

public class EmployeeDAO {

	private EmployeeDAO(){
		
	}
	
	public static List<EmployeeDTO> employeeList = new ArrayList<EmployeeDTO>();
	
	public static void addEmployeeInDB(EmployeeDTO employeeDTO) {
		employeeList.add(employeeDTO);
		System.out.println(EmployeeDAO.employeeList);
	}
	
	public static List<EmployeeDTO> getAllEmployeesFromDB() {
		return employeeList;	
	}
	
	public static void deleteEmployee(int EmpIndex) {
		employeeList.remove(EmpIndex);
	}
}
