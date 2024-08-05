package com.corejava.thread.monitor;

public class MainClass {

	public static void main(String[] args) {
		
		DisplayClass dc = new DisplayClass();
		
		Thread1 t1 = new Thread1(dc);
		Thread2 t2 = new Thread2(dc);
		t1.start();
		t2.start();
		
		//NOTE: Output will is mixed , based on TImeSlice
		//SOlution:
			//Use "synchronized"{}
			

	}

}
