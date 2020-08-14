package com.example.customer.entity;

public class Customer {

	private Integer customerId;
	private String customerFirstName;
	private String customerLastName;
	private String cutomerEmail;

	public Customer(Integer id, String customerFirstName, String customerLastName, String customerEmail) {
		this.customerId = id;
		this.customerFirstName = customerFirstName;
		this.customerLastName = customerLastName;
		this.cutomerEmail = customerEmail;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getCutomerEmail() {
		return cutomerEmail;
	}

	public void setCutomerEmail(String cutomerEmail) {
		this.cutomerEmail = cutomerEmail;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerFirstName=" + customerFirstName + ", customerLastName="
				+ customerLastName + ", cutomerEmail=" + cutomerEmail + "]";
	}

}
