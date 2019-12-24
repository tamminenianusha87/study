package com.hcl.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployInsert {
public static void main(String[] args) {
	Configuration cfg=new AnnotationConfiguration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	Transaction t=s.beginTransaction();
	Employ employ=new Employ();
	employ.setEmpno(23);
	employ.setName("Anusha");
	employ.setDept("Hadoop");
	employ.setDesig("swe");
	employ.setBasic(333333);
	s.save(employ);
	t.commit();
	System.out.println("Record Inserted.....");
}
}
