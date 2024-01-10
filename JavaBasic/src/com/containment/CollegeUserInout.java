package com.containment;

import java.util.Scanner;

public class CollegeUserInout
{ static Scanner sc=new Scanner(System.in);
  static void enterStudentDetails(Student s)
  {
	  System.out.println("Enter Student id :");
	  s.setSid(sc.nextInt());
	  
	  System.out.println("Enter Student name :");
	  s.setSname(sc.next());
	  
	  s.setCourse(new Course());
	  System.out.println("Enter Course id :");
	  s.getCourse().setCno(sc.nextInt());
	  
	  System.out.println("Enter Course name :");
	  s.getCourse().setCname(sc.next());
	  
	  System.out.println("Enter Course fees :");
	  s.getCourse().setFees(sc.nextDouble());
	}
  public static void main(String[] args)
  {
	 Student s1=new Student();
	 enterStudentDetails(s1);
	 System.out.println(s1);
	
	 Student s2=new Student();
	 enterStudentDetails(s2);
	 System.out.println(s2);
			 
  }
}
