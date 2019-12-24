package com.hcl.hib;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
@NamedQueries(
		{
	@NamedQuery(
			name="showEmploy",
			query="from Employ"
			),
	@NamedQuery(
			name=" findEmploy",
			query="from Employ where empno=:empno"
			),
	@NamedQuery(
			name="sumEmploy",
			query="select avg(basic) from Employ"
			),
	@NamedQuery(
			name="maxEmploy",
			query="select max(basic) from Employ"
			),
	@NamedQuery(
			name="minEmploy",
			query="select min(basic) from Employ"
			),
}
		)
@Entity
@Table (name="Employ")
public class Employ {
private int empno,basic;
private String dept,name,desig;
@Id
@Column(name="empno")
public int getEmpno() {
	return empno;
}
public void setEmpno(int empno) {
	this.empno = empno;
}
@Column(name="basic")
public int getBasic() {
	return basic;
}
public void setBasic(int basic) {
	this.basic = basic;
}
@Column(name="dept")
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
@Column(name="name")
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Column(name="desig")
public String getDesig() {
	return desig;
}
public void setDesig(String desig) {
	this.desig = desig;
}
}