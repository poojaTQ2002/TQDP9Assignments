package com.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeTest
{
  public static void main(String[] args)
  {
	Department d1[]=new Department[3];
	d1[0]=new Department(101,"IT");
	d1[1]=new Department(102,"Sale");
	d1[2]=new Department(103,"HR");
	
	ArrayList<Employee> emp=new ArrayList<>();
	emp.add(new Employee(1,"Pooja",d1[0]));
	emp.add(new Employee(2,"Reetu",d1[1]));
	emp.add(new Employee(3,"Joti",d1[2]));
	emp.add(new Employee(4,"Ram",d1[0]));
	emp.add(new Employee(5,"Shreya",d1[1]));
	
	//Collections.sort(emp);
	Collections.sort(emp,new NameComparator());
	Iterator<Employee>itr=emp.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
//	emp.add(new Employee(6,"Pranay",d1[2]));
//	for(Employee e:emp)
//	System.out.println(e);
	
	
  }
}
