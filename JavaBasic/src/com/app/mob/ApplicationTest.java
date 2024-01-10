package com.app.mob;
import com.app.mob.MobileApplication;
import com.app.prog.Application;
import com.app.prog.DesktopApplication;
import com.app.prog.Developer;
import com.app.prog.WebApplication;
public class ApplicationTest 
{
  public static void main(String args[]) 
  {
	  Developer d1=new Developer("Maya",5,"Java");
	  Developer d2=new Developer("Pooja",4,"Html");
	  
	  Application a1=new Application();
	  
	  DesktopApplication desk1=new DesktopApplication(3.1, "ReactJs", d2, "Window");
      System.out.println(desk1);
      desk1.install();
      desk1.uninstall();
      System.out.println("****************************");
      
      WebApplication web1=new WebApplication(2.2,"AngularJs",d2,"Chrome");
      System.out.println(web1);
      System.out.println("**********************************");
      
      MobileApplication mob1=new MobileApplication(2.5,"Android",d2,"Apple");
      System.out.println(mob1);
      mob1.install();
      mob1.uninstall();
      
	  
	  
  }

}
