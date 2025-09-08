package program2;

import java.util.TreeSet;

//sort employees by id in descending order
public class Launch {
	
	public static void main(String[] args) {
		
		Employee tim = new Employee(1,"tim",20000);
		Employee sundar = new Employee(2,"sundar",30000);
		
		SortByIdInDesc sortByIdInDesc = new SortByIdInDesc();
		
		TreeSet<Employee> ts = new TreeSet<Employee>(sortByIdInDesc);
		ts.add(tim);
		ts.add(sundar);
		
		System.out.println(ts);
		
		
	}

}
