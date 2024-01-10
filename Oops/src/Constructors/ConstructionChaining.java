package Constructors;
class Student
{
	int id;
	String name;
	float marks;

Student()
{
	id=100;
	name="Unknown";
	marks=33;
	
}
Student(int id,String name)
{
	this();
	this.id=id;
	this.name=name;
}
public String toString() 
{
	return id+" "+name+" "+marks;
}
public class ConstructionChaining {
	public static void main(String[] args)
	{
		Student s1=new Student();
		System.out.println(s1);
	}
}

}
