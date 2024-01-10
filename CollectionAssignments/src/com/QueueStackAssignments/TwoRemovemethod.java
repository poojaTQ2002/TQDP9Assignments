package com.QueueStackAssignments;

import java.util.LinkedList;
import java.util.Queue;

public class TwoRemovemethod
{
	 public static void main(String[] args)
	 {    
	   Queue<Integer> queue = new LinkedList<Integer>();  
	   queue.add(4);  
	   queue.add(2);  
	   queue.add(1);
	   queue.add(3);
	   queue.add(5);
	         
	   System.out.println("Elements in the queue: " + queue); 
	   System.out.println("-------------------------------");
	   System.out.println(queue.remove(1));
	   System.out.println(queue.poll());
	   System.out.println(queue);
	   
	        
	 }  
}
