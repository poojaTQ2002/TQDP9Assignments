package com.LabAssignments;

public class PenDetails 
{
   public static void main(String[] args) 
   {
	  Nib n1=new Nib("Gold nib",2f);
	  Nib n2=new Nib("stainless steel nib",3f);
	  Nib n3=new Nib("Gold nib",1.5f);
	  System.out.println(n1);
	  System.out.println(n2);
	  System.out.println(n3);
	  System.out.println("*******************************");
	  
	  Refill r1=new Refill("Red",5,n1);
	  Refill r2=new Refill("Blue",4,n2);
	  Refill r3=new Refill("Blck",2,n3);
	  System.out.println(r1);
	  System.out.println(r2);
	  System.out.println(r3);
	  System.out.println("********************************");
	  
	  Pen p1=new Pen(4,"Nataraj",r1);
	  Pen p2=new Pen(3,"Trymax",r2);
	  Pen p3=new Pen(2,"Laxi",r3);
	  System.out.println(p1);
	  System.out.println(p2);
	  System.out.println(p3);
	 
	  
	 
	  
	  
   }
}
