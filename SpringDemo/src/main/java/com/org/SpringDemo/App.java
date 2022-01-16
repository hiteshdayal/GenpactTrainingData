package com.org.SpringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorldService service = (HelloWorldService) ac.getBean("hello");
        
        System.out.println(service.infoData());
        
        EmployeeBean employee = (EmployeeBean) ac.getBean("emp");
        System.out.println(employee);
        
		
		  EmployeeBean emp = (EmployeeBean) ac.getBean("TestBean");
		  System.out.println(emp);
		 
        
    }
}
