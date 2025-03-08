package com.encapsulation.example3;

public class Mobile {
	private String name;
	private String processor;
	int price;
	
	
	public void setName(String name){
		this.name=name;
	}
	
	public String getName(){
		return name;
	}
	
	public void setProcessor(String processor){
		this.processor=processor;
	}
	
	public String getProcessor(){
		return processor;
	}
	
	public void setPrice(int price){
		this.price=price;
	}
	
	public int getPrice(){
		return price;
	}
}
