package come.corejava.inheritence.constructor;

//Inner class
class Parent1
{
	Parent1()
	{
		System.out.println("Parent NON-Paramter const()");
	}
	
	Parent1(int x)
	{
		System.out.println("Parent PARAMETRIZED const(): "+x);
	}
}


//Second Inner class
class Child1 extends Parent1
{
	Child1()
	{
		System.out.println("Child NON-Paramter const()");
	}
	
	Child1(int y)
	{
		System.out.println("Child PARAMETRIZED const(): "+y);
	}
	
	// To Call Parent Class - Parameterized COnstructor
	Child1(int x,int y)
	{
		super(x);// calling parent - parameter- constructor
		System.out.println("Child PARAMETRIZED const(): "+y);
	}
}

// MAin Class
public class ParameterConstructorInheritance {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1(); //1)Parent NON-Paramter const() 2)Child NON-Paramter const()
		Child1 c2 = new Child1(10);//1) Parent NON-Paramter const() 2)Child PARAMETRIZED const(): 10
		// Note this still calls non-parameterized Parent Constructor
		
		Child1 c3 = new Child1(5,10); // 1) Parent PARAMETRIZED const(): 5   2)Child PARAMETRIZED const(): 10
	}

}
