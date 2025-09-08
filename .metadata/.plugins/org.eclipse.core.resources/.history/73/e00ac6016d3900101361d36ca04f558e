package com.static_variable.program2;

import java.util.Scanner;

public class BusinessMan {
	
	float si;
	float p;
	float t;
	
	static float r;
	
	static {
		r=15.5f;
	}
	
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the principal amount");
		 p = scan.nextFloat();
		 
		 System.out.println("Enter the time");
		 t=scan.nextFloat();
		 
	}
	
	
	public void calcInterest() {
		si=(p*t*r)/100;
	}
	
	public void disp() {
		System.out.println(si);
	}

}
