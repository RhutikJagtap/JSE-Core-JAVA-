package day2.program1;

import java.util.Scanner;

//handle the InputMismatchException
public class Launch {

	public static void main(String[] args) {
		System.out.println("Connection Established.......");
		Scanner scan = new Scanner(System.in);

		try {
			System.out.println("Enter the first Integer");
			int n1 = scan.nextInt();

			System.out.println("Enter the second Integer");
			int n2 = scan.nextInt();

			int result = n1 + n2;
			System.out.println(result);

		} catch (Exception e) {
			System.out.println("Please Enter Valid Input");
		}

		System.out.println("Connection Terminated.......");

	}

}
