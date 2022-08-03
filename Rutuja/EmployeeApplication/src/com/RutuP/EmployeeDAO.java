package com.RutuP;

public class EmployeeDAO {

	private EmployeeDAO(){
		
	}

	public static void addEmployee(EmployeeDTO[] employeeDTOList) {
		System.out.println("Application in EmployeeDAO");
		for (int i = 0; i < employeeDTOList.length; i++) {
			System.out.println(employeeDTOList[i].toString());
		}
	}
	
}
