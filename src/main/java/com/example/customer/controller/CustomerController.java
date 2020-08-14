package com.example.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.customer.dao.CustomerDAO;
import com.example.customer.entity.Customer;
import com.example.customer.exception.CustomerNotFoundException;

@RestController
public class CustomerController {
	@Autowired
	CustomerDAO dao;

	@GetMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable int id) {
		Customer customerById = dao.getCustomerById(id);

		if (customerById == null) {
			throw new CustomerNotFoundException("Customer id " + id + " not found");
		}
		return customerById;
	}

	@GetMapping("/customers")
	public List<Customer> getAllCustomer() {
		return dao.getAllCustomers();
	}

	@PostMapping("/customers")
	public Customer createCustomer(@RequestBody Customer cust) {
		return dao.createCustomer(cust);
	}

	@PutMapping("/customers/{id}")
	public Customer updateCustomer(@PathVariable int id, @RequestBody Customer cust) {
		Customer updateCustomer = dao.updateCustomer(id, cust);

		if (updateCustomer == null) {
			throw new CustomerNotFoundException("Customer id " + id + " not found");
		}
		return updateCustomer;
	}

	@DeleteMapping("/customers/{id}")
	public Customer deleteCustomer(@PathVariable int id) {
		Customer deleteCustomer = dao.deleteCustomer(id);
		if (deleteCustomer == null) {
			throw new CustomerNotFoundException("Customer id " + id + " not found");
		}

		return deleteCustomer;
	}

}
