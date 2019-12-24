package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class NamedQuery3 {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query query=s.getNamedQuery("sumEmploy");
		List<Integer> l1=query.list();
		System.out.println("Sum "+l1.get(0));

		query=s.getNamedQuery("avgEmploy");
		l1=query.list();
		System.out.println("Avg "+l1.get(0));
		query=s.getNamedQuery("maxEmploy");
		l1=query.list();
		System.out.println("Max "+l1.get(0));
		query=s.getNamedQuery("minEmploy");
		l1=query.list();
		System.out.println("Min "+l1.get(0));

		}
	
}
