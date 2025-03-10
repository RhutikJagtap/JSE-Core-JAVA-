package com.encapsulation.example6;

public class StudentController {
	public static void main(String[] args) {
		Student student = new Student();
		student.setName("Rhutik");
		student.setRollNo(16789);
		student.setCollegeName("MES Abasaheb Garware College Pune");
		
		System.out.println("Student Name= "+student.getName());
		System.out.println("Student RollNo= "+student.getRollNo());
		System.out.println("Student College Name= "+student.getCollegeName());
	}

}
