package program2;

import java.util.ArrayList;
import java.util.Collections;

//solution
public class Launch {
	
	public static void main(String[] args) {
		Employee tim = new Employee(1,"tim",20000);
		Employee sundar = new Employee(2,"sundar",30000);
		
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(sundar);
		al.add(tim);
		
		
		//before sorting 
		System.out.println(al);
		
		Collections.sort(al);
		
		//after sorting
		System.out.println(al);
	}

}
