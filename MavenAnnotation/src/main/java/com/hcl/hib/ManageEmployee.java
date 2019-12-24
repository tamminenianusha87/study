package com.hcl.hib;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ManageEmployee {

	private static SessionFactory factory; 
	 public Integer addEmployee(String fname, String lname, int salary){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      Integer employeeID = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Employee employee = new Employee(fname, lname, salary);
	         employeeID = (Integer) session.save(employee); 
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	      return employeeID;
	   }

	   public void listEmployees( ) {
	      Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Criteria cr = session.createCriteria(Employee.class);
	         // Add restriction.
	         cr.add(Restrictions.gt("salary", 2000));
	         List<Employee> employees = cr.list();

	         for (Employee e : employees){
	             
	            System.out.print("First Name: " + e.getFirstName()); 
	            System.out.print("  Last Name: " + e.getLastName()); 
	            System.out.println("  Salary: " + e.getSalary()); 
	         }
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
	   
	   public void countEmployee(){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Criteria cr = session.createCriteria(Employee.class);

	         // To get total row count.
	         cr.setProjection(Projections.rowCount());
	         List rowCount = cr.list();

	         System.out.println("Total Coint: " + rowCount.get(0) );
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
	  
	   public void totalSalary(){
	      Session session = factory.openSession();
	      Transaction tx = null;
	      
	      try {
	         tx = session.beginTransaction();
	         Criteria cr = session.createCriteria(Employee.class);

	         // To get total salary.
	         cr.setProjection(Projections.sum("salary"));
	         List totalSalary = cr.list();

	         System.out.println("Total Salary: " + totalSalary.get(0) );
	         tx.commit();
	      } catch (HibernateException e) {
	         if (tx!=null) tx.rollback();
	         e.printStackTrace(); 
	      } finally {
	         session.close(); 
	      }
	   }
	   public static void main(String[] args) {
	      
	      try {
	         factory = new Configuration().
	        		 configure().buildSessionFactory();
	      } catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
	      
	      ManageEmployee ME = new ManageEmployee();

	      Integer empID1 = ME.addEmployee("Zara", "Ali", 2000);
	      Integer empID2 = ME.addEmployee("Daisy", "Das", 1500);
	      Integer empID3 = ME.addEmployee("John", "Paul", 5000);
	      Integer empID4 = ME.addEmployee("Mohd", "Yasee", 3000);

	      ME.listEmployees();

	      ME.countEmployee();

	      ME.totalSalary();
	   }
	   
	  
}