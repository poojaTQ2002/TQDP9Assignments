package com.containtment;

public class StudentConstructor 
{
  public static void main(String[] args)
  {
	 Course c1=new Course(1,"Java",65000);
	 Course c2=new Course(1,"Net",45000);
	 
	 Student st[]=new Student[4];
	 st[0]=new Student(101,"Reetu",c2);
	 st[1]=new Student(102,"pooja",c1);
	 st[2]=new Student(103,"prachi",c2);
	 
	 st[3]=new Student();
	 st[3].setId(104);
	 st[3].setName("Ram");
	 st[3].setCourse(c1);
	 
	 for(Student s:st)
	 {
		 System.out.println(s);
	 }
	 
	 
  }
}
