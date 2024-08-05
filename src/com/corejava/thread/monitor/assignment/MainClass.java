package com.corejava.thread.monitor.assignment;

public class MainClass {

	public static void main(String[] args) {
		
		ATM atm = new ATM();
		
		Customer c1 = new Customer(atm,"Shoda",500);
		Customer c2 = new Customer(atm,"Srikanth", 700);
		
		c1.start();
		c2.start();
		
	}

}
