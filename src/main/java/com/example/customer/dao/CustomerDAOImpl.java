package com.example.customer.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.customer.entity.Customer;

@Component
public class CustomerDAOImpl implements CustomerDAO {
	
	private static List<Customer> customer= new ArrayList<Customer>(); 
	static int counter=0;
	
	static {
		customer.add(new Customer(++counter, "Amir", "Sikandar", "amir.sikandar@gmail.com"));
		customer.add(new Customer(++counter, "Aashu", "Pandey", "aashu.pandey@gmail.com"));
		customer.add(new Customer(++counter, "Neha", "Rastogi", "neha.rastogi@gmail.com"));
		customer.add(new Customer(++counter, "Afnan", "Rashid", "afnan.rashid@gmail.com"));
	}

	@Override
	public Customer getCustomerById(int id) {
		Customer tempCustomer=null;
		for(Customer customer:customer)
		{
			if(customer.getCustomerId()==id)
			{
				tempCustomer=customer;
				break;
			}
		}
		return tempCustomer;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customer;
	}

	@Override
	public Customer createCustomer(Customer cust) {
		Customer custSave=cust;
		custSave.setCustomerId(++counter);
		customer.add(custSave);
		return custSave;
	}

	@Override
	public Customer updateCustomer(int id, Customer cust) {
		// TODO Auto-generated method stub
		Customer custUpdate=null;
		for (Customer customer : customer) {
			if (customer.getCustomerId() == id) {
				customer.setCustomerFirstName(cust.getCustomerFirstName());
				customer.setCustomerLastName(cust.getCustomerLastName());
				customer.setCutomerEmail(cust.getCutomerEmail());
				custUpdate = customer;
				break;
			}
		}
		return custUpdate;
	}

	@Override
	public Customer deleteCustomer(int id) {
		// TODO Auto-generated method stub
		Customer deletedCustomer = null;
		Iterator<Customer> itr = customer.iterator();
		while (itr.hasNext()) {
			Customer emp = itr.next();
			if (emp.getCustomerId() == id) {			
				itr.remove();
				deletedCustomer = emp;
			}
		}
		return deletedCustomer;
	}
}
