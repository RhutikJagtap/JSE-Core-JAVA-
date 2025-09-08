package program1;

import java.util.ArrayList;
import java.util.Collections;

//problem
public class Launch {
	
	public static void main(String[] args) {
		Employee tim = new Employee(1,"tim",20000);
		Employee sundar = new Employee(2,"sundar",20000);
		
		ArrayList al = new ArrayList();
		al.add(sundar);
		al.add(tim);
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
	}

}
