package com.LinkedListAssignments;

import java.util.ArrayList;
import java.util.LinkedList;

public class CloneArrayList
{
	public static void main(String a[])
    {
		LinkedList <String>list = new LinkedList <String> ();
        
		list.add("Mukul");
		list.add("Rahul");
		list.add("Suraj");
		list.add("Mayank");
 
       System.out.println(list);                   
       ArrayList ArrList2= (ArrayList)list.clone();
            
 
       System.out.println("Clone ArrayList2 = "+ ArrList2);
                           
    }
}
