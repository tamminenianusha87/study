package com.hcl.task;

import java.util.List;

public class EmployBAL {
	
static StringBuilder sb=new StringBuilder();

public void writeCustomerFileBal() {
	new EmployDAO().writeEmployFileDao();
}

public void readCustomerFileBal() {
	new EmployDAO().readEmployFileDao();
}
public boolean addEmployBal(Employ objEmploy) throws EmployException { 
	boolean isAdded=true;
	if(objEmploy.getEmpid() <=0) {
		sb.append("empid cannot be negative or Zero \r\n");
		isAdded=false;	
	}
	if(objEmploy.getEmpName().length() <=5) {
		sb.append("name more than 5 character \r\n");
		isAdded=false;
	}
	if(objEmploy.getEmpDepartment().length() <=5) {
		sb.append("department  more than 5 character \r\n");
		isAdded=false;
	}
	if(objEmploy.getEmpPhone().length() <=10) {
		sb.append("phone number more than 10 character \r\n");
		isAdded=false;
	}
	
	return isAdded;
}
public List<Employ> showEmployBal() {
	return new EmployDAO().showEmployDao();
}
public Employ searchEmployBal(int empId) {
	return new EmployDAO().searchEmployDao(empId);
}



}