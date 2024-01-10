package com.ArrayListAssignments;

import java.util.ArrayList;
import java.util.List;
//21.	WAP to convert collection into array
public class ConvertCollectionIntoArray 
{
  public static void main(String[] args) 
  {
	 List<String>list=new ArrayList<String>();
	 list.add("Apple");
	 list.add("Mango");
	 list.add("Banana");
	 list.add("Greps");
	 System.out.println(list);
	 
	 String str[]=list.toArray(new String[0]);
	 
	 for(int i=0;i<str.length;i++)
	 {
		 String data=str[i];
		 System.out.print(data+" ");
	 }
	 
  }
}
