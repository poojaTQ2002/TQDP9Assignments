package com.containment;

public class CarLab  
{
   private String cmodel;
   private int cprice;
   private CarEngine carengine;
   
   CarLab()
   {
	   
   }
   CarLab(String cmodel,int cprice,CarEngine carengine)
   {
	   this.cmodel=cmodel;
	   this.cprice=cprice;
	   this.carengine=carengine;
   }
   public void setCmodel(String cmodel)
   {
	   this.cmodel=cmodel;
   }
   public String getCmodel()
   {
	   return cmodel;
   }
   public void setCprice(int cprice)
   {
	   this.cprice=cprice;
   }
   public int getCprice()
   {
	   return cprice;
   }
   
   public void setCarEngine(CarEngine carengine)
   {
	   this.carengine=carengine;
   }
   public CarEngine getCarEngine()
   {
	   return carengine;
   }
   public String toString() 
   {
	  return "CarLab :cmodel=" + cmodel + ", cprice=" + cprice + ", carengine=" + carengine;
   }
   
   
   
   
}
