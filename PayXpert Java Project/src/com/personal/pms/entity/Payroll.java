package com.personal.pms.entity;

/*
 * Author: Venkatesh Pai
 * Date: 01-11-2024
 */

import java.util.*;
public class Payroll {
	
	private int payrollId;
	private int employeeId;
	private Date payPeriodStartDate;
	private Date payPeriodEndDate;
	private int basicSalary;
	private int overtimePay;
	private int deductions;
	private int netSalary;
	
	public Payroll() {
		super();
	}

	public Payroll(int payrollId, int employeeId, Date payPeriodStartDate, Date payPeriodEndDate, int basicSalary,
			int overtimePay, int deductions, int netSalary) {
		super();
		this.payrollId = payrollId;
		this.employeeId = employeeId;
		this.payPeriodStartDate = payPeriodStartDate;
		this.payPeriodEndDate = payPeriodEndDate;
		this.basicSalary = basicSalary;
		this.overtimePay = overtimePay;
		this.deductions = deductions;
		this.netSalary = netSalary;
	}

	public int getPayrollId() {
		return payrollId;
	}

	public void setPayrollId(int payrollId) {
		this.payrollId = payrollId;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public Date getPayPeriodStartDate() {
		return payPeriodStartDate;
	}

	public void setPayPeriodStartDate(Date payPeriodStartDate) {
		this.payPeriodStartDate = payPeriodStartDate;
	}

	public Date getPayPeriodEndDate() {
		return payPeriodEndDate;
	}

	public void setPayPeriodEndDate(Date payPeriodEndDate) {
		this.payPeriodEndDate = payPeriodEndDate;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getOvertimePay() {
		return overtimePay;
	}

	public void setOvertimePay(int overtimePay) {
		this.overtimePay = overtimePay;
	}

	public int getDeductions() {
		return deductions;
	}

	public void setDeductions(int deductions) {
		this.deductions = deductions;
	}

	public int getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(int netSalary) {
		this.netSalary = netSalary;
	}

	@Override
	public String toString() {
		return "Payroll [payrollId=" + payrollId + ", employeeId=" + employeeId + ", payPeriodStartDate="
				+ payPeriodStartDate + ", payPeriodEndDate=" + payPeriodEndDate + ", basicSalary=" + basicSalary
				+ ", overtimePay=" + overtimePay + ", deductions=" + deductions + ", netSalary=" + netSalary + "]";
	}
	
	
	
}