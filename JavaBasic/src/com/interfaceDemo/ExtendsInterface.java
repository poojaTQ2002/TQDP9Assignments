package com.interfaceDemo;
interface Movable
{
   public void move();	
  // public void display();
 
}

interface Displayable extends Movable
{
   void printMe(String msg);	

}

class Car implements Displayable
{

	@Override
	public void move() {
		System.out.println("Car is moving at a speed of 50 km/hr");
		
	}

	@Override
	public void printMe(String msg) {
		
		System.out.println("MyCar :"+msg);
		
	}
	


}

class Bike implements Movable
{

	@Override
	public void move() {
		System.out.println("Bike is moving at speed 60 km/hr");
		
	}
	


}
public class ExtendsInterface {
	
	public static void main(String[] args) {
		
		Displayable d;
		d= new Car();
		d.move();
		d.printMe("BMW500series");
		
		System.out.println("--------------------------------"); 
		
		Movable m;
		
		m= new Car();
		m.move();
		
		m= new Bike();
		m.move();
		
	}

}
