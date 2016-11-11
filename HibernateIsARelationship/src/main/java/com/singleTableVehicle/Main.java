package com.singleTableVehicle;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure(new File("hibernate.cfg.xml"));
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction t=session.beginTransaction();
		Vehicle v=new Vehicle(10000);
		Car c=new Car(20000, 4);
		Bike b=new Bike(30000, 2);
		
		session.save(v);
		session.save(b);
		session.save(c);
		t.commit();
		session.close();

	}

}
