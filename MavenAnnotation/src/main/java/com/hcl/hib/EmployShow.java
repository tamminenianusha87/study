package com.hcl.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class EmployShow {
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ");
		q.setFirstResult(5);
		q.setMaxResults(10);
		List<Employ> employList=q.list();
		for (Employ employ : employList) {
			System.out.println("Empno "+employ.getEmpno());
			System.out.println("Name "+employ.getName());
			System.out.println("Dept "+employ.getDept());
			System.out.println("Desig "+employ.getDesig());
			System.out.println("Basic "+employ.getBasic());
			System.out.println("---------------------");
		}
	q=s.createQuery("select sum(basic) from Employ");
	List<Integer> l1=q.list();
	System.out.println("sum "+l1.get(0));
	
	q=s.createQuery("select max(basic) from Employ");
	 l1=q.list();
	System.out.println("max "+l1.get(0));
	
	q=s.createQuery("select min(basic) from Employ");
	 l1=q.list();
	System.out.println("min "+l1.get(0));
	
	q=s.createQuery("select count(basic) from Employ");
  l1=q.list();
	System.out.println("count "+l1.get(0));
	}
	
}
