package com.pack.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pack.dao.CustomerDao;
import com.pack.form.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
	private static Logger log=Logger.getLogger(CustomerServiceImpl.class);
	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	@Override
	@Transactional
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		log.info("Inside service's addcustomer");
		customerDao.addCustomer(c);
	}

	@Override
	@Transactional
	public void updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		log.info("Inside service's updateCustomer");
		customerDao.updateCustomer(c);
	}

	@Override
	@Transactional
	public List<Customer> listCustomer() {
		// TODO Auto-generated method stub
		log.info("Inside service's listcustomer");
		List<Customer> l=customerDao.listCustomer();
		return l;
	}

	@Override
	@Transactional
	public Customer getCustomerById(int cid) {
		// TODO Auto-generated method stub
		log.info("Inside service's getCustomerById");
		Customer c=customerDao.getCustomerById(cid);
		return c;
	}

	@Override
	@Transactional
	public void removeCustomer(int customerId) {
		// TODO Auto-generated method stub
		log.info("Inside service's removeCustomer");
		customerDao.removeCustomer(customerId);
	}

}
