package com.ArrayListAssignments;

import java.util.ArrayList;

//4. Create arraylist of 10 integers. Insert an element at 7th position.
public class InsertElemntsQ4
{
	public static void main(String[] args)
	{
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		arr.add(60);
		arr.add(70);
		arr.add(80);
		arr.add(90);
		arr.add(100);
		System.out.println(arr);
		arr.add(7, 1000);
		System.out.println("After inserting Elemnts :"+arr);
	}
}
