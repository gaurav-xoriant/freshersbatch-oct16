package com.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class CURDHibernate {

	public static void main(String[] args) {
		  
	    Configuration cfg=new Configuration();  
	    cfg.configure("hibernate.cfg.xml");  
	      
	     
	    SessionFactory factory=cfg.buildSessionFactory();  
	      
		    /*  //Create 
		    Session session_1=factory.openSession(); 	      
		    Transaction t=session_1.beginTransaction();  
		    Product e1=new Product();   
		    e1.setName("sonoo");  
		    e1.setPrice(400000);  
		    session_1.save(e1);
		    Long id=e1.getId();
		    t.commit(); 
		    session_1.close();  
		    System.out.println("successfully created");  
	   
	        	//update
		    Session session_2=factory.openSession();
		    Transaction tx=session_2.beginTransaction();
		    Product p=(Product)session_2.get(Product.class, id);
		    p.setPrice(2000);
		    tx.commit();
		    session_2.close();
		    System.out.println("updated");
	    */
	    		//read
	    	Session session_3=factory.openSession();
	    	Transaction transaction = null;
  
            transaction = session_3.beginTransaction();
            List<?> product = session_3.createQuery("from Product").list();
 
            for (Iterator<?> iterator = product.iterator(); iterator.hasNext();) {
                Product p1 = (Product) iterator.next();
                System.out.println(p1.getName() + "  "
                        + p1.getId() + "  " + p1.getPrice());
            }
            transaction.commit();
            session_3.close();
            
            	//DELETE
            Session session_4 = factory.openSession();
            	//getting transaction object from session object
            Transaction t3=session_4.beginTransaction();
            Product student = (Product)session_4.load(Product.class, 14L);
            session_4.delete(student);
            System.out.println("Deleted Successfully");
            t3.commit();
            session_4.close();
        	Session session_31=factory.openSession();
	    	Transaction transaction1 = null;
  
            transaction1 = session_31.beginTransaction();
            List<?> product1 = session_31.createQuery("from Product").list();
 
            for (Iterator<?> iterator = product1.iterator(); iterator.hasNext();) {
                Product p1 = (Product) iterator.next();
                System.out.println(p1.getName() + "  "
                        + p1.getId() + "  " + p1.getPrice());
            }
            transaction1.commit();
            session_31.close();
	}

}
