package com.QueueStackAssignments;

import java.util.LinkedList;
import java.util.Queue;

public class CheckQueueHasValue
{
   public static void main(String[] args) 
   {
	   Queue<Integer> queue = new LinkedList<Integer>();  
       
	   System.out.println(queue.isEmpty());
       queue.add(1);  
       queue.add(2);  
       queue.add(3); 
       System.out.println(queue.isEmpty());
   }
}
