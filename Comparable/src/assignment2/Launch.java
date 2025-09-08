package assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

//sort based on second character of name
public class Launch {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of Employees");
		int n = scan.nextInt();
		
		scan.nextLine();
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the Details of "+i+"st employee");
			String details = scan.nextLine();
			
			String[] arr = details.split(",");
			int id=Integer.parseInt(arr[0]);
			String name=arr[1];
			int salary=Integer.parseInt(arr[2]);
			
			Employee emp = new Employee(id,name,salary);
			al.add(emp);
		}
		
		System.out.println("=============================");
		System.out.println("Before Sorting Employees");
		for(Employee e:al)
		{
			System.out.println(e);			
		}
		
		System.out.println("=============================");
		
		Collections.sort(al);
		
		System.out.println("After Sorting Employees");
		for(Employee e:al)
		{
			System.out.println(e);			
		}
		

		
		
	}

}
