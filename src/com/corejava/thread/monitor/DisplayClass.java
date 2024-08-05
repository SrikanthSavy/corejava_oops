package com.corejava.thread.monitor;

public class DisplayClass {
	// Will take String and display char by char
	
	public void display(String str)
	{
		// We want only this for() to be synchronized
		synchronized (this) {
			for(int i=0;i<str.length();i++)
			{
				System.out.print(str.charAt(i));
				try{ Thread.sleep(1000);}catch(InterruptedException e) {}
			}
		}
	}
	
	//Or you can make entire method as synchronised 
	synchronized public void display2(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
	}


}




