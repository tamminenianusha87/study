package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployDelete {
	public static void main(String[] args) {
	

	Configuration cfg=new AnnotationConfiguration();
	cfg.configure("hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s=sf.openSession();
	int empno=1;
	 Query q=s.createQuery("from Employ where Empno="+empno);
	List<Employ> lstEmploy=q.list();
	 Employ e=lstEmploy.get(0);
	 Transaction t=s.beginTransaction();
	 s.delete(e);
		t.commit();
		System.out.println("Record deleted.....");
}
}