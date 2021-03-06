package com.sandeep.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sandeep.springdemo.dao.CustomerDAO;
import com.sandeep.springdemo.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// need to inject the DAO into the controller
	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/list")
	public String listCustomers(Model theModel)
	{
		
		//get Customer DAO
		List<Customer>theCustomers=customerDAO.getCustomers();
		
		//add the Customers to Model
		theModel.addAttribute("customers",theCustomers);
		
		return "list-customers";
	}

}
