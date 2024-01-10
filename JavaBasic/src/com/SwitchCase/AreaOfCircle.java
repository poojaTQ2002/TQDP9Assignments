package com.SwitchCase;

import java.util.Scanner;

public class AreaOfCircle {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        
		 System.out.println("MENU:");
         System.out.println("1.Area of a Circle");
         System.out.println("2.Area of a Square");
         System.out.println("3.Area of a Right Angled Triangle");
         System.out.println("4.Area of a Rectangle");
         System.out.println("5.Circumference of a Circle");
         System.out.println("6.Perimeter of a Square");
	        int choice = sc.nextInt();
	        switch(choice) 
	        {
            case 1:
                System.out.print("Enter radius of circle: ");
                double r = sc.nextDouble();
                double ca = (22 / 7.0) * r * r;
                System.out.println("Area of circle = " + ca);
                break;
                
            case 2:
                System.out.print("Enter side of square: ");
                double side = sc.nextDouble();
                double sa = side * side;
                System.out.println("Area of square = " + sa);
                break;
                
            case 3:
                System.out.print("Enter length of triangle: ");
                double l = sc.nextDouble();
                System.out.print("Enter breadth of triangle: ");
                double b = sc.nextDouble();
                double ta =1/2*(l * b);
                System.out.println("Area of right angle triangle = " + ta);
                break;
            case 4:
                System.out.print("Enter length of rectangle: ");
                double len = sc.nextDouble();
                System.out.print("Enter breadth of rectangle: ");
                double width= sc.nextDouble();
                double ra =len * width;
                System.out.println("Area of Rectangle = " + ra);
                break;
            case 5:
            	System.out.println("Enter radius:");
                float R=sc.nextFloat();
                float C=3.14f*2f*R;
               System.out.println("Circumference of Circle :"+C);
                break; 
            case 6:
            	 System.out.println("Enter side:");
                 int X=sc.nextInt();
                 int p=4*X;
                System.out.println("Perimeter of Square :"+p);
                break;     
                
            default:
                System.out.println("Wrong choice!");
        }
    }

	}


