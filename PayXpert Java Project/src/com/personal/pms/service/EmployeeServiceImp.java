package com.personal.pms.service;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import com.personal.pms.dao.EmployeeDaoImp;
import com.personal.pms.dao.IEmployeeDao;
import com.personal.pms.entity.Employee;

public class EmployeeServiceImp implements IEmployeeService {

	private IEmployeeDao dao;
	
	public EmployeeServiceImp() {
		dao = new EmployeeDaoImp();
	}
	
	@Override
	public Employee getEmployeeById(int employeeId) {
		// TODO Auto-generated method stub
		return dao.getEmployeeById(employeeId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}

	@Override
	public int addEmployee(Employee emp) {
		
		return dao.addEmployee(emp);
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(emp);
	}

	@Override
	public int removeEmployee(int employeeId) {
		
		return dao.removeEmployee(employeeId);
	}
	
	
	public static java.sql.Date convertStringToDate(String dateStr){
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			java.util.Date utilDate = formatter.parse(dateStr);
			return new java.sql.Date(utilDate.getTime());
			
		}catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public static boolean validateEmp(Employee emp) {
		boolean flag = false;
		
		if(emp.getEmployeeId() >= 1 && emp.getEmployeeId() <= 100) {
			flag = true;
		}
		return flag;
	}

}