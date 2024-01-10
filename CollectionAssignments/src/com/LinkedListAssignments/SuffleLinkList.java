package com.LinkedListAssignments;

import java.util.Collections;
import java.util.LinkedList;

public class SuffleLinkList 
{
	 public static void main(String args[]){
			LinkedList<String> linkedList = new LinkedList<String>();
			linkedList.add("Jai");
			linkedList.add("Mahesh");
			linkedList.add("Naren");
			linkedList.add("Vivek");
			linkedList.add("Vishal");
			linkedList.add("Hemant");
			System.out.println("Original LinkedList:"+linkedList);
			System.out.println("---------------------");
			Collections.shuffle(linkedList);
		        System.out.println(linkedList);      
		        
		  }
}
