package com.ibm.bank;

public class Account {
	private double balance;

	public Account() {
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	 public double deposit(double amount) throws NumberFormatException {
		 if(amount<0)
			 throw new NumberFormatException("Negative amount");
		 balance+=amount;
		 return balance;
	 }
	 
	 public double withdraw(double amount) throws BalanceException,NumberFormatException {
		 if(amount<0)
			 throw new NumberFormatException("Negative amount");	 
		 if(amount> balance)
		 throw new BalanceException("Invalid Balance");
		
		 balance-=amount;
		 return balance;
	 }
	 public int square(int a)
	 {
		 return a*a;
	 }
}
