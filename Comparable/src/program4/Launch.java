package program4;

import java.util.ArrayList;
import java.util.Collections;

//sort the Employee based on name
public class Launch {
	
	public static void main(String[] args) {
		Employee tim = new Employee(1,"tim",20000);
		Employee sundar = new Employee(2,"sundar",30000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(tim);
		al.add(sundar);
		
		System.out.println("Before Sorting ");
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println("==========================");
		System.out.println("After Sorting ");
		System.out.println(al);
	}

}
