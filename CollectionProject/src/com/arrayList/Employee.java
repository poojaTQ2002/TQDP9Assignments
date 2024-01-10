package com.arrayList;

public class Employee implements Comparable<Employee>
{
   private int eid;
   private String ename;
   private Department department;
public Employee(int eid, String ename, Department department) {
	super();
	this.eid = eid;
	this.ename = ename;
	this.department = department;
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
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", department=" + department + "]";
}
@Override
public int compareTo(Employee e1)
{
	
	return (this.ename.compareTo(e1.getEname()));
}
   
   
}
