package com.corejava.innerclasses.nested;

//Inner Class -- Nested 
 class Outer
 {
	 int x =10;
	 
	 
	 class Inner { // Inner class
		 int y =20;
		 
		 public void displayInner()
		 {
			 System.out.println("Outer X="+x + "     Inner Y="+y); // Inner class can access Outer class variables 
		 }
	 }
	
	 
	 
	 //Inner inner = new Inner();//Allowed  -- Global to class, can be used in any method of Outer Class
	 
	 public void displayOuter()
	 {
		 Inner inner = new Inner(); // Note: You can create Inner class Obj , inside Outer class (anywhere)
		 inner.displayInner();				 
	 }
	 
 }



public class NestedInnerClass {

	public static void main(String[] args) {
		
		Outer out = new Outer();
		out.displayOuter();
		//out.y; // ERROR: cannot access Inner class var directly

		Outer.Inner outInner = new Outer().new Inner();
		System.out.println("Inner variable y accesed: "+outInner.y);
		
	}

}
