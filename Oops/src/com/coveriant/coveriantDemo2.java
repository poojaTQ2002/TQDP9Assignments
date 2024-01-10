package com.coveriant;
//allowing a subclass method to override a superclass method 
//and return a subtype of the superclass method's return type.
class MyPerson
{
	int id;
	String name;
	
	MyPerson()
	{
		
	}
	
	MyPerson(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	MyPerson showDetails()
	{
		name= name+" ThinkQ";
		return this;
	}

	public String toString()
	{
		return "Id:"+id+" Name:"+name;
	}

}

class MyEmployee extends MyPerson
{
 float salary;
 
 MyEmployee()
 {
	   
 }
 
 MyEmployee(int id, String name, float salary)
 {
	   super(id,name);
	   this.salary=salary;
 }
 
 MyEmployee showDetails()
 {
	   name = name+" ThinkQuotient";
	   salary= salary+1000;
	   return this;
	   
 }
 
 void showSalary()
 {
	   System.out.println("Salary:"+salary);
 }

 public String toString()
 {
	   return super.toString()+" Salary:"+salary;
 }
}

public class coveriantDemo2 {
	
	public static void main(String[] args) {
		
		MyPerson p;
		MyEmployee e;
		
		MyPerson p1= new MyPerson(1,"Shreyash");
		MyPerson p2= new MyPerson(2,"Prachi");
		
		p=p1.showDetails();
		System.out.println(p);
		p=p2.showDetails();
		System.out.println(p);
		
		MyEmployee e1= new MyEmployee(101, "Pranay", 340000);
		
		//e= e1.showDetails();
		p= e1.showDetails();
		System.out.println(p); // calls overriden toString
		
	//	p.showSalary(); // extra method of MyEmployee , so cannot be called from MyPerson p
		
		e= e1.showDetails(); 
		System.out.println(e);

		e.showSalary();
		
		
		
	}

}
