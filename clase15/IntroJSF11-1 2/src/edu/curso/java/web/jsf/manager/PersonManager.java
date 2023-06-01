package edu.curso.java.web.jsf.manager;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.*;

import edu.curso.java.web.jsf.bo.Person;


public class PersonManager {
	
	private Connection newConnection() throws NamingException, SQLException {
		
		Context envCtx = (Context) new InitialContext().lookup("java:comp/env");
	    DataSource  ds = (DataSource) envCtx.lookup("jdbc/GeneralDB");

		return ds.getConnection();	
	}
	
	
	
	public int createNewPerson(Person person) throws Exception {
		Connection connection = null;
		int personId = -1;
		try {
			connection = this.newConnection();
			String sql = "INSERT INTO persons (firstName, lastName, age, email) VALUES (?,?,?,?);";
			PreparedStatement statement = connection.prepareStatement(sql,  Statement.RETURN_GENERATED_KEYS);
			statement.setString(1, person.getFirstName());
			statement.setString(2, person.getLastName());
			statement.setInt(3, person.getAge());
			statement.setString(4, person.getEmail());
			statement.execute();
			ResultSet rs = statement.getGeneratedKeys();
		    if (rs.next()) 
		    	personId = rs.getInt(1);

		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if(connection!=null)
					connection.close();
			} catch (Exception ex2) {}
			
		}

		return personId;
	}
	
	public List<Person> getPersonList() throws Exception {
		Connection connection = null;
		List<Person> personList = new ArrayList<Person>();
		Person person = null;
		int personId = -1;
		try {
			connection = this.newConnection();
			String sql = "SELECT idPerson, firstName, lastName, age, email FROM persons;";
			Statement statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery(sql);
		    while(rs.next()) {
		    	person = new Person();
		    	person.setId(rs.getInt("idPerson"));
		    	person.setFirstName(rs.getString("firstName"));
		    	person.setLastName(rs.getString("lastName"));
		    	person.setAge(rs.getInt("age"));
		    	person.setEmail(rs.getString("email"));
		    	personList.add(person);
		    }
		    
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if(connection!=null)
					connection.close();
			} catch (Exception ex2) {}
			
		}

		return personList;
	}
	
	
	public Person getPerson(int id) throws Exception {
		Connection connection = null;
		Person person = null;
		try {
			connection = this.newConnection();
			String sql = "SELECT idPerson, firstName, lastName, age, email FROM persons WHERE idPerson = " + id + ";";
			Statement statement = connection.createStatement();
			
			ResultSet rs = statement.executeQuery(sql);
		    if(rs.next()) {
		    	person = new Person();
		    	person.setId(rs.getInt("idPerson"));
		    	person.setFirstName(rs.getString("firstName"));
		    	person.setLastName(rs.getString("lastName"));
		    	person.setAge(rs.getInt("age"));
		    	person.setEmail(rs.getString("email"));
		    }
		    
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				if(connection!=null)
					connection.close();
			} catch (Exception ex2) {}
			
		}

		return person;
	}



	public void updatePerson(Person person) {
		// TODO Auto-generated method stub
		
	}
	
}
