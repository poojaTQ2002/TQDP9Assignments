package com.app.prog;

public class Developer 
{
  private String devName;
  private int devExperience;
  private String skills;
  public Developer()
  {
	  super();
  }
  public Developer(String devName,int devExperience,String skills)
  {
	  this.devName=devName;
	  this.devExperience=devExperience;
	  this.skills=skills;
  }
  public void debugApp()
  {
	  System.out.println("Debug the App");
  }
  public void integrateCode()
  {
	  System.out.println("Integrate Code");
  }
@Override
public String toString() {
	return "Developer [devName=" + devName + ", devExperience=" + devExperience + ", skills=" + skills + "]";
}
  
}
