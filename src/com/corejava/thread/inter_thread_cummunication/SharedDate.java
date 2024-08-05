package com.corejava.thread.inter_thread_cummunication;

public class SharedDate {

	int value = 0;
	boolean flag = true; // TO do Inter-Thread- Communication ( Synchorinicxation 
	
	synchronized public void setValue(int value) {
		
		while(flag!=true)
		{	try{ wait(); }catch (Exception e) {} } // Wait till the flag =true		
		
		
		this.value = value;
		flag = false; //Update the Flag = false;  **********
		notify(); // Notify other Thread , Thats its complete 
		
		//try{Thread.sleep(100);}catch (Exception e) {}
	}

	synchronized public int getValue() {
	
		int x=0 ;

		while(flag!=false)
		{	try{ wait(); }catch (Exception e) {} } // Wait till the flag =false
		
		//try{Thread.sleep(2000);}catch (Exception e) {}
		
		x= value; // just to understand the flow sleep()
		//Update the Flag = false;  **********
		flag = true;
		notify(); // Notify other Thread , Thats its complete 
		
		return x;

	}

	
	
	
	
}

/* 
 * PROBLEM : 
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

 * */
