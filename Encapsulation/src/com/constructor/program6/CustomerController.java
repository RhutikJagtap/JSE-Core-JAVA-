package com.constructor.program6;

//local chaining example 3
public class CustomerController {
	
	public static void main(String[] args) {
		Customer customer = new Customer(2,"RJ",2332);
		
		System.out.println(customer.getcId());
		System.out.println(customer.getcName());
		System.out.println(customer.getcNum());
		
	}

}
