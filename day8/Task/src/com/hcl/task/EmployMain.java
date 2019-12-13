package com.hcl.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;



public class EmployMain {
	public static void main(String[] args) {
		int choice;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Options");
			System.out.println("_ _ _ _ _");
			System.out.println("1.Add Employ");
			System.out.println("2.Show Employ");
			System.out.println("3.Search Employ");
			System.out.println("4.Write Employ File");
			System.out.println("5.Read Employ File");
			System.out.println("6.Exit");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				addEmploy();
				break;
			case 2:
				showEmploy();
				break;
			case 3:
				searchEmploy();
				break;
			case 4 : 
				writeEmployFile();
				break;
			case 5 : 
				readEmployFile();
				break;
			case 6:
				return;
			default :
				System.out.println("Invalid Input");
			}

	}while(choice!=6);

}
private static void readEmployFile() {
	new EmployDAO().readEmployFileDao();
	}
private static void writeEmployFile() {
	new EmployDAO().writeEmployFileDao();
		
	}


	private static void searchEmploy() {
		int empId;
		System.out.println("Enter emp Id ");
		Scanner sc = new Scanner(System.in);
		empId=sc.nextInt();
		EmployDAO obj = new EmployDAO();
		Employ employ = obj.searchEmployDao(empId);
		System.out.println(employ);
		
	}

	private static void showEmploy() {
		EmployDAO obj = new EmployDAO();
		List<Employ> employees = obj.showEmployDao();
		System.out.println("Employ No      Employ Name      Department      Phone      Email                      DateOfJoin    LeaveBalance      ManagerId");
		System.out.println("--------------------------------------------------------------------------------------------------------------------------");
		for (Employ employ : employees) {
			System.out.println(employ);
		}
	
		
	}

	private static void addEmploy() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Employ objemploy=new Employ();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp no: ");
		objemploy.setEmpid(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter emp name ");
		objemploy.setEmpName(sc.nextLine());
		System.out.println("Enter emp dept ");
		objemploy.setEmpDepartment(sc.nextLine());
		System.out.println("Enter emp phno: ");
		objemploy.setEmpPhone(sc.nextLine());
		System.out.println("Enter emp email ");
		objemploy.setEmpEmail(sc.nextLine());
		System.out.println("Enter Date of Joining (dd/MM/yyyy)  ");
		
		try {
			objemploy.setEmpDateOfJoin(sdf.parse(sc.nextLine()));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter emp leave balance ");
		objemploy.setEmpLeavebalance(Integer.parseInt(sc.nextLine()));
		System.out.println("Enter emp manager id: ");
		objemploy.setEmpManagerId(Integer.parseInt(sc.nextLine()));
		
		EmployDAO obj = new EmployDAO();
		String res= obj.addEmployDao(objemploy);
		System.out.println(res);
		
	}
	
	
}