package com.example2;

public class StudentTest
{
   public static void main(String[] args)
   {
	   Student st[]=new Student[3];
	  double m1[]= {55,84,69,38,40};
	   st[0]=new Student(1,"Pooja",m1);
	   double m2[]= {98,54,67,40,50};
	   st[1]=new Student(2,"Reetu",m2);
	   double m3[]= {60,55,87,63,13};
	   //st[0]=new Student(3,"Ram",m3);
	   st[2]=new Student();
	   st[2].setId(3);
	   st[2].setName("Ram");
	   st[2].setMarks(m3);
	   System.out.println("---------------------");
	   for(Student s:st)
	   {
		   System.out.println(s+" ");
	   }
   }
}
