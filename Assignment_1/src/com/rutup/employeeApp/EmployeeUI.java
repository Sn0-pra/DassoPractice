package com.rutup.employeeApp;

import java.util.Scanner;
import com.rutup.employeeServices.EmployeeServicesImp;

public class EmployeeUI {
	
	Scanner scanner = new Scanner(System.in);
	
	public EmployeeUI(){
		
		System.out.println(" ********** 	********** \n");
		System.out.println("1 -> Add Employee");
		System.out.println("2 -> View Employee");
		System.out.println("3 -> Update Employee");
		System.out.println("4 -> Delete Employee");
		System.out.println("5 -> exit \n");
		System.out.println(" ********** 	********** \n");
		
		int option = scanner.nextInt();
		
		selectMenu(option);
		
	}

	void selectMenu(int option) {
		
		EmployeeServicesImp employeeServicesImp = new EmployeeServicesImp();

		switch(option) {
		
				case 1:try {
						{
							//add employee
							System.out.println("Give Id:");
							Integer empId = scanner.nextInt();
							System.out.println("Give name");
							String empName = scanner.next();
							
							employeeServicesImp.addEmployee(empId,empName);
							
							new EmployeeUI();
							break;
						}
					} catch (Exception e) {

						e.printStackTrace();
				}
				
				
				case 2:{
					//view employee
					System.out.println("6 -> To view All employees    7 -> View single Employee");
					
					int subOption = scanner.nextInt(); 
					
					switch(subOption) {
						
						case 6:{
							System.out.println(employeeServicesImp.getAllEmployees());
							break;
						}
						case 7:{
							System.out.println("Give id for search:");
							Integer id = scanner.nextInt();
							
							
							System.out.println(employeeServicesImp.getEmployee(id));
							break;
						}
					}
					
					new EmployeeUI();
					break;
				}
				
				
				case 3:{
					//update employee5
					System.out.println("Give id for update:");
					Integer empId = scanner.nextInt();
					
					System.out.println("8 -> update id		9 -> update name");
					int suboption = scanner.nextInt(); 
					switch (suboption) {
					case 8: {
						
						System.out.println("Give new id:");
						Integer newId = scanner.nextInt();
						employeeServicesImp.updateEmployeeId(empId,newId);
						break;
						
						}
					case 9:{
						
						System.out.println("Give new name");
						String newName = scanner.next();
						employeeServicesImp.updateEmployeeName(empId,newName);
						break;
						
						}
					}
					
					new EmployeeUI();
					break;
				}
				
				
				case 4:{
					//delete employee
					System.out.println("Give id for deleting:");
					Integer empId = scanner.nextInt();
					employeeServicesImp.deleteEmployee(empId);
					new EmployeeUI();
					break;
				}
				
				
				case 5:{
					System.out.println("********** Closing Application ***********");
					break;
				}
		
		}

	}
}
