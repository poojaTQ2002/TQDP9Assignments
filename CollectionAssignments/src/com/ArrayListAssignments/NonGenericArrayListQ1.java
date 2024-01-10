package com.ArrayListAssignments;
//1.WAP to add elements to arraylist without using generics (no <>) and print content of it where Integer is used. In second arraylist String is used.
//2.WAP add elements to arraylist without using generics, 0th location keep Integer, 1st location String now print each element and display contents.
//3.WAP to use add operation of ArrayList
import java.util.ArrayList;
import java.util.List;

public class NonGenericArrayListQ1
{
  public static void main(String[] args)
  {
	  List list1= new ArrayList();
	  list1.add(12);
	  list1.add(5);
	  list1.add(89);
	  list1.add(50);
	  System.out.println(list1);
	  System.out.println("------------------");
	  
	  List list2= new ArrayList();
	  list2.add("Pooja");
	  list2.add("Reetu");
	  list2.add("Sonu");
	  list2.add("Priya");
	  System.out.println(list2);
	  System.out.println("-------------------");
	  
	  List list3=new ArrayList();
	  list3.add(12);
	  list3.add("Monika");
	  System.out.println(list3);
  }
}
