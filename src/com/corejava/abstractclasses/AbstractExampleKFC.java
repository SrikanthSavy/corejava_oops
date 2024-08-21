package com.corejava.abstractclasses;

abstract class KFC
{
	public KFC() {
		System.out.println("KFC Constrcutor called");
	}
	
	void makeIteam()
	{
		System.out.println("Rules defined to make Chicken Dishes!");
	}
	
	// These should be implemented by concreate Subclass
	abstract void billing();
	abstract double discounts();
}

// class Sub class
class ShodaKFC extends KFC
{
	ShodaKFC()
	{
		System.out.println("SHHODA KFC _ Instance creation.");
	}
	
	void billing()
	{
		System.out.println("Billing Implemented !");
	}
	double discounts()
	{	
		System.out.println("Discoint given !");
		return 10.0;
	}
	
}



public class AbstractExampleKFC {

	public static void main(String[] args) {

		//KFC kfc = new KFC();//Not- allowed
		KFC kfc = new ShodaKFC(); // Both Parent const & Sub class COnst are called here!
		kfc.makeIteam();
		//Implementing abstract()
		kfc.discounts(); 
		kfc.billing();

	}

}
