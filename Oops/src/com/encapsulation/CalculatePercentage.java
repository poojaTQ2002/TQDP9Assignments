package com.encapsulation;

import java.util.Scanner;



class Result
{
      int rollno;
      String name;
      int m1,m2,m3;
     int sum=0;
     Result()
     {
    	 
     }
     Result(int rollno, String name, int m1,int m2,int m3)
     {
          this.rollno=rollno;
          this.name=name;
          this.m1=m1;
          this.m2=m2;
          this.m3=m3;
          
      }
     public void setRollno(int rollno)
     {
   	  this.rollno=rollno;
     }
     public int getRollno()
     {
   	  return rollno;
     }
     public void setName(String name)
     {
   	  this.name=name;
     }
     public String getName()
     {
   	  return name;
     }
     public void setM1(int m1)
     {
   	  this.m1=m1;
     }
     public int getm1()
     {
   	  return m1;
     }
     public void setM2(int m2)
     {
   	  this.m2=m2;
     }
     public int getm2()
     {
   	  return m2;
     }
     public void setM3(int m3)
     {
   	  this.m3=m3;
     }
     public int getm3()
     {
   	  return m3;
     }
     public String toString()
 	{
 		return rollno+" "+name+" "+m1+" "+m2+" "+m3 ;
 	}
   
     
     public void display()
     {
          System.out.println("Rollno : "+rollno);
          System.out.println("Name : "+name);
          System.out.println("-----MARKS-------");
          System.out.println("Sub 1 : "+m1);
          System.out.println("Sub 2 : "+m2);
          System.out.println("Sub 3 : "+m3);
          sum=m1+m2+m3;
          System.out.println("Total : "+sum);
          System.out.println("------------------");
          System.out.println("percentage: "+sum/3);
          
     }
}
public class CalculatePercentage 
{
     public static void main(String[] args) 
	{
    	 Result r1=new Result(01,"Pooja",52,66,54);
			System.out.println(r1);
			r1.display();
	}
    
	
}
