package com.LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> comp= new LinkedList<>();
		//System.out.println(comp.getFirst()); // throws NoSuchElement
		System.out.println(comp.peek()); // null
		
		//System.out.println(comp.remove());
		System.out.println(comp.poll());
		
		comp.add("HCL");
		comp.add("Infosys");
		comp.add("Congnizant");
		comp.add("Dell");
		comp.add(null);
		comp.add("HCL");
		
		System.out.println(comp);
		
		System.out.println("------------------------------");
		comp.addFirst("HP");// void
		comp.offerFirst("Genpact"); // boolean
		
		System.out.println(comp);
		
		System.out.println("------------------------------");
		comp.add(1, "Wipro");
		System.out.println(comp);
		
		
		System.out.println("------------------------------");
		
		System.out.println(comp.element());
		System.out.println(comp.getFirst());
		System.out.println(comp.peekFirst());
		System.out.println(comp.peek());
		
		System.out.println("------------------------------");
		
		System.out.println(comp.get(2));
		
		System.out.println("------------------------------");
		
		System.out.println(comp.getLast());
		System.out.println(comp.peekLast());
		
		System.out.println("------------------------------");
		
		//System.out.println(comp.poll());
		//System.out.println(comp.pollFirst());
		//System.out.println(comp.remove());
		//System.out.println(comp.removeFirst());
		
		System.out.println("------------------------------");
		//System.out.println(comp.remove(3));
		
		System.out.println("------------------------------");
		//System.out.println(comp.pollLast());
		System.out.println(comp.removeLast());
		System.out.println(comp);
		System.out.println(comp.removeLastOccurrence("Infosys"));
		
		System.out.println("------------------------------");
		
		comp.push("Google"); // addFirst
		System.out.println(comp);
		
		comp.pop(); // removeFirst
		System.out.println(comp);

		
	}

}
