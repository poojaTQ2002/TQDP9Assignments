package com.LabAssignments;
class X
{
	int method(int i)
	{
		return i=i*i;
		
	}
}
class Y extends X
{
	double method(double d)
	{
		return d/=d;
	}
}
class Z extends Y
{
	float method(float f)
	{
		return f+=f;
	}
}
public class LabQuestion2 
{
   public static void main(String[] args)
   {
	
	   Z z=new Z();
	   System.out.println(z.method(21.12));
   }
}
