package com.app.prog;

public class Application 
{
   private double version;
   private String technology;
   private Developer developer;
   public Application()
   {
	   super();
   }
   public Application(double version, String technology, Developer developer)
   {
	super();
	this.version = version;
	this.technology = technology;
	this.developer = developer;
  }
   public void install()
   {
	   System.out.println("App installing");
   }
   public void uninstall()
   {
	   System.out.println("App Uninstalling");
   }
@Override
public String toString() {
	return "Application [version=" + version + ", technology=" + technology + ", developer=" + developer + "]";
}
   
  
   
}
