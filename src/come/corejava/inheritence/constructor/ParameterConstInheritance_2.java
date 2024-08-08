package come.corejava.inheritence.constructor;

// inner class
class Rectangle
{
	int length;
	int breadth;
	
	public Rectangle() {
		length=breadth=1;
	}
	
	public Rectangle(int l, int b) {
		length=l;
		breadth=b;
	}
}

// Inner class
class Cuboid extends Rectangle
{
	int height ;
	Cuboid()
	{
		height=1;
	}
	Cuboid(int h)
	{
		height=h;
	}
	
	// Const to call Parent Class Parameterized const()
	Cuboid(int l, int b,int h)
	{
		super(l,b); // NOTE THIS SHOULD BE FIRST-ling in const ***
		height=h;
	}
	
	int volume()
	{
		return length*breadth*height;
	}
}

// Main Class
public class ParameterConstInheritance_2 {

	public static void main(String[] args) {
		
		Cuboid cube1 = new Cuboid();
		System.out.println("Volume : "+cube1.volume());  //O/P ==1  i.e l=1 b=1 & h=1
		
		Cuboid cube2 = new Cuboid(10);
		System.out.println("Volume : "+cube2.volume());  //O/P ==10 i.e l=1 b=1 & h=10
		
		Cuboid cube3 = new Cuboid(2,3,10); // Calling parent class Parametried const()
		System.out.println("Volume : "+cube3.volume());  //O/P ==60 i.e l=2 b=3 & h=10
	}

}
