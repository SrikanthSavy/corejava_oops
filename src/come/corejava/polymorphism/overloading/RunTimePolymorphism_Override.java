package come.corejava.polymorphism.overloading;

class Parent
{
	void display()
	{
		System.out.println("Super Display!");
	}
}

class Child extends Parent
{
	@Override
	void display()
	{
		System.out.println("Sub Display!");
	}
}

public class RunTimePolymorphism_Override {

	public static void main(String[] args) {
		
		//RUntime Polymorphism
		Parent parent = new Child();
		parent.display(); //o/p : Sub Display!

		
		// The Program will decide at "Runtime" to call which "display()"
		//Since, we use "new" -- Object will be created at Runtime and hence
		// Program will decide at runtim. 
		// display()-> decides on OBjection ( created)
		
		
	}

}
