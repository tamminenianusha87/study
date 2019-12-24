package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DepartmentShow {
public static void main(String[] args) {
	Configuration cfg=new AnnotationConfiguration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Query q=s.createQuery("from Department");
	List<Department> departmentList=q.list();
	for (Department d : departmentList) {
		System.out.println("Deptno "+d.getDeptno());
		System.out.println("Dname "+d.getDname());
		System.out.println("Loc "+d.getLoc());
		System.out.println("City "+d.getCity());
		System.out.println("Head "+d.getHead());
		System.out.println("---------------------");
	}
}
}
