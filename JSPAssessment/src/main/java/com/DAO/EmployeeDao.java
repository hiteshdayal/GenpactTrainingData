package com.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;

import com.employee.Employee;

public class EmployeeDao {

	public int register(Employee emp) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			  System.out.println("connection ready");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
			System.out.println(con);
			
			PreparedStatement ps = con.prepareStatement("insert into employee(first_name,last_name,username,password,address,contact) values(?,?,?,?,?,?)");
			ps.setString(1, emp.getFirstname());
			ps.setString(2, emp.getLastname());
			ps.setString(3, emp.getUsername());
			ps.setString(4, emp.getPassword());
			ps.setString(5, emp.getAddress());
			ps.setString(6, emp.getContact());
			int row = ps.executeUpdate();
			System.out.println("row : "+ row);
			return row;
		}catch(Exception e){
			System.out.println(e);
		}
		return 0;
		

	}
	
}
