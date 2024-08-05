package com.corejava.thread.monitor.assignment;

public class Customer extends Thread {

	ATM atm ;	
	String name;
	int amount;
	
	Customer(ATM atm,String name, int amount)
	{
		this.atm= atm;
		this.name= name;
		this.amount = amount;
		
	}
	
	public void useATM()
	{
		atm.checkBalance(name);
		atm.withDraw(name, amount);
	}
	
	@Override
	public void run() {
		useATM();
	}
}
