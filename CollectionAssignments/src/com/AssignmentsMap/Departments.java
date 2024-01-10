package com.AssignmentsMap;

public class Departments
{
  private int did;
  private String dname;
  private int listodStudent;
public Departments() {
	super();
	// TODO Auto-generated constructor stub
}
public Departments(int did, String dname, int listodStudent) {
	super();
	this.did = did;
	this.dname = dname;
	this.listodStudent = listodStudent;
}
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public int getListodStudent() {
	return listodStudent;
}
public void setListodStudent(int listodStudent) {
	this.listodStudent = listodStudent;
}
@Override
public String toString() {
	return "Departments [did=" + did + ", dname=" + dname + ", listodStudent=" + listodStudent + "]";
}
  
}
