package com.personal.pms.dao;
/*
 * Author:Venkatesh Pai
 * Date: 01-11-2024
 */

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.personal.pms.entity.Employee;


public class EmployeeDaoImp implements IEmployeeDao {
	
	private Connection conn;
	
	public EmployeeDaoImp() {
		conn = DBUtil.getDBConnection();
		
	}
	

	@Override
	public Employee getEmployeeById(int employeeId) {
		
		String selectOne = "select * from Employee where employeeID = ?";
		
		Employee emp = null;
		try {
			PreparedStatement pstmt = conn.prepareStatement(selectOne);
			pstmt.setInt(1, employeeId);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int employeeID= rs.getInt("employeeId");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastname");
				Date dateOfBirth = rs.getDate("dateOfBirth");
				String gender = rs.getString("gender");
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phoneNumber");
				String Address = rs.getString("Address");
				String Position = rs.getString("Position");
				Date joiningDate = rs.getDate("joiningDate");
				Date terminationDate = rs.getDate("terminationDate");
				
				emp = new Employee(employeeId, firstName, lastName, dateOfBirth, gender, email, phoneNumber, Address, Position, joiningDate, terminationDate);
				
				
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
		return emp;
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		List<Employee> list = new ArrayList<Employee>();
		
		String selectAll = "select * from Employee";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(selectAll);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()) {
				int employeeId = rs.getInt("employeeId");
				String firstName = rs.getString("firstName");
				String lastName = rs.getString("lastname");
				Date dateOfBirth = rs.getDate("dateOfBirth");
				String gender = rs.getString("gender");
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phoneNumber");
				String Address = rs.getString("Address");
				String Position = rs.getString("Position");
				Date joiningDate = rs.getDate("joiningDate");
				Date terminationDate = rs.getDate("terminationDate");
				
				Employee emp = new Employee(employeeId, firstName, lastName, dateOfBirth, gender, email, phoneNumber, Address, Position, joiningDate, terminationDate);
				
				list.add(emp);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int addEmployee(Employee emp) {
		
		int count = 0;
		
		String insert = "insert into employee(EmployeeID, FirstName, LastName, DateOfBirth, Gender, Email, PhoneNumber, Address, Position, JoiningDate, TerminationDate) values(?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(insert);
			
			pstmt.setInt(1, emp.getEmployeeId());
			pstmt.setString(2, emp.getFirstName());
			pstmt.setString(3, emp.getLastName());
			pstmt.setDate(4, emp.getDateOfBirth());
			pstmt.setString(5, emp.getGender());
			pstmt.setString(6, emp.getEmail());
			pstmt.setString(7, emp.getPhoneNumber());
			pstmt.setString(8, emp.getAddress());
			pstmt.setString(9, emp.getPosition());
			pstmt.setDate(10, emp.getJoiningDate());
			pstmt.setNull(11, java.sql.Types.DATE);
			
			count = pstmt.executeUpdate();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return count;
	}

	@Override
	public int updateEmployee(Employee emp) {
		
		int count = 0;
		
		String update = "UPDATE employee SET firstName = ?, lastName = ?, dateOfBirth = ?, gender = ?, email = ?, phoneNumber = ?, Address = ?, Position = ?, joiningDate = ?, terminationDate = ? WHERE employeeID = ?";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(update);
			
			pstmt.setString(1, emp.getFirstName());
			pstmt.setString(2, emp.getLastName());
			pstmt.setDate(3, emp.getDateOfBirth());
			pstmt.setString(4, emp.getGender());
			pstmt.setString(5, emp.getEmail());
			pstmt.setString(6, emp.getPhoneNumber());
			pstmt.setString(7, emp.getAddress());
			pstmt.setString(8, emp.getPosition());
			pstmt.setDate(9, emp.getJoiningDate());
			if (emp.getTerminationDate() != null) {
			pstmt.setDate(10, emp.getTerminationDate());
			}else {
			pstmt.setNull(10, java.sql.Types.DATE);
			}
			pstmt.setInt(11, emp.getEmployeeId());
			
			count = pstmt.executeUpdate();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int removeEmployee(int employeeId) {
		
		int count = 0;
		
		String delete = "DELETE FROM employee WHERE employeeID = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(delete);
			
			pstmt.setInt(1, employeeId);
			
			count = pstmt.executeUpdate();
		}catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return count;
	}

}
