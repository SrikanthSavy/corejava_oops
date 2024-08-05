package com.corejava.thread.monitor;

public class Thread1 extends Thread{
	
	DisplayClass dc;
	
	public Thread1(DisplayClass dc) {
		this.dc = dc;
	}
	
	
	@Override
	public void run() {
		dc.display("Hello World!");
		
	}
	
}
