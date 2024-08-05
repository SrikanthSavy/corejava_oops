package com.corejava.thread.monitor;

public class Thread2 extends Thread {
	
	DisplayClass displayClass;
	
	public Thread2(DisplayClass dc) {
		this.displayClass = dc;
	}
	
	@Override
	public void run() {
		displayClass.display("Hi, Welcome!");
		
	}

}
