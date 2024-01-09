package com.example2;

import java.util.Scanner;

public class StudentUserInput 
{
	static Scanner sc=new Scanner(System.in);
	
	public static double calPercentage(Student s)
	{
		double per;
		double total=0;
		double marks[]=s.getMarks();
		for(double m:marks)
		{
			total+=m;
			
		}
		per=(total/500)*100;
		return per;
	}
	public static void enterDetails(Student s)
	{
		System.out.println("Enter Id :");
		s.setId(sc.nextInt());
		System.out.println("Enter Name :");
		s.setName(sc.next());
		System.out.println("Enter Marks of 5 Student :");
		double m[]=new double [5];
		for(int i=0;i<m.length;i++)
		{
			m[i]=sc.nextDouble();
		}
		s.setMarks(m);
	}
   public static void main(String[] args) 
   {
	 Student st[]=new Student[3];
	 for(int i=0;i<st.length;i++)
	 {
		 st[i]=new Student();
		 enterDetails(st[i]);
		 
	 }
	 System.out.println("------------------");
	 for(Student s:st)
	 {
		 System.out.println(s);
	 }
	 for(Student s:st)
	 {
		 System.out.println(s.getId()+" "+s.getName());
		 System.out.println("Percentage :"+calPercentage(s)+"%");
	 }
   }
}
