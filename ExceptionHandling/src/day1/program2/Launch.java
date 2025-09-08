package day1.program2;

import java.util.Scanner;


public class Launch {
	
	public static void main(String[] args) {
		System.out.println("Connection Established.......");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Numerator");
		int n1 = scan.nextInt();
		
		System.out.println("Enter the Denominator");
		int n2 = scan.nextInt();
		
		try {
			int result=n1/n2;
			System.out.println(result);

		} catch (Exception e) {
			System.out.println("Please Enter the Non zero denominator");
		}
		System.out.println("Connection Terminated.......");

	}

}
