package com.corejava.thread.inter_thread_cummunication;

public class MainClass {

	public static void main(String[] args) {
		// 
		
		SharedDate sd = new SharedDate();
		
		Producer p = new Producer(sd);
		Consumer c = new Consumer(sd);
		
		
		p.start();
		c.start();

		
		//Problem: 
		/*
		 * Producer Produces: 1
Consumer Reading: 1
Producer Produces: 2
Consumer Reading: 2
Producer Produces: 3
Consumer Reading: 3
Consumer Reading: 3
Consumer Reading: 3
Consumer Reading: 3
Producer Produces: 4
Consumer Reading: 4
Producer Produces: 5
Consumer Reading: 5
Producer Produces: 6

		 */
	}

}
