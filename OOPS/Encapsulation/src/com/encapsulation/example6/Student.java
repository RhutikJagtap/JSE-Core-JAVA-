package com.encapsulation.example6;

public class Student {
	private String name;
	private int rollNo;
	private String collegeName;
	

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRollNo(int rollNo) {
		if (rollNo>0) {
			this.rollNo = rollNo;			
		}else {
			System.out.println("Invalid roll Number");
			System.exit(0);
		}
	}
	
	public int getRollNo() {
		return rollNo;
	}
	
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	public String getCollegeName() {
		return collegeName;
	}
	
}
