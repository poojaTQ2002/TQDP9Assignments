package com.staticDemo;

	class Parent { 
	    static int a = 1; 
	    static
	    { 
	        System.out.println( 
	            "Inside static block of Parent class"); 
	        System.out.println("a = " + a); 
	    } 
	} 
	class Child extends Parent { 
	    static int b = 2; 
	    static
	    { 
	        System.out.println( 
	            "Inside static block of Child class"); 
	        System.out.println("b = " + b); 
	    } 
	} 
	public class ParentCalss { 
	    public static void main(String[] args) 
	    { 
	        Child c = new Child(); 
	    } 
	}

