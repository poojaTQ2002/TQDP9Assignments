package com.containtment;

public class StudentConstructor2 
{
	public static void InfoStudentCourseWise(Student[] st,Course[]cour)
	{
		for(Course c:cour)
		{
			System.out.println(c);
			for(Student s:st)
			{
				if(s.getCourse().equals(c))
				{
					System.out.println(s.getId()+" "+s.getName());
				}
			}
			System.out.println("-----------------");
		}
	}
	
	public static void countStudentCourseWise(Student[] st,Course[]cour)
	  {
		  int count;
		  for(Course c:cour)
		  {
			  count=0;
			  for(Student s:st)
			  {
				  if(s.getCourse().equals(c))
				  {
					  count++;
				  }
			  }
			  System.out.println(c+"----->"+count);
		  }
	  }
	
  public static void main(String[] args)
  {
	  
	  Course c[]=new Course[3];
	  
	 c[0]=new Course(1,"Java",65000);
	c[1]=new Course(2,"Net",45000);
	c[2]=new Course(3,"Python",35000);
	 
	 Student st[]=new Student[6];
	 st[0]=new Student(101,"Reetu",c[0]);
	 st[1]=new Student(102,"pooja",c[1]);
	 st[2]=new Student(103,"prachi",c[2]);
	 
	 st[3]=new Student();
	 st[3].setId(104);
	 st[3].setName("Ram");
	 st[3].setCourse(c[1]);
	 
	 st[4]=new Student(105,"laila",c[0]);
	 st[5]=new Student(106,"amruta",c[1]);
	 
	 for(Student s:st)
	 {
		 System.out.println(s);
	 }
	 System.out.println("-------------------------");
	 
	 countStudentCourseWise(st,c);
	 System.out.println("-------------");
	 InfoStudentCourseWise(st,c);
	 
	 
  }
}
