package com.customer.reservation.system.service;

import org.springframework.stereotype.Service;

import com.customer.reservation.system.entity.Customer;

@Service
public interface CustomerService {

	Customer insertCustomer(Customer c);

}
