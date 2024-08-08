package come.corejava.inheritence.example;

public class MainClass {
	
	public static void main(String[] args)
	{
		Cylinder cylinder = new Cylinder();
		cylinder.radius=5;
		cylinder.height=5;
		
		System.out.println("Area of Super class called:"+ cylinder.area());
		System.out.println("perimeter of Super class called:"+ cylinder.circumference());
		System.out.println("Volume of of Super class called:"+ cylinder.volume());
	
	
	}

}
