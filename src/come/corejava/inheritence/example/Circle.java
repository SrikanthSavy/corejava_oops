package come.corejava.inheritence.example;

public class Circle {

	public double radius;
	
	public double area()
	{
		System.out.println("Circle's arear()-Invoked");
		return Math.PI*radius*radius;
	}
	
	public double perimeter()
	{
		System.out.println("Circle's perimeter()-Invoked");
		return 2*Math.PI*radius;
	}
	
	public double circumference()
	{
		return perimeter();
	}
}



