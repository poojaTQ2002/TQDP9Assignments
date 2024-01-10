package com.coveriant;
class Person
{
	int id;
	String name;
	
	Person()
	{
		
	}
	
	Person(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	Person showDetails()
	{
		name= name+" ThinkQ";
		return this;
	}
  
	public String toString()
	{
		return "Id:"+id+" Name:"+name;
	}

}

class Employee extends Person
{
   float salary;
   
   Employee()
   {
	   
   }
   
   Employee(int id, String name, float salary)
   {
	   super(id,name);
	   this.salary=salary;
   }
   
   Person showDetails()
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

public class coveriantDemo {
	
	public static void main(String[] args) {
		
		Person p;
		Employee e;
		
		Person p1= new Person(1,"Shreyash");
		Person p2= new Person(2,"Prachi");
		
		p=p1.showDetails();
		System.out.println(p);
		p=p2.showDetails();
		System.out.println(p);
		
		Employee e1= new Employee(101, "Pranay", 340000);
		
		//e= e1.showDetails();
		p= e1.showDetails();
		System.out.println(p); // calls overriden toString
		
	//	p.showSalary(); // extra method of employee , so cannot be called from person p
		
		e= (Employee) e1.showDetails(); // explicit casting
		System.out.println(e);

		e.showSalary();
		
		
		
	}

}
