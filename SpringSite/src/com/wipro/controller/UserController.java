package com.wipro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wipro.dao.UserDAO;
import com.wipro.model.User;

//controller for all functions relating to the user table

@Controller
@RequestMapping("user")
public class UserController {
	//inject User DAO to controller to use
	@Autowired
	private UserDAO userDAO;
	
	//map user functions to model to be used in a jsp
	@RequestMapping("list") 
	public String listUsers(Model theModel){
		//use DAO to get users
		List<User> allUsers = userDAO.getUsers();
		//add these customers to the Spring model 
		theModel.addAttribute("users", allUsers);
		//name of jsp file to be called
		return "list-users";
	}
}
