package com.hcl.dept;

import java.util.Scanner;



public class AddDepartmentMain {
	public static void main(String[] args) {
		DepartmentDAo dao=new DepartmentDAo();
		 System.out.println(dao.generateDepartmentno());
		Department department=new Department();
		int Deptno=dao.generateDepartmentno();
	     department.setDeptno(Deptno);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter department Name ");
		department.setDname(sc.nextLine());
		System.out.println("Enter Department loc  ");
		department.setLoc(sc.nextLine());
		System.out.println("Enter Department city ");
		department.setCity(sc.nextLine());
		System.out.println("Enter department head  ");
		department.setHead(sc.nextLine());
		System.out.println(dao.addDepartment(department));
	}
	}


