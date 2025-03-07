package com.encapsulation.example2;

public class Bank {
	private int accountNumber;
	private int pin;
	private int balance;
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber=accountNumber;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setPin(int pin) {
		this.pin=pin;
	}
	
	public int getPin(){
		return pin;
	}
	
	public void setBalance(int balance) {
		if (balance>=0) {
			this.balance=balance;			
		} else {
			System.out.println("Balance cannot be Negative");
			System.exit(balance);
		}
	}
	
	public int getBalance(){
		return balance;
	}

}
