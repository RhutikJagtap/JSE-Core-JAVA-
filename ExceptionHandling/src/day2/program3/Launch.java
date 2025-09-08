package day2.program3;

import java.util.Scanner;

//NegativeArraySizeException
public class Launch {
	
	public static void main(String[] args) {
		System.out.println("Connection Established...");

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=scan.nextInt();

		try {
			int arr[]=new int[size];
		} catch (Exception e) {
			System.out.println("Array size Can not be Negative");
		}
		
		
		
		System.out.println("Connection Terminated...");
		
	}

}
