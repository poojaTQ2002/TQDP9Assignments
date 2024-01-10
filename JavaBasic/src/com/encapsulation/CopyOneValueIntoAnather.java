package com.encapsulation;
class Employee {  
	 private int eid;  
	private String ename; 
	Employee()
	{
		
	}
	 Employee(int eid, String ename) 
	 {  
	   this.eid=eid;
	   this.ename=ename;
	 }  
	 public void setEid(int eid)
	  {
		  this.eid=eid;
	  }
	  public int getEid()
	  {
		  return eid;
	  }
	  public void setEnamed(String ename)
	  {
		  this.ename=ename;
	  }
	  public String getename()
	  {
		  return ename;
	  }
	  Employee(Employee e) {  
		  this.eid = e.eid;  
		  this.ename = e.ename;  
		 }
	  public String toString()
	  {
		  return eid+" "+ename+" ";
	  }
	 
	 }  

public class CopyOneValueIntoAnather 
{
 public static void main(String[] args) 
 {
	 Employee e1 = new Employee(123, "Pooja");  
	  Employee e2 = new Employee(e1);  
	 System.out.println(e1);
	 System.out.println(e2);
	  
 }
}
