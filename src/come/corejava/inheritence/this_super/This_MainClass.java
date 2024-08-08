package come.corejava.inheritence.this_super;

//inner class
class Rectangle
{
	int length;
	int breadth;
	// to test super-keyword
	int x=10;
	
	public Rectangle(int length,int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	void display()
	{
		System.out.println("Length:"+this.length); 
		System.out.println("Breadth:"+this.breadth);
	}
}

// super -- keyword demo
class Cuboid extends Rectangle
{
	int height;
	int x=20;
	Cuboid(int length,int breadth,int height)
	{
		super(length, breadth);
		this.height=height;
	}
	
	void display()
	{
		System.out.println("Current Class X:"+x);
		System.out.println("Super Class X:"+super.x); // Refering Super class - variable
	}
	
}



//Main Class
public class This_MainClass {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		r1.display();
		
		Rectangle r2 = new Rectangle(15, 25);
		r2.display();
		
		Cuboid c1 = new Cuboid(10, 20, 30);
		c1.display();  //O/P : 1)Current Class X:20  2)Super Class X:10

	}

}
