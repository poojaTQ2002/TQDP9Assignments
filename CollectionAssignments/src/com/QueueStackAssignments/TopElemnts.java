package com.QueueStackAssignments;

import java.util.LinkedList;
import java.util.Queue;

public class TopElemnts 
{
	 public static void main(String[] args)
	 {    
	   Queue<Integer> queue = new LinkedList<Integer>();  
	   queue.add(4);  
	   queue.add(2);  
	   queue.add(1);  
	         
	   System.out.println("Elements in the queue: " + queue); 
	   System.out.println("-------------------------------");
	   
	   System.out.println(queue.peek());
	   
	        
	 }  
}
