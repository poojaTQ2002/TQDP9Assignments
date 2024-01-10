package com.Inheritance;
class Person01
{
	private String pname;
	public Person01() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Person01(String pname)
	{
		super();
		this.pname = pname;
		
	}
	
	public String getSname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	
	public String toString() 
	{
		return "Person : pname =" + pname;
	}
	
}


class Student02 extends Person01
{
	private int sid;
	private String course;
	private float mark;
	public Student02() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student02(String pname) 
	{
		super(pname);
		// TODO Auto-generated constructor stub
	}
	public Student02(String pname,int sid, String course, float mark) {
		super(pname);
		this.sid = sid;
		this.course = course;
		this.mark = mark;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return super.toString()+" \n"+"Student [sid=" + sid + ", course=" + course + ", mark=" + mark + "]";
	}
}
class EngineeringStudent extends Student02
{
	private int age;
	private String collegeName;
	private double fees;
	public EngineeringStudent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EngineeringStudent(String pname, int sid, String course, float mark,int age, String collegeName, double fees) {
		super(pname,sid,course,mark);
		this.age = age;
		this.collegeName = collegeName;
		this.fees = fees;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return super.toString()+" "+"EngineeringStudent [age=" + age + ", collegeName=" + collegeName + ", fees=" + fees + "]";
	}
	
}



public class MultiLevelInheritance2 {

	public static void main(String[] args) 
		 {
			  Person1 p=new Person1("Pooja");
			  System.out.println(p);
			  System.out.println("**********************************");
			  Student02 s=new Student02("Shreya",101,"Java",78);
			  System.out.println(s);
			  System.out.println("/////////////////////////////////////////");
			  EngineeringStudent es=new EngineeringStudent("Tanvi",102,"Mechanical Engeneering",80,20,"S.P.College",50000);
			  System.out.println(es);
			  
		   }
}


