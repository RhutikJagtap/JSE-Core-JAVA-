package day2.program2;

import java.util.Scanner;

//ArrayIndexOutOfBoundsException
public class Launch {

	public static void main(String[] args) {
		System.out.println("Connection Established");

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the Size Of Array");
		int size = scan.nextInt();

		int arr[] = new int[size];

		try {
			System.out.println("Enter the index which you want to insert data");
			int index = scan.nextInt();
			System.out.println("Enter the data ");
			arr[index] = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Enter the Valid Index");
		}

		System.out.println("Connection Terminated");

	}

}
