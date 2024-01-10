package com.abstractclass;
abstract class Phone
{
	private String name;
	
	static long contact;
	
	Phone()
	{
		
	}
	public Phone(String name)
	{
		super();
		this.name=name;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	abstract void description();
	final void display()
	{
		System.out.println("Contact Number :"+contact);
		System.out.println("-----------------------------------------");
		System.out.println("Phone Book name:"+name);
		
	}
}

class Person extends Phone
{
	private int id;
	private String pname;
	private String address;
	public Person()
	{
		super();
	}
	public Person(String name,int id,String pname,String address) {
		super(name);
		this.id=id;
		this.pname = pname;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return pname;
	}
	public void setName(String name) {
		this.pname = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	void description()
	{
		System.out.println("I am Person--------");
		System.out.println("Id :"+id);
		System.out.println("Person Name :"+pname);
		System.out.println("Address :"+address);
	}
	
	
}

public class PhoneBook 
{
  public static void main(String[] args) 
  {
	Phone.contact=546899522;
	Person p1=new Person("Directory",101,"Pooja","Pune");
	p1.display();
	p1.description();
  }
}
