package com.corejava.abstractclasses;

//Abstract class
abstract class Shape
{
	abstract double perimeter();
	abstract double area();
}


class Rectangle extends Shape
{
		int length;
		int breadth;
		
	public Rectangle(int length, int breadth) {
		System.out.println("Rectangle Const Invoked");
		this.length = length;
		this.breadth = breadth;
	}
	
	@Override
	double perimeter() {
		
		return 2*(this.length+this.breadth);
	}

	@Override
	double area() {
		
		return this.length*this.breadth;
	}
	
}



class Circle extends Shape
{
	int radius;
	public Circle(int radius) {
		System.out.println("Circle Const Invoked");
		this.radius= radius;
	}
	@Override  // abstract methods
	double perimeter() {
		return Math.PI*2*this.radius;
	}
	@Override
	double area() {
		return this.radius*this.radius;
	}
}

public class ShapeClassExampleAssignment {

	public static void main(String[] args) {
		
		Shape shape1= new Rectangle(2, 4);
		System.out.println("Shape 1Area : "+shape1.area());
		System.out.println("Shape 1 Perimeter : "+shape1.perimeter());
		
		Shape shape2= new Circle(3);
		System.out.println("Shape2 Area : "+shape2.area());
		System.out.println("Shape 2 Perimeter : "+shape2.perimeter());

	}

}
