package collectionsAssignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class OddNumberQ2 
{
     public static void main(String[] args)
     {
    	 ArrayList<Integer>ar=new ArrayList();
    		for(int i=1;i<=50;i++)
    		{
    		   ar.add(i);
    		}
    		Iterator<Integer>iterator=ar.iterator();
    		while(iterator.hasNext())
    		{
    			int num=iterator.next();
    			if(num%2!=0)
    			{
    				System.out.println("Odd Number is :"+num);
    			}
    		}
    		
    	  }
}
