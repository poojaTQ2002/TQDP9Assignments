package com.LinkedListAssignments;

import java.util.LinkedList;

public class IteratorLinkedList
{
	public static void main(String[] args)
	{
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        // Add values to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(9);
        list.add(11);
        
        // Iterate using Enhanced for loop
     System.out.print("Iterating the linked list using enhanced for loop : ");
        for(Integer element : list) {
            System.out.print(element + " ");
        }
	}   
}
