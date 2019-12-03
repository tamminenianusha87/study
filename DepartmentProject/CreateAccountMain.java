package com.hcl.dept;

import java.util.List;


public class CreateAccountMain {
	public static void main(String[] args) {
		DepartmentDAo dao=new DepartmentDAo();
		List<Department> departmentList=dao.showDepartment();
		for (Department department : departmentList) {
			System.out.println("department No "+department.getDeptno());
			System.out.println("department Name "+department.getDname());
			System.out.println("Department loc "+department.getLoc());
			System.out.println("department city "+department.getCity());
			System.out.println("department head "+department.getHead());
			System.out.println("-------------------------");
		}
	}

}
