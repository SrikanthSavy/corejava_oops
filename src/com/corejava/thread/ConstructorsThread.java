package com.corejava.thread;

public class ConstructorsThread  extends Thread{
	
	public ConstructorsThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		int count=1;
		while(true)
		{
			System.out.println("COunt:"+count++);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException exp)
			{
				System.out.println("Interrupted Exception  invokeds ");
				System.out.println(exp.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		
		Thread thread1 = new ConstructorsThread("Shoda-Thread-1");
		System.out.println("ID:"+thread1.getId());
		System.out.println("Name:"+thread1.getName());
		System.out.println("prority:"+thread1.getPriority());
		System.out.println("State: Before :"+thread1.getState());
		thread1.setDaemon(true);
		thread1.start();
		System.out.println("State: After:"+thread1.getState());
		//System.out.println(":"+thread1.);
		System.out.println("Alive:"+thread1.isAlive());
		
		System.out.println("Thread CurrentThread:"+Thread.currentThread());
		/*
		 * 	ID:23
			Name:Shoda-Thread-1
			prority:5
			State: Before :NEW
			State: After:RUNNABLE
			Alive:true
			Thread CurrentThread:Thread[main,5,main]
		 */
		
		
		thread1.setPriority(MAX_PRIORITY);
		System.out.println("prority:"+thread1.getPriority());
		//thread1.interrupt();
		try {
			Thread.sleep(5000);
		}catch(InterruptedException exp)
		{
			System.out.println(exp.getMessage());
		}
	}
}
