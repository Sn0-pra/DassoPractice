package com.rutup.EmployeeUI;

import java.util.Scanner;

import com.rutup.employeeController.EmployeeController;
import com.rutup.employeeDto.EmployeeDTO;

public class MenuClass {
	
	Scanner scanner = new Scanner(System.in);
	
	MenuClass(){
		System.out.println("1 -> Add Employee");
		System.out.println("2 -> View Employee");
		System.out.println("3 -> Update Employee");
		System.out.println("4 -> Delete Employee");
		System.out.println("5 -> exit");
		
		int option = scanner.nextInt();
		
		selectMenu(option);
	}
	
	void selectMenu(int option){
		
		switch(option) {
		
			case 1:{
				// create employee object
				System.out.println("Case 1");
				
				System.out.println(" ----Enter Name:");
				String employeeName = scanner.next();
				System.out.println(" ----Enter Id:");
				int employeeId = scanner.nextInt();
				
				
				EmployeeDTO employeeDTO = new EmployeeDTO(employeeName, employeeId);
				System.out.println(employeeDTO);
				
				EmployeeController.sendEmployee(employeeDTO);
				
				new MenuClass();
				break;
			}
			case 2:{
				// view employee object
				System.out.println("Case 2");
				
				System.out.println("6. To view All employees    7. View single Employee");
				int subOption = scanner.nextInt(); 
				
				switch(subOption) {
					case 6:{
						EmployeeController.viewEmployees();
						break;
					}
					case 7:{
						System.out.println("Give id for search:");
						Integer empId = scanner.nextInt();
						EmployeeController.viewEmployee(empId);
						break;
					}
				}
				
				
				new MenuClass();
				break;
			}
			case 3:{
				// update employee object
				System.out.println("Case 3");
				
//				System.out.println("Give id for update");
//				int employeeId = scnner.nextInt();
//				EmployeeController.updateEmployee(employeeId)
				
				new MenuClass();
				break;
			}
			case 4:{
				// delete employee object
				System.out.println("Case 4");
				System.out.println("Give id to delete:");
				Integer empId = scanner.nextInt();
				
				EmployeeController.deleteEmployee(empId);
				
				new MenuClass();
				break;
			}
			case 5:{
				// exit
				System.out.println("Case 5 to exit");
				break;
			}
		
		}
		
	}

}
