package day1.program1;

import java.util.Scanner;


//Enter the Numerator
//10
//Enter the Denominator
//0
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at ExceptionHandling/program1.Launch.main(Launch.java:16)

public class Launch {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Numerator");
		int n1 = scan.nextInt();
		
		System.out.println("Enter the Denominator");
		int n2 = scan.nextInt();
		
		int result=n1/n2;
		
		System.out.println(result);
	}

}
