package com.containment;

public class Course 
{
  private int cno;
  private String cname;
  private double fees;
  
  Course()
  {
	  
  }
  
  Course(int cno,String cname,double fees)
  {
	  this.cno=cno;
	  this.cname=cname;
	  this.fees=fees;
  }
  public void setCno(int cno)
  {
	  this.cno=cno;
  }
  public int getCno()
  {
	  return cno;
  }
  public void setCname(String cname)
  {
	  this.cname=cname;
  }
  public String getCname()
  {
	  return cname;
  }
  public void setFees(double fees)
  {
	  this.fees=fees;
  }
  public double getFees()
  {
	  return fees;
  }
  public String toString()
  {
	  return "Course :"+cno+" "+"cname:"+" "+fees;
  }
}
