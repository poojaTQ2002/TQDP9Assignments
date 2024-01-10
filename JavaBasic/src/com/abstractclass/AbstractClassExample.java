package com.abstractclass;
abstract class College
{
	private int cid;
	private String address;
	
	static String cName;
	static 
	{
		cName="D.Y.Patil";
	}
	College()
	{
		
	}
	College(int id,String address)
	{
		super();
		this.cid=cid;
		this.address=address;
	}
	public void setId(int id)
	{
		this.cid=cid;
	}
	public int getId()
	{
		return cid;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	public String getAddress()
	{
		return address;
	}
	abstract void show();
	final void display()
	{
		System.out.println("College Id :"+cid);
		System.out.println("College Name :"+cName);
		System.out.println("College Addess :"+address);
		
	}
}
class Student extends College
{
	private int id;
	private String sName;
	private String course;
	Student()
	{
		
	}
	Student(int cid,String address,int id,String sName,String course)
	{
		super(cid,address);
		this.id=id;
		this.sName=sName;
		this.course=course;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	void show() 
	{
		System.out.println("Student Id :"+id);
		System.out.println("Student Name :"+sName);
		System.out.println("Student course :"+course);
		
	}
	
}
public class AbstractClassExample 
{
  public static void main(String[] args) 
  {
	 College c;
	 Student s1=new Student(101,"Pune",01,"Pooja","Java");
	 s1.display();
	 s1.show();
	 
  }
}
