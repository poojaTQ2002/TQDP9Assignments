package LabAssignment;

import java.util.Scanner;

public class CalculateAreaPerimeter {
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  int radius;
      double pi=3.14;
      double area,perimeter;
      System.out.println("Enter Radius :");
     radius=sc.nextInt();
     area=pi*radius*radius;
     perimeter=2*pi*radius;
     System.out.println("Area is :"+area);
     System.out.println("Perimeter is :"+perimeter);
	

}
}
