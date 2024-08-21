package com.corejava.interfaces;

interface Test
{
	void method1();
	void method2();
	/*void m()  //Since All methods() in Interface are Abstract
	{		System.out.println("lol, This is not allowed!");}
	*/
}

class TestImpl implements Test
{
	@Override
	public void method1() {
		System.out.println("Method1()- Overridede!");
		
	}
	
	@Override
	public void method2() {
		System.out.println("Method2()- Overridede!");
	}
	
	// Custom class Method()
	public void method3() {
		System.out.println("Method3()- Custome Methods!");
	}
	
}

// Therefor, Interfaces ==> help achieve "Runtime Polymorphism" & "Dynamic Method Dispatch"

public class InterfacePractice {

	public static void main(String[] args) {
	
		Test test = new TestImpl();
		test.method1();
		test.method2();
		//test.method3(); //ERROR , since PArent Inteface refence cannot point to sub class mthod
		TestImpl testImpl = new TestImpl();
		testImpl.method3(); //o/p: Method3()- Custome Methods!
		

	}

}
