package com.hcl.dept;

import java.util.Scanner;



public class SearchDepartmentMain {
	public static void main(String[] args) {
		int deptno;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter department No ");
		deptno=sc.nextInt();
		DepartmentDAo dao=new DepartmentDAo();
		Department department=dao.searchDepartment(deptno);
		if(department!=null) {
			System.out.println("dname " +department.getDname());
			System.out.println("loc " +department.getLoc());
			System.out.println("city " +department.getCity());
		}
		else
		{
			System.out.println("Record not found...");
		}
	}
	}


