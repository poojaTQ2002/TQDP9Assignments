package com.encapsulation;

public class StudentInformation {
	public static void main(String[] args) 
	{
		Student s1=new Student();
		s1.setId(01);
		s1.setSname("Pooja");
		s1.setPercentage(78);
		
		Student s2=new Student();
		s2.setId(02);
		s2.setSname("Neha");
		s2.setPercentage(68);
		
		System.out.println("Student 1:"+s1.getId()+" "+ s1.getSname()+" "+ s1.getPercentage());
		System.out.println("Student 2:"+s2.getId()+" "+s2.getSname()+" "+ s2.getPercentage());
		
		
		Student s3=new Student();
		System.out.println("Student 3:"+s3.getId() +" "+s3.getSname()+" "+ s3.getPercentage());
	}

}
