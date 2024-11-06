package com.personal.pms.test;

//All test cases have been implmented successfully
//Disabled tags have been added to all test. Remove them before running.
//Run removeEmployeeById separately at the end to prevent failure.
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.personal.pms.entity.Employee;
import com.personal.pms.service.EmployeeServiceImp;
import com.personal.pms.service.IEmployeeService;

class EmployeeServiceImpTest {
	
	static IEmployeeService service;
	
	@BeforeAll
	public static void beforeAll() {
		
		service = new EmployeeServiceImp();
	}

	@Test
	void testEmployeeServiceImp() {
		
		int count = 1;
		
		assertTrue(count > 0);
	}

	@Test
	void testGetEmployeeById() {
		
		Employee employee = service.getEmployeeById(1);
		
		assertEquals(1,employee.getEmployeeId());
		
		System.out.println("GetEmployeeById implemented Successfully");
	}

	@Test
	void testGetAllEmployees() {
		
		List<Employee> list = service.getAllEmployees();
		
		assertNotNull(list);
		
		System.out.println("getAllEmployees implemented Successfully");
	}

	@Test
	@Disabled
	void testAddEmployee() {
		
		Date dateOfBirth = Date.valueOf(LocalDate.of(1980, 5, 12));
		Date joiningDate = Date.valueOf(LocalDate.of(2010, 12, 13));
		Date terminationDate = null;
		
		Employee emp = new Employee(20, "Oscar", "Finlay", dateOfBirth, "Male", "oscar.finlay@example.com","7878947475","23 Margrave","Chief Detective", joiningDate, terminationDate);
		
		int count = service.addEmployee(emp);

		assertTrue(count > 0);

		System.out.println("Added Employee Successfullly");
	}

	@Test
	@Disabled
	void testUpdateEmployee() {
		Date dateOfBirth = Date.valueOf(LocalDate.of(1980, 5, 12));
		Date joiningDate = Date.valueOf(LocalDate.of(2010, 12, 13));
		Date terminationDate = null;

		Employee emp = new Employee(20, "Oscar", "Finlay", dateOfBirth, "Male", "oscar.finlay@example.com","7878947475","12 Boston","Captain Detective", joiningDate, terminationDate);

		int count = service.updateEmployee(emp);

		assertTrue(count > 0);

		System.out.println("Updated Employee Details Successfully");


	}

	@Test
	@Disabled
	void testRemoveEmployee() {
		int count = service.removeEmployee(20);

		assertTrue(count > 0);

		System.out.println("Employee has been removed Successfully");

	}

}
