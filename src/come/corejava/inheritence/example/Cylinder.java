package come.corejava.inheritence.example;

public class Cylinder extends Circle {

	public double height;
	
	public double volume()
	{
		System.out.println("Cylinder's Volume()-Invoked");
		return area()*height;
	}
}
