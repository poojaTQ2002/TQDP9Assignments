package com.QueueStackAssignments;

import java.util.LinkedList;
import java.util.Queue;

public class AddQueue
{
   public static void main(String[] args) 
   {
	   Queue<Integer> queue = new LinkedList<Integer>();  
       // Add elements to the queue 
	   //1st way
       queue.add(1);  
       queue.add(2);  
       queue.add(3); 
      //2nd way
       queue.offer(8);
       queue.offer(9);
       queue.offer(10);
       
       // Display the elements in the queue  
       System.out.println("Elements in the queue: " + queue);
   }
}
