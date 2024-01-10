package com.Inheritance;
class Library
{
	private int id;
	   private String name;
	public Library() 
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Library(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Library [id=" + id + ", name=" + name + "]";
	}
	   
}
class Student1 extends Library
{
	private int sid;
	private String sname;
	public Student1()
	{
		super();
		// TODO Auto-generated constructor stub
	}
	public Student1(int id,String name,int sid, String sname) {
		super(id,name);
		this.sid = sid;
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String toString() {
		return super.toString()+"Student [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
	  	   
public class SingleLevelInheritance2 
{
   public static void main(String[] args) 
   {
	   Library l=new Library(101,"Sanjivany");
	 System.out.println(l);
	 System.out.println("-------------------------------------");
	 
	 Student1 s=new Student1();
	 s.setId(12);
	 s.setName("National Library");
	 s.setSid(123);
	 s.setSname("Palak");
	 System.out.println(s.getId());
	 System.out.println(s.getName());
	 System.out.println(s.getSid());
	 System.out.println(s.getSname());
   }
}
