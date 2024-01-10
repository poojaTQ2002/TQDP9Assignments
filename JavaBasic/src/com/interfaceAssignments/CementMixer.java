package com.interfaceAssignments;
abstract class Equipment
{
	void fill()
	{
	    System.out.println("Filling");
	}
	void mix()
	{
		
	}
	
}
class Cement_mixer extends  Equipment
{
	
	void mix()
	{
		System.out.println("Mixing");
	}
	void pour()
	{
		System.out.println("Pour");
	}
}
public class CementMixer 
{
   public static void main(String[] args) 
   {
	   Cement_mixer cm=new Cement_mixer ();
	   System.out.println("In Cement_mixer.....");
	   cm.fill();
	   cm.mix();
	   cm.pour();
	   System.out.println("*************************");
	   
	   Equipment e = new Cement_mixer();
	   e.fill();
	   e.mix();
	   //e.pour();
   }
}
