package program6;

import java.util.TreeSet;

//if names are same then sort based on id
public class Launch {
	
	public static void main(String[] args) {
		Employee tim = new Employee(1,"tim",20000);
		Employee sundar = new Employee(2,"tim",30000);
		
		TreeSet<Employee> ts = new TreeSet<Employee>();
		ts.add(tim);
		ts.add(sundar);
		
		System.out.println(ts);
		
		
	}

}
