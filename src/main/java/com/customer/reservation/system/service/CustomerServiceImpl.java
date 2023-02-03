package com.customer.reservation.system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.customer.reservation.system.entity.Customer;
import com.customer.reservation.system.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer insertCustomer(Customer c) {
		
		
		return customerRepository.save(c);
		 
	}

}
