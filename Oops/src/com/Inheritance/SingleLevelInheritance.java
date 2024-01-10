package com.Inheritance;
class Employee
{
	private int id;
	   private String name;
	   protected float salary;
	   
	   public Employee()
	   {
		   System.out.println("In employee Default constructor");
	   }
	   public Employee(int id,String name,float salary)
	   {
		 this.id=id;
		 this.name=name;
		 this.salary=salary;
	   }
	   public void setId(int id)
	   {
		   this.id=id;
	   }
	   public int getId()
	   {
		   return id;
	   }
	   public void setName(String name)
	   {
		   this.name=name;
	   }
	   public String getName()
	   {
		   return name;
	   }
	   public void setSalary(float salary)
	   {
		   this.salary=salary;
	   }
	   public float getSalary()
	   {
		   return salary;
	   }
	public String toString() 
	{
		return "Employee : id= " + id + ", name= " + name + ", salary= " + salary;
	}
}
	class Manager extends Employee
	{
	   private float exp;
	   private String role;
	   Manager()
	   {
		  //super();
		   System.out.println("IN manager default constructor");
	   }
	   Manager(int id,String name,float salary,float exp,String role)
	   {   super(id,name,salary);
		   this.exp=exp;
		   this.role=role;
	   }
	public float getExp() {
		return exp;
	}
	public void setExp(float exp) {
		this.exp = exp;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	public String toString() {
		return super.toString()+"Manager [exp=" + exp + ", role=" + role + "]";
	}
	 
	}
	   
public class SingleLevelInheritance 
{
   public static void main(String[] args) 
   {
	 Employee e1=new Employee(1,"Sita",24000);
	 System.out.println(e1);
	 System.out.println("-------------------------------------");
	 
	 Manager m1=new Manager(101,"Radha",45000,6,"Development");
	 System.out.println(m1);
   }
}
