package com.corejava.thread;

class MyRunnable implements Runnable
{
	@Override
	public void run() {
		int i=1;
		while(i<11)
		{
			System.out.println(i+ " Hello");
			i++;
		}
	}
}

public class RunnableMain {

	public static void main(String[] args) {
		
		//Create an Instance of Runnable
		MyRunnable runnableInstance = new MyRunnable();
		//NOTE: it cannot run on its own
		//Need a horse , ii.e "Thread" class instance(runnableInstance)
		Thread t = new Thread(runnableInstance);
		t.start(); // Start the Thread
		
		int i=1;
		while(i<11)
		{
			System.out.println(i+ " World");
			i++;
		}
	}
}
