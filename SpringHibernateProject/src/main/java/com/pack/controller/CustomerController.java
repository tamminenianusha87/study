package com.pack.controller;

import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pack.form.Customer;

@Controller
public class CustomerController {

	private static Logger log=Logger.getLogger(CustomerController.class);
	@RequestMapping(value="/index")
	public String listCustomer(Map<String,Object> map)
	{
		map.put("customer",new Customer());
		log.info("Inside list customer");
		return "customer";
	}
}
