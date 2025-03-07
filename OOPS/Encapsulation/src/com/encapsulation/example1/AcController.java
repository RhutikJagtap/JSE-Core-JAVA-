package com.encapsulation.example1;

public class AcController {
	
	public static void main(String[] args) {
		AC ac = new AC();
//		ac.coolant="liquid";
		
		ac.setCoolant("liquid");
		System.out.println(ac.getCoolant());
	}

}
