package com.interfaceAssignments;

//import com.abstractclass.Company;

interface Company
{
	void fullTime();
	void partTime();
}
class Employee implements Company
{
	int id;
	String name;
	 int hoursOfWork;
	
	Employee()
	{
		
	}
	public Employee(int id, String name, int hoursOfWork) {
		super();
		this.id = id;
		this.name = name;
		this.hoursOfWork = hoursOfWork;
		
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", hoursOfWork=" + hoursOfWork + "]";
	}

	@Override
	public void fullTime()
	{   int day;
	    float salary;
		int hoursOfWork=9;
		day=hoursOfWork*500;
		salary=day*30;
		System.out.println("Full time salary = "+salary);
	}
	@Override
	public void partTime() 
	{    int day;
	     float salary;
		hoursOfWork=3;
		day=hoursOfWork*200;
		salary=day*30;
		System.out.println("Part time salary = "+salary);
		
	}
	
	
}
public class CompanyDetails
{
   public static void main(String[] args) 
   {
	  Employee e=new Employee(101,"Pooja",12);
	  System.out.println(e);
	  e.fullTime();
	  e.partTime();
   }
}
