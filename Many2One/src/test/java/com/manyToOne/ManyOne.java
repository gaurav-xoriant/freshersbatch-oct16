package com.manyToOne;

import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyOne {

	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session_1 = sessionFactory.openSession();
		Transaction t=session_1.beginTransaction();
		Stock stck = new Stock();
		stck.setDepartmentName("Nifty");

		Market emp1 = new Market("Nina", 20000);
		Market emp2 = new Market("Tony", 30000);
		emp1.setStock(stck);
		emp2.setStock(stck);
		
		stck.setEmployees(new HashSet<Market>());
		stck.getEmployees().add(emp1);
		stck.getEmployees().add(emp2);
		session_1.save(stck);
		System.out.println("department saved!!");
		t.commit();

	}

}
