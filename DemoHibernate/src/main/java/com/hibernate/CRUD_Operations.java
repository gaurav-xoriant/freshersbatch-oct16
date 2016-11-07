package com.hibernate;

import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.DoubleType;

public class CRUD_Operations {
									//SQL Select
									public static void fireSQL(SessionFactory sessionFactory) {
								
										Session session = sessionFactory.openSession();
										SQLQuery sqlQuery = 
											session.createSQLQuery("SELECT P_ID, NAME,COST FROM PRODUCT_MASTER ORDER BY COST desc");
										sqlQuery.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
										List<Map> productList = sqlQuery.list();
										for(Map hmapRow: productList) {
											//Map hmapRow = (Map)data;
											System.out.println(hmapRow.get("P_ID") + " - " + hmapRow.get("NAME")+" - " + hmapRow.get("COST"));
										}
										session.close();
									}
									//SQL Insert
									public static void fireinsertSQL(SessionFactory s){
										Session session = s.openSession();
										Transaction t21=session.beginTransaction();
										SQLQuery qry=session.createSQLQuery("INSERT INTO PRODUCT_MASTER(p_id,name,cost) VALUES(100,\'mobile\',10000)");
										int up=qry.executeUpdate();
										System.out.println("inserted using sql"+up);
										t21.commit();
										session.close();
									}
	
	public static void main(String[] args) throws Exception {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");

		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session_1 = sessionFactory.openSession();
		Transaction transaction = session_1.beginTransaction();
							//fireSQL(sessionFactory);  //caliing sql select
							//fireinsertSQL(sessionFactory); //calling sql insert
							
									//sum
		
							/*
							String hql="select sum(price) from Product";
							Query qry=session_1.createQuery(hql);
							for(Iterator it=qry.iterate();it.hasNext();)
							{
							 Double row = (Double) it.next();
							 System.out.print("Sum: " + row);
							}
		
									//orderby hql
		
							String hql1="from Product order by price desc";
							Query qry=session_1.createQuery(hql1);
							List<?> product = qry.list();
							
							for (Iterator<?> iterator = product.iterator(); iterator.hasNext();) {
							    Product p1 = (Product) iterator.next();
							    System.out.println(p1.getName() + "  "
							            + p1.getId() + "  " + p1.getPrice());
							}
							
									//orderby criteria
									 
							Criteria cr=session_1.createCriteria(Product.class);
							cr.addOrder(Order.desc("price"));
							List<?> product = cr.list();
							for (Iterator<?> iterator = product.iterator(); iterator.hasNext();) {
							    Product p1 = (Product) iterator.next();
							    System.out.println(p1.getName() + "  "
							            + p1.getId() + "  " + p1.getPrice());
							}
							transaction.commit();
							session_1.close();
							
									//groupby name hql
							
							String hql="select name,count(name) from Product group by name";
							Query qry=session_1.createQuery(hql);
							for(Iterator it=qry.iterate();it.hasNext();)
							{
							 Object[] row = (Object[]) it.next();
							 System.out.println("Count: " + row[1]);
							 System.out.println("Name: " + row[0]);
							}
							transaction.commit();
							session_1.close();
							
									//groupby criteria
							Criteria cr=session_1.createCriteria(Product.class);	
							cr.setProjection(Projections.projectionList().add(Projections.count("name")).add(Projections.groupProperty("name")));
							for(Iterator it=cr.list().iterator();it.hasNext();)
							{
							 Object[] row = (Object[]) it.next();
							 System.out.println("Count: " + row[1]);
							 System.out.println("Name: " + row[0]);
							}
							transaction.commit();
							session_1.close();		
							
								/*	//Average price

							String hql="select avg(price) from Product";
							Query qry=session_1.createQuery(hql);
							for(Iterator it=qry.iterate();it.hasNext();)
							{
							 Double row = (Double) it.next();
							 System.out.print("AVG: " + row);
							}
							
								
									//Name greater then 10000
		 					Criteria cr=session_1.createCriteria(Product.class);
		 					cr.add(Restrictions.gt("price",(double)10000));
		 					List<?> product = cr.list();
							for (Iterator<?> iterator = product.iterator(); iterator.hasNext();) {
							    Product p1 = (Product) iterator.next();
							    System.out.println(p1.getName() + "  "
							            + p1.getId() + "  " + p1.getPrice());
							}
							transaction.commit();
							session_1.close();
							*/
								
							/*
									//CREATE A PRODUCT
							Session session_1 = sessionFactory.openSession();
							Product product = new Product("LapySADHGJHGHJ", 140000);
							Transaction transaction = session_1.beginTransaction();
							System.out.println("inserted");
							session_1.save(product);//Hibernate
							transaction.commit();
							session_1.close();
							
							//OR
							//session_1.persist(product); //JPA
							/*
							long productId = product.getId();
							transaction.commit();
							session_1.close();
							
									//UPDATE A PRODUCT
									 
							Session session_2 = sessionFactory.openSession();
							transaction = session_2.beginTransaction();
							
							Product product_2 = session_2.load(Product.class, productId);
							//OR
							//product_2 = session_2.get(Product.class, productId);
							
							product_2.setPrice(55000);
							session_2.update(product_2);
							transaction.commit();
							session_2.close();
							

//READ ALL PRODUCTS
//fireSQL(sessionFactory);

Session session_3 = sessionFactory.openSession();
//Query query = session_3.createQuery("from Product");
Query query = session_3.getNamedQuery("getAllProducts");
List<Product> productList = query.list();
for(Product product_3: productList) {
	System.out.println(product_3);
}
session_3.close();


//DELETE ALL PRODUCTS
Session session_4 = sessionFactory.openSession();

Query query_2 = session_4.createQuery("delete from Product");
transaction = session_4.beginTransaction();
int updates = query_2.executeUpdate();
System.out.println("No of records deleted = " + updates);
transaction.commit();
session_4.close();

sessionFactory.close();
*/
	}

}












