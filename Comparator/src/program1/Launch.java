package program1;

import java.util.TreeSet;

//sort based on Id in Ascending order
public class Launch {
	
	public static void main(String[] args) {
		Employee tim = new Employee(1,"tim",20000);
		Employee sundar = new Employee(2,"sundar",30000);
		
		SortByIdInAsc sortByIdInAsc = new SortByIdInAsc();
		
		
		TreeSet<Employee> ts = new TreeSet(sortByIdInAsc);
		ts.add(tim);
		ts.add(sundar);
		
		System.out.println(ts);
		
	}

}
