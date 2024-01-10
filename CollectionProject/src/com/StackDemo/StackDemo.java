package com.StackDemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> s2= new Stack<>();
		s2.push("Reetu");
		s2.push("Pranali");
		
		System.out.println(s2);
		
		s2.pop();
		System.out.println(s2);
	}
}

