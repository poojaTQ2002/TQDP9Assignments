package com.containment;

public class Employee 
{
  private int eid;
  private String ename;
  private Department department;
  Employee()
  {
	  
  }
  Employee(int eid,String ename,Department department)
  {
	  this.eid=eid;
	  this.ename=ename;
	  this.department=department;
  }
  public void setEid(int eid)
  {
	  this.eid=eid;
  }
  public int getEid()
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
  public void setDepartment(Department department)
  {
	  this.department=department;
  }
  public Department getDepartment()
  {
	  return department;
  }
  public String toString() 
  {
	   return "Employee :"+eid+" "+ename+" "+department;
  }
}
