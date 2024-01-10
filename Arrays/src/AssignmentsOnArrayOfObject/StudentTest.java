package AssignmentsOnArrayOfObject;

public class StudentTest 
{
	//those students who have marks more than 60 and age is less than 15.
	static void infoStudent(Student st[])
	{
		for(int i=0;i<st.length;i++)
		{
			{
				if(st[i].getMarks()>60 && st[i].getAge()<15)
				{
					System.out.println(st[i]);
				}
			}
		}
	}
  public static void main(String[] args) 
  {
	  Student s1[]=new Student[5];
	  s1[0]=new Student(101,"Samruthi",20,60);
	  s1[1]=new Student(102,"Manish",15,25);
	  s1[2]=new Student(103,"Purvi",25,66);
	  s1[3]=new Student(104,"Om",10,58);
	  s1[4]=new Student(105,"Vijay",12,30);
	  
	  for(Student s:s1)
		  System.out.println(s);
	  System.out.println("---------------------------------------------------------");
	  
//	  System.out.println("those students who have marks more than 60 and age is less than 15");
	  
	  infoStudent(s1);
	  
  }
}
