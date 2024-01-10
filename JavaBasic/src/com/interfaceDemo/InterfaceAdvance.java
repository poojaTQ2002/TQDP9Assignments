package com.interfaceDemo;
interface Calculate {
	void area();
	
	// Java -8
	// mutable and backward compatibility
	default void volume()
	{
		System.out.println("In volume method");
		display();
		show();
	}
	
	// common implementation for all classes
	// belong to interface
	
	static void info()
	{
		System.out.println("Geometry");
		show();
		
	}
	
	// Java -9
	// confidential info : sensitive info belongs to agreement
	// instance 
	private void display()
	{
		System.out.println("Made by :Shuruti");
	}
	
	private static void show()
	{
		System.out.println("Pan no: GH6790JH");
	}
	
	
}

class Square implements Calculate {
	int side;

	Square() {
		side = 10;
	}

	Square(int side) {
		this.side = side;
	}

	@Override
	public void area() {

		System.out.println("Area od square is :" + (side * side));

	}

}

class Cube implements Calculate {

	int side;

	Cube() {
		side = 20;
	}

	Cube(int side) {
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area of cube:"+(6*side*side));
	}
	
	public void volume()
	{
		Calculate.super.volume();
	  System.out.println("Volume of cube :"+(side*side*side));	
	}
	

}

public class InterfaceAdvance {
	
	public static void main(String[] args) {
		
		Calculate.info();
				
	   Calculate  c;
	  c= new Square(23);
	  c.area();
	  c.volume();
	  
	  System.out.println("-----------------------------");
	  c= new Cube(50);
	  c.area();
	  c.volume();
	 
	}

}
