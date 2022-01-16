package com.org.JDBCDemo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Hello World!" );
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriver(new com.mysql.cj.jdbc.Driver());
        dataSource.setUrl("jdbc:mysql://localhost:3306/db_spring");
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);



        String sqlInsert = "INSERT INTO Employee (id, name, salary)"
        + " VALUES (?, ?, ?)";
        jdbcTemplate.update(sqlInsert, 1,"Tom", 12345);



        String sqlUpdate = "UPDATE Employee set name=? where id=?";
        jdbcTemplate.update(sqlUpdate, "vee@mail.com", 1);



        String sqlSelect = "SELECT * FROM employee";
        List<Employee> listContact = jdbcTemplate.query(sqlSelect, new RowMapper<Employee>() {



        public Employee mapRow(ResultSet result, int rowNum) throws SQLException {
        Employee contact = new Employee();

        contact.setName(result.getString("name"));
        contact.setId(2);
        contact.setSalary(57);




        return contact;
        }



        });
        
        for(Employee e:listContact) {
        	System.out.println(e);
        	}
        	String sqlDel="delete from Employee where id=?";
        	jdbcTemplate.update(sqlDel);

    }
}
