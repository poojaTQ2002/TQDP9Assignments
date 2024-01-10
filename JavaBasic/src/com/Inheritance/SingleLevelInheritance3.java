package com.Inheritance;
class Person1
{
	private String pname;
	public Person1() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Person1(String pname)
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

class Student2 extends Person1
{
	private int sid;
	private String course;
	private float mark;
	public Student2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student2(String pname) 
	{
		super(pname);
		// TODO Auto-generated constructor stub
	}
	public Student2(String pname,int sid, String course, float mark) {
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
public class SingleLevelInheritance3 
{
   public static void main(String[] args) 
   {
	  Person1 p=new Person1("Pooja");
	  System.out.println(p);
	  System.out.println("**********************************");
	  Student2 s=new Student2("Shreya",101,"Java",78);
	  System.out.println(s);
	  
   }
}
