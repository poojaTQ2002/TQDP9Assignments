package com.ArrayListAssignments;

import java.util.ArrayList;

//8.	WAP to remove element from ArrayList
//9.WAP to remove all elements from ArrayList
//10.	WAP to retain all elements from ArrayList

public class RemoveElementsArrayListQ8Q9Q10
{
   public static void main(String[] args)
   {
	  ArrayList<String>ar1=new ArrayList();
	  System.out.println(ar1.isEmpty());
	  ar1.add("Mango");
	  ar1.add("Pineapple");
	  ar1.add("Grapes");
	  ar1.add("Papaya");
	  ar1.add("Orange");
	  System.out.println(ar1.isEmpty());
//	  System.out.println(ar1);
//	  System.out.println("---------------------");
//	  //Remove elemnts
//	  ar1.remove(1);
//	  System.out.println(ar1);
//	  System.out.println("-----------------------");
//	  //Remove All
//	  ar1.removeAll(ar1);
//	  System.out.println(ar1);
//	  System.out.println("------------------------");
	  
	  ArrayList<String> ar2= new ArrayList<>();
		ar2.add("Strawberry");
		ar2.add("Banana");
		System.out.println(ar1);
		System.out.println(ar2);
		System.out.println("----------");
		ar1.addAll(ar2);
		//System.out.println(ar1);
		//System.out.println("------------------");
	  //ar1.retainAll(ar1);
	  //System.out.println(ar1);
	  ar1.retainAll(ar2);
	  System.out.println(ar1);
   }
}
