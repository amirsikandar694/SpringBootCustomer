package com.example.customer.dao;

import java.util.List;

import com.example.customer.entity.Customer;

public interface CustomerDAO {
	
	public Customer getCustomerById(int id);
	public List<Customer> getAllCustomers();
	public Customer createCustomer(Customer cust);
	public Customer updateCustomer(int id,Customer cust);
	public Customer deleteCustomer(int id);

}
