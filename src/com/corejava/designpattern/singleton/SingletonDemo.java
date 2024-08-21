package com.corejava.designpattern.singleton;

//Coffe MAchine Example 

class CoffeMachine
{
	private float coffeQty;
	private float milkQty;
	private float waterQty;
	private float sugarQty;
	
	//Important to implementing Singleton : Declare Construtor as Private
	private CoffeMachine()
	{
		coffeQty	=1;
		milkQty		=1;
		waterQty	=1;
		sugarQty	=1;
	}

	//NOTE: we wont be able to create an Instance of this class directly using "new"
	// We need a static method , which will create only 1 instance of this
	// to do this we need a static member "cofemachine" {ITS should be PRIVATE static member}
	static private CoffeMachine cMachine  =null; 
	static CoffeMachine getSingleInstance()
	{
		if(cMachine==null)                // Only when static member is null i.e. no obj is avaliable 
			cMachine= new CoffeMachine(); // This can call private Constructor here and asisgn the value to static member 
		
		return cMachine;
	}
	
	
	public void fillWater(float qty)
	{
		waterQty = qty;
	}
	
	public void fillSugar(float qty)
	{
		sugarQty = qty;
	}
	
	public void fillMilk(float qty)
	{
		milkQty = qty;
	}
	
	
	
}



public class SingletonDemo {

	public static void main(String[] args) {

		
		CoffeMachine c1 = CoffeMachine.getSingleInstance();
		CoffeMachine c2 = CoffeMachine.getSingleInstance();
		CoffeMachine c3 = CoffeMachine.getSingleInstance();
		
		System.out.println("C1 instance ="+c1);
		System.out.println("C2 instance ="+c2);
		System.out.println("C3 instance ="+c3);
		
		if(c1==c2 && c2==c3)
			System.out.println("ALL Objects are same ");
		
	}

}
