package com.hcl.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class DepartmentInsert {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		Department d=new Department();
		d.setDeptno(9);
		d.setDname("Anusha");
		d.setLoc("hyd");
       d.setCity("chennai");
		d.setHead("ssss");
		s.save(d);
		t.commit();
		System.out.println("Record Inserted.....");
}
}
