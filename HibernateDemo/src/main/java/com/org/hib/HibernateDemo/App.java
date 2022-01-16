package com.org.hib.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.org.hib.model.Address;
import com.org.hib.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration  cfg= new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory fact = cfg.buildSessionFactory();
        Session sess= fact.openSession();
        sess.beginTransaction();

		/*
		 * Book book=new Book(); book.setBno(401);
		 * book.setBname("Java Complete Reference"); book.setPrice(550);
		 * 
		 * sess.save(book);
		 */
        
        Employee emp = new Employee();
        emp.setName("Hitesh");
        //emp.setEmployeeId(1);
        emp.setEmail("hiteshdayal@gmail.com");
        
        Address address = new Address();
        //address.setAddressId(1);
        address.setAddressLine1("Kanpur UP");
        address.setCity("Kanpur");
        address.setCode(208017);
        address.setCountry("India");
        address.setState("UP");
        address.setEmployee(emp);
        
        emp.setAddress(address);
        
        sess.save(address);
        sess.save(emp);
        
        
        System.out.println("Employee data saved successfully");
        
        
        sess.getTransaction().commit();
        System.out.println("saved successfully "); 
        
        
        sess.close();     
        
        
    }
}
