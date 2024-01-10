package com.StringBuffereBuilder;

public class StringBufferBulderDemo 
{
   public static void main(String[] args)
   {
	  StringBuffer sb1=new StringBuffer();
	  System.out.println(sb1.capacity());//by default capacity is 16
	  
	  StringBuffer sb2= new StringBuffer(4);
	  System.out.println(sb2.capacity());
	  
	  sb2.append("Javas");//(currentcaoacity*2)+2=10
	  System.out.println(sb2+":"+sb2.capacity());
	  System.out.println(sb2+":"+sb2.length());
	  
   }
}
