package com.containment;

public class CarEngine
{
   private String etype;
   
   CarEngine()
   {
	   
   }
   CarEngine(String etype)
   {
	   this.etype=etype;
   }
    public String getEtype()
    {
    	return etype;
    }
   public void setEtype(String etype) 
   {
	  this.etype = etype;
   }
   public String toString() 
   {
	return "CarEngine :etype=" + etype;
   }
   
   
   
}
