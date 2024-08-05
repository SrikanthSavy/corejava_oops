package com.corejava.thread.monitor.assignment;

public class ATM {

	synchronized public void checkBalance(String name)
	{
		
		System.out.println("Hi "+ name);
		try{Thread.sleep(5000);}catch(InterruptedException e) {};
		System.out.println("Checking Balance");
		
		
	}
	
	synchronized public void withDraw(String name, int amt)
	{
		
		System.out.println("Hi "+name);
		try{Thread.sleep(5000);}catch(InterruptedException e) {};
		System.out.println("your account has been debited with $"+amt);
	}	
	
}
