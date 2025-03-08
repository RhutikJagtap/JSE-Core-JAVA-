package com.encapsulation.example3;

public class MobileController {
	public static void main(String[] args) {
		Mobile mobile = new Mobile();
//		mobile.name="Iphone14"; //The field Mobile.name is not visible
//		mobile.processor="ffkfj"; //The field Mobile.processor is not visible
		
		mobile.setName("vivo 19");
		mobile.setProcessor("2.3GHz Octa core");
		mobile.setPrice(19000);
		
		System.out.println("Mobile Name= "+mobile.getName());
		System.out.println("Mobile processor= "+mobile.getProcessor());
		System.out.println("Mobile price= "+mobile.getPrice());
		
		System.out.println("========================================");
		
		Mobile mobile2 = new Mobile();
		mobile2.setName("IPHONE");
		mobile2.setProcessor("A 16 Bionic");
		mobile2.setPrice(100000);
		
		System.out.println("Mobile Name= "+mobile2.getName());
		System.out.println("Mobile processor= "+mobile2.getProcessor());
		System.out.println("Mobile price= "+mobile2.getPrice());
		
		
		
	}
	

}
