package com.encapsulation.example4;

public class CustomerController {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		customer.setCId(101);
		customer.setCName("John");
		customer.setPhoneNumber(9867547632L);
		
		System.out.println("Customer Id= "+customer.getCId());
		System.out.println("Customer Name= "+customer.getCName());
		System.out.println("Customer PhoneNumber= "+customer.getPhoneNumber());
	}
}
