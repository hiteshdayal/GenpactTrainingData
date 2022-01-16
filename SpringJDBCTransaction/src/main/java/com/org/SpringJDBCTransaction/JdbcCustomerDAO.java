package com.org.SpringJDBCTransaction;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

public class JdbcCustomerDAO implements CustomerDAO {

	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void insert(Customer customer) {

		String sql = "insert into customer (cust_id,name,age) values(?,?,?)";
		Connection con = null;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, customer.getCustId());

			ps.setString(2, customer.getName());
			ps.setInt(3, customer.getAge());
			ps.execute();
			ps.close();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public Customer findByCustomerId(int custId) {
		String sql="select * from customer where cust_id=?";
		Connection con=null;
		try
		{
		con=dataSource.getConnection();
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, custId);

		Customer customer =null;
		ResultSet rs=ps.executeQuery();
		if(rs.next())
		{
		customer=new Customer(rs.getInt("cust_id"), rs.getString("name"), rs.getInt("age"));
		}
		return null;
	}catch (Exception e) {
		// TODO: handle exception
	}
		return null;
		

}

}