package com.corejava.thread.inter_thread_cummunication;

public class Consumer extends Thread {
	
	SharedDate sd;
	
	public Consumer(SharedDate sd) {
		this.sd=sd;
	}
	
	@Override
	public void run() {
		
		while(true)
		{
			System.out.println("Consumer Reading: "+sd.getValue());
		}
	}

}
