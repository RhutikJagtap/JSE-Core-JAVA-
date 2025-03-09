package com.encapsulation.example5;

public class EmployeeController {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setName("Alex");
		employee.setAge(-19);
		
		System.out.println("Employee Name= "+employee.getName());
		System.out.println("Employee age= "+employee.getAge());
	}

}
