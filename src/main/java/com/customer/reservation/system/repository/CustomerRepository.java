package com.customer.reservation.system.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.customer.reservation.system.entity.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	

}
