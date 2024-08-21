package com.corejava.innerclasses.nested;


class Outer1
{
	int x=10;
	
	public void displayOuter()
	{
		 class Inner  // Local Inner class to displayOuter()
		{
			public void show()
			{
				System.out.println("Show from Innerclass");
			}
		}
		
		Inner inner = new Inner();
		inner.show();
		
	}
}


public class LocalInnerClass {

	public static void main(String[] args) {
		
		Outer1 out = new Outer1();
		out.displayOuter();
	}

}
