package com.pack.service;

import java.util.List;

import com.pack.form.Customer;

public interface CustomerService {
	public void addCustomer(Customer c);
	public void updateCustomer(Customer c);
	public List<Customer> listCustomer();
	public Customer getCustomerById(int cid);
	public void removeCustomer(int customerId);
}
