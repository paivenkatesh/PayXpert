package com.personal.pms.service;

import java.util.List;

import com.personal.pms.entity.Employee;

public interface IEmployeeService {
	
	Employee getEmployeeById(int employeeId);
	List<Employee> getAllEmployees();
	int addEmployee(Employee emp);
	int updateEmployee(Employee emp);
	int removeEmployee(int employeeId);
	
}
