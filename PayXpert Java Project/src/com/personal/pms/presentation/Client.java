package com.personal.pms.presentation;


/*
 * Author: Venkatesh Pai
 * Date: 01-11-2024
 */

import java.util.List;
import java.util.Scanner;
import com.personal.pms.entity.*;
import com.personal.pms.service.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class Client {
	
	static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		boolean flag = true;
		
		IEmployeeService service = new EmployeeServiceImp();
		
		while(flag) {
			System.out.println("****Welcome to Payroll Management System");
			System.out.println("1. Add Employee");
			System.out.println("2. Show All Employee");
			System.out.println("3. Show Employee by EmployeeID");
			System.out.println("4. Update employee record");
			System.out.println("5. Remove employee record by EmployeeID");
			System.out.println("0. Exit/Logout");
			
			
			int choice = scanner.nextInt();
			
			switch(choice) {
			case 1:
				
				Employee emp = readEmpData();
				
				boolean isValid = EmployeeServiceImp.validateEmp(emp);
				
				if(isValid) {
					int count = service.addEmployee(emp);
					
					if(count > 0) {
						System.out.println("Employee added Successfully");
					}
					
					else {
						System.err.println("Employee Add Failed");
						
					}
					
					}else {
						System.err.println("Invalid Employee Data");
				}
				break;
				
			case 2:
				List<Employee> list = service.getAllEmployees();
				
				for(Employee employee : list) {
					
					System.out.println(employee);
				}
				
				break;
				
			case 3:
				
				System.out.println("Enter EmployeeId to Search Employee");
				
				int employeeId = scanner.nextInt();
				
				Employee employee = service.getEmployeeById(employeeId);
				
				if(employee != null)
					System.out.println(employee);
				
				break;
				
			case 4:
				
				System.out.println("Enter EmployeeID of employee to be updated");
				
				int count = scanner.nextInt();
				
				Employee emp2 = readEmpData();
				
				int count3 = service.updateEmployee(emp2);
				
				if(count3 > 0) {
					System.out.println("Employee details have been updated succesfully");
					
				}else {
					System.err.println("Employee update failed");
				}
				break;
				
			case 5:
				System.out.println("Enter EmployeeID to delete Record");
				
				int employeeeID = scanner.nextInt();
				
				int count2 = service.removeEmployee(employeeeID);
				
				if(count2 > 0) {
					System.out.println("Employee Deleted Successfully ");
				}else {
					
					System.out.println("Employee Delete Failed.");
				}
				break;
				
			case 0:
				flag = false;
				
				System.out.println("Thank You, Logged Out Successfully");
				
				break;
			}
		}
	}
	
	private static EmployeeServiceImp employeeService = new EmployeeServiceImp();

	private static Employee readEmpData() {
		
		Employee emp = new Employee();
		
		System.out.println("Enter EmployeeId");
		emp.setEmployeeId(scanner.nextInt());
		System.out.println("Enter First Name");
		emp.setFirstName(scanner.next());
		System.out.println("Enter Last Name");
		emp.setLastName(scanner.next());
		System.out.println("Enter Date of Birth format: YYYY-MM-DD");
		String dobStr = scanner.next();
		emp.setDateOfBirth(employeeService.convertStringToDate(dobStr));
		System.out.println("Enter Gender: Male, Female or Other");
		emp.setGender(scanner.next());
		System.out.println("Enter Email");
		emp.setEmail(scanner.next());
		System.out.println("Enter Phone Number");
		emp.setPhoneNumber(scanner.next());
		scanner.nextLine();
		System.out.println("Enter Address");
		emp.setAddress(scanner.nextLine());
		System.out.println("Enter Position");
		emp.setPosition(scanner.nextLine());
		System.out.println("Enter Joining Date");
		String dojStr = scanner.next();
		emp.setJoiningDate(employeeService.convertStringToDate(dojStr));
		return emp;
	}
	
	

}
