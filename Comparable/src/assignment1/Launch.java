package assignment1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//sort the employee based on length of the employee name
public class Launch {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of employees");
		int n = scan.nextInt();
		
		scan.nextLine();  //because buffer problem
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the "+i+"st  Employee details:");
			String details = scan.nextLine();
			
			String[] arr = details.split(",");
			
			int id=Integer.parseInt(arr[0]); //or unboxing int id=Integer.valueOf(arr[0]
			String name=arr[1];
			int salary=Integer.parseInt(arr[2]);
			
			Employee emp = new Employee(id,name,salary);
			
			al.add(emp);
		}
		
		
		
		System.out.println("=======================");
		System.out.println("Before Sorting ");
		for(Employee e:al)
		{
			System.out.println(e);			
		}
		
		Collections.sort(al);
	
		System.out.println("=======================");
		System.out.println("After Sorting ");
		for(Employee e:al)
		{
			System.out.println(e);			
		}
		
	}

}
