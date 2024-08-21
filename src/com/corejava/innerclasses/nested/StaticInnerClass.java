package com.corejava.innerclasses.nested;

class Outer3
{
	int x=10;
	//static variable
	static int y=20;
	
	static class Inner
	{
		public void show()
		{
			System.out.println("static Y="+y);
			//ERROR
			//System.out.println("Non Static variable X="+x); cannot access Non-Static variables
		}
	}
}




public class StaticInnerClass {

	public static void main(String[] args) {
		
		Outer3.Inner outInner = new Outer3.Inner();  
		//Outer3.Inner outInner = new Outer3.new Inner();  //No Need for new- second time
		
		outInner.show();  //O/p: static Y=20
	}

}
