package com.hcl.task;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employ {

	private int empId;
	private String empName;
	private String empDepartment;
	private String empPhone;
	private String empEmail;
	private Date empDateOfJoin;
	private int empLeavebalance;
	private int empManagerId;
	public int getEmpid() {
		return empId;
	}
	public void setEmpid(int empid) {
		this.empId = empid;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public String getEmpEmail() {
		return empEmail;
	}
	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}
	public Date getEmpDateOfJoin() {
		return empDateOfJoin;
	}
	public void setEmpDateOfJoin(Date empDateOfJoin) {
		this.empDateOfJoin = empDateOfJoin;
	}
	public int getEmpLeavebalance() {
		return empLeavebalance;
	}
	public void setEmpLeavebalance(int empLeavebalance) {
		this.empLeavebalance = empLeavebalance;
	}
	public int getEmpManagerId() {
		return empManagerId;
	}
	public void setEmpManagerId(int empManage) {
		this.empManagerId = empManagerId;
	}
	@Override
	public String toString() {
//		return "EmployProgram [empId=" + empId + ", empName=" + empName + ", empDepartment=" + empDepartment + ", empPhone="
//				+ empPhone + ", empEmail=" + empEmail + ", empDateOfJoin=" + new SimpleDateFormat("dd/MM/yyyy")+ ", empLeaveBalance="
//				+ empLeaveBalance + ", empManagerId=" + empManagerId + "]";
		return String.format("%8d %12s %16s %19s %14s %14s %10s %11d", empId, empName,empDepartment,empPhone,empEmail,
				new SimpleDateFormat("dd/MM/yyyy").format(empDateOfJoin),empLeavebalance,empManagerId);
	}
	
}
