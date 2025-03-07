package com.encapsulation.example2;

public class BankController {
	
	public static void main(String[] args) {
		Bank bank = new Bank();
	
		bank.setAccountNumber(98765434);
		System.out.println("Account Number "+bank.getAccountNumber());
		
		bank.setPin(7385);
		System.out.println("Pin "+bank.getPin());
		
		bank.setBalance(-30000);
		System.out.println("Balance "+bank.getBalance());
	}

}
