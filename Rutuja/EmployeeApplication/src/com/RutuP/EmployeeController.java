package com.RutuP;

public class EmployeeController {
	
	private EmployeeController(){
	
	}
	
	static void sendEmployee(EmployeeDTO[] employeeDTOList) {
		System.out.println("Application in EmployeeController");
		
		EmployeeServices.updateDetails(employeeDTOList);
	}

}
