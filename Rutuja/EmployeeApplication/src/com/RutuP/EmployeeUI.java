import java.util.Scanner;

package com.RutuP;

import java.util.Scanner;

public class EmployeeUI {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to Employee Application");
		
		System.out.println("*************Menu**************");
		int n = scanner.nextInt();
		
		EmployeeDTO empList[] = new EmployeeDTO[n];
		
		for (int i = 0; i < n; i++) {
		
			System.out.println("Give name: ");
			String name = scanner.next();
			//nextLine giving error
			
			System.out.println("Give id: ");
			int id = scanner.nextInt();
	
			
			EmployeeDTO employeeDTO = new EmployeeDTO(name, id);
	
			empList[i] = employeeDTO;
			
		}
		
//		System.out.println(empList);
		for (int i = 0; i < empList.length; i++) {
			System.out.println(empList[i].toString());
		}
		EmployeeController.sendEmployee(empList);
		
		System.out.println("Application Ends");
	
	}

}