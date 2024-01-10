package com.AssignmentsMap;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

public class MapDepartment
{
  public static void main(String[] args)
  {
	  ArrayList<Student>list1=new ArrayList<>();
	  list1.add(new Student(101,"Pooja"));
	  list1.add(new Student(102,"Komal"));
	  list1.add(new Student(103,"Kiran"));
	 
	  ArrayList<Student>list2=new ArrayList<>();
	  list2.add(new Student(104,"Apurva"));
	  list2.add(new Student(105,"Om"));
	  list2.add(new Student(106,"Arjun"));
	  
	  ArrayList<Student>list3=new ArrayList<>();
	  list3.add(new Student(107,"Lokesh"));
	  list3.add(new Student(108,"Namita"));
	  
	  HashMap<Departments,ArrayList<Student>>hmap=new HashMap<>();
	  hmap.put(new Departments(1,"Java",1),list1);
	  hmap.put(new Departments(2,"Puthon",2),list3);
	  hmap.put(new Departments(3,".net",3),list2);
	  hmap.put(new Departments(4,"PHP",4),list2);
	  
	  for(Map.Entry<Departments,ArrayList<Student>>e: hmap.entrySet())
		{
			System.out.println(e.getKey()+"----->"+e.getValue());
			
			
		}
      
  }
}
