package com.hcl.dept;

import java.util.Scanner;


public class DeleteDepartmentMain {
	public static void main(String[] args) {
		int deptno;
		System.out.println("enter department No. ");
		Scanner sc=new Scanner(System.in);
		deptno=sc.nextInt();
		DepartmentDAo dao=new DepartmentDAo();
		System.out.println(dao.deleteDepartment(deptno));
	}

		
	}
	


