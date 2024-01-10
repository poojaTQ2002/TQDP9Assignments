package com.QueueDemo;


import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueuDemo2 {

	public static void main(String[] args) {
		PriorityQueue<String> pq= new PriorityQueue<>(Collections.reverseOrder());
		pq.add("Reetu");
		pq.add("Pranali");
		pq.add("Abhay");
		pq.add("Pooja");
		pq.add("Pranay");
		pq.add("Bhaskar");
		//pq.add(null);
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		System.out.println(pq.offer("Vikash"));
		System.out.println(pq);
		
		
		
		
	}
}
