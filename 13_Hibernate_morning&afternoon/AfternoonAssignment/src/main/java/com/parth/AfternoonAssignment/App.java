package com.parth.AfternoonAssignment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Products products=new Products();
    	products.setPid(1);
    	products.setPname("Product 1");
    	
    	
    	Category category=new Category();
    	category.setCatid(1);
    	category.setCatname("Customer 1");
    	Category category2=new Category();
    	category2.setCatid(2);
    	category2.setCatname("Customer 2");
    	
    	Supplier supplier= new Supplier();
    	supplier.setSupplierid(1);
    	supplier.setSuppliername("Supplier 1");
    	Supplier supplier2= new Supplier();
    	supplier2.setSupplierid(2);
    	supplier2.setSuppliername("Supplier 2");
    	
    	products.getSups().add(supplier);
    	products.getCats().add(category);
    	products.getSups().add(supplier2);
    	products.getCats().add(category2);
    	
    	
    	category.getSups().add(supplier);
    	category2.getSups().add(supplier2);
    	category.setPro(products);
    	
    	supplier.getCategories().add(category);
    	supplier.getProducts().add(products);
    	supplier2.getCategories().add(category2);
    	
    	Configuration config = new Configuration().configure().addAnnotatedClass(Products.class).addAnnotatedClass(Category.class).addAnnotatedClass(Supplier.class);
    	ServiceRegistry registry= new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
    	SessionFactory sf=config.buildSessionFactory(registry);
    	Session session=sf.openSession();
    	
    	session.beginTransaction();
    	
    	session.save(products);
    	session.save(supplier);
    	session.save(category);
    	
    	session.save(supplier2);
    	session.save(category2);
    	
    	session.getTransaction().commit();
    }
}
