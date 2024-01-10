package com.Comparable;

public class Employee implements Comparable<Employee>
{
  private int eid;
  private String ename;
  private float esalary;
public Employee() 
{
	super();
	
}
public Employee(int eid, String ename, float esalary)
{
	super();
	this.eid = eid;
	this.ename = ename;
	this.esalary = esalary;
}
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public float getEsalary() {
	return esalary;
}
public void setEsalary(float esalary) {
	this.esalary = esalary;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
}
@Override
public int compareTo(Employee e1) 
{
	if(this.getEsalary()==e1.getEsalary())
	{
		return 0;
	}
	else if(this.getEsalary()<e1.getEsalary())
	{
		return -1;
	}
	else
	return 1;
}
  
}
