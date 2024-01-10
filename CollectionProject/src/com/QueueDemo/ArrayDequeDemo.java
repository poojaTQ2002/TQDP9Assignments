package com.QueueDemo;

import java.util.ArrayDeque;

public class ArrayDequeDemo 
{
   public static void main(String[] args)
   {
	  ArrayDeque<Float>adq=new ArrayDeque<>(); 
	  //null not allowed
	  //maintain insertion order
	  
	  adq.add(78.4f);
	  adq.add(34.3f);
	  adq.add(98.4f);
	  //adq.add(null);
	  adq.add(89.4f);
	  adq.add(90.3f);
	  System.out.println(adq);
	  System.out.println("-------------------");
	  System.out.println(adq.peekFirst());//show 1st elemnts
	  System.out.println(adq.poll());//delete 1st elements
	  System.out.println("---------------------");
	  System.out.println(adq);
	  
   }
}
