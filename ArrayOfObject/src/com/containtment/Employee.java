package com.containtment;

public class Employee 
{
   private int eid;
   private String ename;
   private double salary;
   public Employee()
   {
	   
   }
   Employee(int id,String ename,double salary)
   {
	   this.eid=id;
	   this.ename=ename;
	   this.salary=salary;
   }
   public void setId(int eid)
   {
	   this.eid=eid;
   }
   public int getId()
   {
	   return eid;
   }
   public void setEname(String ename)
   {
	   this.ename=ename;
   }
   public String getEname()
   {
	   return ename;
   }
   public void setSalary(double salary)
   {
	   this.salary=salary;
   }
   public double getSalary()
   {
	   return salary;
   }
@Override
public String toString() {
	return "Employee : Eid=" + eid + ", Ename=" + ename + ", Salary=" + salary ;
}
   
   
}
