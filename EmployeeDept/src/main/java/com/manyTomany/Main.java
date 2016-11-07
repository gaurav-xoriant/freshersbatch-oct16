package com.manyTomany;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
  

  public static void main(String[] a) throws Exception {
	 
	  Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction=session.beginTransaction();
		
	    Student student = new Student();
	    student.setName("Joe");
	    session.persist(student);
    
	    Student student1 = new Student();
	    student1.setName("Joe");
	    session.persist(student1);
	    
	    Dept dept = new Dept();
	    dept.setName("dept name");
	    dept.addStudent(student);
	
	    dept.addStudent(student1);
	    session.persist(dept);
	   
	    session.close();
	    transaction.commit();
  }
}
    
