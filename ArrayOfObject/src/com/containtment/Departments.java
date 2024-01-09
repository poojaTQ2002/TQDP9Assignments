package com.containtment;

public class Departments 
{
   private int did;
   private String dname;
   private Employee employee;
   public Departments()
   {
	   
   }
   public Departments(int did, String dname, Employee employee) 
   {
	super();
	this.did = did;
	this.dname = dname;
	this.employee = employee;
   }
   public void setDid(int did)
   {
	   this.did=did;
   }
   public int getDid()
   {
	   return did;
   }
   public void setDname(String dname)
   {
	   this.dname=dname;
   }
   public String getDname()
   {
	   return dname;
   }
   public void setEmployee(Employee employee)
   {
	   this. employee=employee;
   }
   public Employee getEmployee()
   {
	   return  employee;
   }
@Override
public String toString() {
	return "Departments :Did=" + did + ", Dname=" + dname + ", Employee=" + employee ;
}
   
}
