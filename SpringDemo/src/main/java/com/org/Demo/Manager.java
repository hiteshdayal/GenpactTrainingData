package com.org.Demo;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee{

	Accountant acc ;
	TestBean1 tbean;

    public Manager(Accountant acc) {
        System.out.println("Manager Constructor");
        this.acc = acc;
    }
    public void doWork() {
        // TODO Auto-generated method stub
     System.out.println(" Manager  - Manage the branch Office ");
    }
 
    public void callMeeting() {
        acc.doWork();
        tbean.doWork();
	
}
}
