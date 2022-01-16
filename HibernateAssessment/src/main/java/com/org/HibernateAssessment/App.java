package com.org.HibernateAssessment;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

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
        
        Vendor vendor = new Vendor();
        vendor.setVendorId(100);
        vendor.setVendorName("IBM");
        
        Customer customer1 = new Customer();
        customer1.setCustomerId(101);
        customer1.setCustomerName("NIFY");
        customer1.setCustomerAddress("BANG");
        
        Customer customer2 = new Customer();
        customer2.setCustomerId(102);
        customer2.setCustomerName("TCS");
        customer2.setCustomerAddress("HYD");
        
        Set<Customer> customers = new HashSet<>();
        customers.add(customer1);
        customers.add(customer2);
        
        vendor.setCustomers(customers);
        
        //sess.save(customers);
        sess.save(vendor);
        
        sess.getTransaction().commit();
        System.out.println("Data Saved Successfully");
        sess.close();
        
        
        
        
    }
}
