package come.corejava.inheritence.constructor;

 class Parent
{
	 Parent()
	 {
		 System.out.println("Parent class constructor invoked");
	 }
}

 class Child extends Parent
{
	 Child()
	 {
		 System.out.println("Child class constructor invoked");
	 }
}
 
 class GrantChild extends Child
{
	 GrantChild()
	 {
		 System.out.println("GrantChild class constructor invoked");
	 }
}
 
 


public class CosntructorInheritence {

	public static void main(String[] args) {
	
		GrantChild gChild = new GrantChild();
	}

}
