package com.corejava.thread.inter_thread_cummunication;

public class Producer extends Thread {
	SharedDate sd;
	
	Producer(SharedDate sd)
	{
		this.sd= sd;
	}

	@Override
	public void run() {
		
		int i= 1;
		while(true)
		{
			sd.setValue(i);
			System.out.println("Producer Produces: "+i);
			i++;
		}
	}
}
