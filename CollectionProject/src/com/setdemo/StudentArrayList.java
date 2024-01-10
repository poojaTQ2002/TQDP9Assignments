package com.setdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StudentArrayList
{
	static void createMap(ArrayList<Student> list)
	{
		HashMap<Course, Integer> hm= new HashMap<>();
		for(Student s:list)
		{
			Course c= s.getCourse();
		   if(hm.containsKey(c))
		   {
			   hm.put(c, hm.get(c)+1);
		   }
		   else
		   {
			   hm.put(c, 1);
		   }
		}
		
		for(Map.Entry<Course, Integer> e: hm.entrySet())
		{
			System.out.println(e.getKey()+"->"+e.getValue());
		}
	}

  public static void main(String[] args)
  {
	ArrayList<Student>al=new ArrayList<>();
	
	al.add(new Student(101,"Joti",new Course(1,"Java")));
	al.add(new Student(102,"Punam",new Course(2,"Python")));
	al.add(new Student(103,"Rekha",new Course(3,"Html")));
	al.add(new Student(104,"Neha",new Course(4,"PHP")));
	al.add(new Student(104,"Neha",new Course(4,"Java")));
	al.add(new Student(104,"Neha",new Course(4,".net")));
	al.add(new Student(104,"Neha",new Course(4,"PHP")));
	//System.out.println(al);
//	for(Student s:al)
//	{
//		System.out.println(s);
//	}
	
	createMap(al);
	
	
  }
}
