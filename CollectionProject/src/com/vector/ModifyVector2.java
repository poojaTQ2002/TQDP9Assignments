package com.vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class ModifyVector2 {

	public static void main(String[] args) {

		Vector<String> lang = new Vector<>(); // doubles if not given

		lang.add("C");
		lang.add("Java");
		lang.add("Python");
		lang.add("Angular");
		lang.add(".net");

		System.out.println(lang);

		System.out.println("--------------------------------------------");
		
		//fail safe iterator
		Enumeration<String> en= lang.elements();
		while(en.hasMoreElements())
		{
			if(en.nextElement().equals("Java"))
				lang.add("c++");
		}
			System.out.println(lang);
		}
}
