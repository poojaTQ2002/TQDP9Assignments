package com.app.mob;

import com.app.prog.Application;
import com.app.prog.Developer;

public class MobileApplication extends Application
{
  private String mobName;
   public MobileApplication()
   {
	   super();
   }

  public MobileApplication(double version, String technology, Developer developer, String mobName) 
  {
	super(version, technology, developer);
	this.mobName = mobName;
  }

public String getMobName() {
	return mobName;
}

public void setMobName(String mobName) {
	this.mobName = mobName;
}

@Override
public String toString() {
	return super.toString()+" "+"MobileApplication [mobName=" + mobName + "]";
}
  
  
  
  
}
