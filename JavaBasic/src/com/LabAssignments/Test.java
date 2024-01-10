package com.LabAssignments;

public class Test 
{
  protected static final boolean bool=true;
  Test(final boolean obj)
  {
	  Boolean bool=new Boolean(obj);
	 printlt(bool);
	  
  }
  private void printlt(boolean val)
  {
	  System.out.println("Value of variable bool is :"+!val);
  }
  public static void main(String[] args) 
  {
	  new Test(new Boolean(true));
  }
}
