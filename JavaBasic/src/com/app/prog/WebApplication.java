package com.app.prog;

public class WebApplication extends Application 
{
  private String appName;
    
   public WebApplication()
   {
	   super();
   }

   public WebApplication(double version, String technology, Developer developer,String appName) 
   {
	super(version, technology, developer);
     this.appName=appName;
   }

public String getAppName() {
	return appName;
}

public void setAppName(String appName) {
	this.appName = appName;
}

@Override
public String toString() {
	return super.toString()+" "+"WebApplication [appName=" + appName + "]";
}
  
}
