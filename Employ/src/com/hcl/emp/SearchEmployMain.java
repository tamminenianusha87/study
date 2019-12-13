package com.hcl.emp;

import java.util.Scanner;

public class SearchEmployMain {
public static void main(String[] args) {
	int empno;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Employ No ");
	empno=sc.nextInt();
	EmployDAO dao=new EmployDAO();
	Employ employ=dao.searchEmploy(empno);
	if(employ!=null) {
		System.out.println("name " +employ.getName());
		System.out.println("Department " +employ.getDept());
		System.out.println("Desig " +employ.getDesig());
	}
	else
	{
		System.out.println("Record not found...");
	}
}

}
