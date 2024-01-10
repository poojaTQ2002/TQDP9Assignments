package com.LabAssignments;
abstract class Shape
{
	
	abstract void calculteArea();
	
	abstract void calcuCir();
	
	
}
class Circle extends Shape
{   double r=2;
	
	@Override
	void calculteArea()
	{
	    
		System.out.println("Area of Circle :"+(3.14*r*r));
	}

	@Override
	void calcuCir()
	{
		System.out.println("Circumference of a circle :"+(2*3.14*r));
		
	}

	
	
}
class Rectangle extends Shape
{
	double length=5;
    double width=4;

	@Override
	void calculteArea() 
	{
		System.out.println("Area of rectangle :"+(length*width));
		
	}

	@Override
	void calcuCir() 
	{
		System.out.println("Circumference of the Rectangle is :"+((2*length)+(2*width)));
		
	}
	
}
class Square extends Shape
{
    int side=9;
	@Override
	void calculteArea() 
	{
		System.out.println("Area of Square :"+(side*side));
		
	}

	@Override
	void calcuCir()
	{
		System.out.println("Circumference of the Square :"+(4*side));
		
	}
	
}
public class AbstractShape 
{
   public static void main(String[] args)
   {
	  Circle c=new Circle();
	  c.calculteArea();
	  c.calcuCir();
	  System.out.println("*****************");
	  Rectangle r=new Rectangle();
	  r.calculteArea();
	  r.calcuCir();
	  System.out.println("*************************");
	  Square s=new Square();
	  s.calculteArea();
	  s.calcuCir();
   }
}
