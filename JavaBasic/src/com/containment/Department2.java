package com.containment;

public class Department2 
{
   private int did;
   private String dname;
   
   Department2()
   {
	   
   }
   Department2(int did,String dname)
   {
	   this.did=did;
	   this.dname=dname;
   }
   public void setDid(int did)
   {
	   this.did=did;
   }
   public int setDid()
   {
	   return did;
   }
   public void setDname(String dname)
   {
	   this.dname=dname;
   }
   public String setDname()
   {
	   return dname;
   }
   public String toString() 
   {
     return "Department :"+did+" "+dname;
   }
}
