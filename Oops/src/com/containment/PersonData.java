package com.containment;

public class PersonData 
{
	public static void main(String[] args)
	{
		Address a1=new Address("Pune","Maharastra","India");
		Address a2=new Address("Chenai","Tamil Nadu","India");
		Address a3=new Address("Panaji","Goa","Maharastra");
		Address a4=new Address("Ahmadabad","Gujarat","India");
		Address a5=new Address("Amritsar","Punjab","India");
		
		Person p1=new Person("Pooja","F",21,a1);
		Person p2=new Person("Rahul","M",25,a2);
		Person p3=new Person("Teena","F",30,a4);
		Person p4=new Person("Vinayak","M",28,a3);
		Person p5=new Person("Fija","F",35,a5);
		Person p6=new Person("Raju","M",20,a3);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
		System.out.println(p6);

		
		
	}
  
}
