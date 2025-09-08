package program5;

import java.util.ArrayList;
import java.util.Collections;

//sort the employee by salary 
public class Launch {
	
	public static void main(String[] args) {
		Employee tim = new Employee(1,"tim",30000);
		Employee sundar = new Employee(2,"sundar",20000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(tim);
		al.add(sundar);
		
		System.out.println("Before Sorting");
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println("After Sorting ");
		System.out.println(al);
	}

}
