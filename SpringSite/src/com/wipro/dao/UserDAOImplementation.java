package com.wipro.dao;
//unfinished
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wipro.model.User;

//implementation of UserDAO
@Repository
public class UserDAOImplementation implements UserDAO {
	
	//inject the hibernate session factory to DAO
	@Autowired
	private SessionFactory sessionFactory;
	
	//this function returns a list of all users (using the user bean) into 
	@Transactional //automates the creation of the transaction for the session factory
	public List<User>getUsers(){
		//get current hibernate session, this is what will be used to run queries on hibernate to talk to the database
		Session currentSession = sessionFactory.getCurrentSession();
		
		//create query for hibernate ( from <your model/bean name> order by field "firstName"
		List<User> Userlist = currentSession.createQuery("from User order by firstname").list();
		
		//return list of users taken from hibernate session 
		return Userlist;
	}
}
