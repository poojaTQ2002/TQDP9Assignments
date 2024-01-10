package com.containment;

public class Collage
{
    public static void main(String[] args) 
    {
	   Course c1=new Course(101,"Java",36000);
	   Course c2=new Course(102,"Python",40000);
	   Course c3=new Course(102,"Fullstack",16000);
	   
	   Student s1=new Student(1,"Pooja",c1);
	   Student s2=new Student(2,"Sonu",c2);
	   Student s3=new Student(3,"Palak",c3);
	   Student s4=new Student(4,"Prachi",c1);
	   Student s5=new Student(5,"Vinayak",c2);
	   
	   System.out.println(s1);
	   System.out.println(s2);
	   System.out.println(s3);
	   System.out.println(s4);
	   System.out.println(s5);
	   
	   Course c=new Course();
	   c.setCno(102);
	   c.setCname("Om");
	   c.setFees(23000);
	   
	   Student s=new Student();
	   s.setSid(5);
	   s.setSname("Samu");
	   s.setCourse(c);
	   System.out.println(s);
	   
	   System.out.println("*****************************");
	   
	   Student st=new Student();
	   st.setSid(9);
	   st.setSname("Pooja");
	   st.setCourse(new Course());
	   st.getCourse().setCno(108);
	   st.getCourse().setCname("SQL");
	   st.getCourse().setFees(45000);
	   System.out.println(st);
	   
      	   
	   


	  

	   
	}
}
