package com.Comparable;

import java.util.Collections;
import java.util.LinkedList;

public class EmployeeTest
{
   public static void main(String[] args)
   {
	 LinkedList<Employee>emp=new LinkedList<>();
	 emp.add(new Employee(101,"Pooja",54000));
	 emp.add(new Employee(102,"Tanvi",54000));
	 emp.add(new Employee(101,"Manasi",30000));
	 emp.add(new Employee(101,"Manisha",30000));
	 
//	 Collections.sort(emp);
//	 for(Employee e:emp)
//	 {
//		 System.out.println(e);
//	 }
	 
	 Collections.sort(emp,new SalaryComparator());
	 for(Employee e:emp)
	 {
		 System.out.println(e);
	 }
   }
}
