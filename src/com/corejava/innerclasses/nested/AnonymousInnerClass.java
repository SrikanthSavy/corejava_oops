package com.corejava.innerclasses.nested;

//declasre abstract class  or Interface 

abstract class  MyAbstractClass
{
	abstract void displayAbstract();
}

class Outer2
{
	int x =20;
	
	public void displayOuter()
	{
		MyAbstractClass abstractClass = new MyAbstractClass() {
			@Override
			void displayAbstract() {
				System.out.println("Hello from Abstract class displayAbstr() x="+x);
			}
		};
		
		abstractClass.displayAbstract();
	}
}


public class AnonymousInnerClass {

	public static void main(String[] args) {
		
		Outer2 out = new Outer2();
		out.displayOuter();  //O/P : Hello from Abstract class displayAbstr() x=20

	}

}
