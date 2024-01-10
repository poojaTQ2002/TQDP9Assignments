package com.containment;

public class Employee2 
{
  private int eid;
  private String ename;
  private double Salary;
  private Department2 department2;
  private MyDate mydate;
  Employee2()
  {
	  
  }
  Employee2(int eid,String ename,Department2 department2,MyDate mydate)
  {
	  this.eid=eid;
	  this.ename=ename;
	  this.department2=department2;
	  this.mydate=mydate;
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
	  this.department2=department2;
  }
  public Department2 getDepartment2()
  {
	  return department2;
  }
  public MyDate getMydate() 
  {
	return mydate;
  }
  public void setMydate(MyDate mydate)
  {
	 this.mydate = mydate;
  }
public String toString() 
  {
	   return "Employee :"+eid+" "+ename+" "+department2+" "+mydate;
  }
}
