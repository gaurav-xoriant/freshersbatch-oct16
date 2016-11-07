package com.oneTOone;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class One2One {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session_1 = sessionFactory.openSession();
		Transaction t=session_1.beginTransaction();
		Enquiry e=new Enquiry("why laptop not working");
		Customer c=new Customer("am", e);
		session_1.persist(c);
		t.commit();
		System.out.println(c.getName());
		System.out.println(c.getQuestion());
		System.out.println("created");
		session_1.close();
		
		System.out.println("----------------------------------------------------------------");

		Session session_3=sessionFactory.openSession();
    	Transaction transaction = null;
        transaction = session_3.beginTransaction();
        Query q = session_3.createQuery("from Customer");
        List<Customer>p=q.list();
        for (Customer c1:p){
        	System.out.println(c1);
        }
        transaction.commit();
        session_3.close();
        
        System.out.println("----------------------------------------------------------------");
    	//DELETE
        Session session_4 = sessionFactory.openSession();
        	//getting transaction object from session object
        Transaction t3=session_4.beginTransaction();
        //Customer student = (Customer)session_4.load(Customer.class, 49);
        //session_4.delete(student);
        Query q1 = session_3.createQuery("delet from Customer");
        System.out.println("Deleted Successfully");
        t3.commit();
        session_4.close();        
	}
}
