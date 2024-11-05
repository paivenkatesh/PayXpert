package com.personal.pms.dao;

import java.util.List;

import com.personal.pms.entity.Employee;

public interface IEmployeeDao {
	
	Employee getEmployeeById(int employeeId);
	List<Employee> getAllEmployees();
	int addEmployee(Employee emp);
	int updateEmployee(Employee emp);
	int removeEmployee(int employeeId);

}
