package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ModifyVector {

	public static void main(String[] args) {

		Vector<String> lang = new Vector<>(); // doubles if not given

		lang.add("C");
		lang.add("Java");
		lang.add("Python");
		lang.add("Angular");
		lang.add(".net");

		System.out.println(lang);

		System.out.println("--------------------------------------------");
		
		for(int i=0;i<lang.size();i++)
		{
			System.out.println(lang.get(i));
		}
		
		System.out.println("--------------------------------------------");
		
		for(String s:lang)
		{
			System.out.println(s);
		}
		System.out.println("--------------------------------------------");
		
		Iterator<String> itr= lang.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("--------------------------------------------");
		
		ListIterator<String> litr= lang.listIterator(lang.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
				
		System.out.println("--------------------------------------------");
		// fail safe iterator
		Enumeration<String> en= lang.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		

	}
}
