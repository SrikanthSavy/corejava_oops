package com.corejava.thread;

class MyThread extends Thread
{
	@Override
	public void run() {
	
		int i=1;
		while(true)
		{
			System.out.println(i+ " Hello");
		}
	}
}

public class ThreadMain {

	public static void main(String[] args) {
		
		MyThread thread = new MyThread();
		thread.start();
		
		int i=1;
		while(true)
		{
			System.out.println(i+ " World");
		}
	}
}
