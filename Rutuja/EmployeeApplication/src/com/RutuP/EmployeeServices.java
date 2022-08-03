package com.RutuP;

public class EmployeeServices {
	
	private EmployeeServices() {
		
	}

	static void updateDetails(EmployeeDTO[] employeeDTOList) {
		
		System.out.println("Application in employeeServices");
		
		for (int i = 0; i < employeeDTOList.length; i++) {

			employeeDTOList[i].setName(employeeDTOList[i].getName().toUpperCase());
			
		}

//		System.out.println(employeeDTOList);
		for (int i = 0; i < employeeDTOList.length; i++) {
			System.out.println(employeeDTOList[i].toString());
		}
		
		EmployeeDAO.addEmployee(employeeDTOList);
		
	}
}
