package com.encapsulation;

import java.util.Scanner;

class Test {
   int l;
   int w;
    int area;
    Test()
    {
    	
    }

    Test(int l, int w) {
        area = l * w;
    }

    void display() {
        System.out.println("Area of rectangle is: " + area);
    }
}
public class ClaculateAreaAndRectangle 
{
	public static void main(String args[]) {
        int length, width;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle:");
        length = sc.nextInt();
        System.out.print("Enter width of rectangle:");
        width = sc.nextInt();

        Test t = new Test(length, width);
        t.display();
    }
}
