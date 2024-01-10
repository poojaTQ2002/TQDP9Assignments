package com.methodoverloading;

public class MainClass 
{
   double overloadedMethod(double d)
   {
	   return d*=d;
   }
   int overloadedMethod(int i)
   {
	   return i*=i;
   }
   float overloadedMethod(float f)
   {
	   return f*=f;
   }
   public static void main(String[] args) 
   {
	   MainClass main=new MainClass();
	   System.out.println(main.overloadedMethod(100));
   }
   
}
