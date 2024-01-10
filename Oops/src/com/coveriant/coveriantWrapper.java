package com.coveriant;
class First
{
   Number value;
   
  Object displayValue()  // return Number :  then child class cannot have return type:Character and Boolean
   {
	   return value;
   }

}


class Second extends First
{
	Integer myval;
	
//	Number displayValue()
//	{
//		myval=20;
//		return myval;
//	}
	
	Integer displayValue()
	{
		myval=20;
		return myval;
	}

}

class Third extends First
{
	
  Character ch;
  
  Character displayValue()
  {
	  ch='A';
	  return ch;
  }

}

public class coveriantWrapper {
	
	public static void main(String[] args) {
		
		First f1= new First();
		f1.value=89;
		System.out.println(f1.displayValue());
		
		
		Second s1= new Second();
		//System.out.println("Ans is:"+((int)s1.displayValue()+30));
		
		System.out.println("Ans is:"+(s1.displayValue()+30));
		
		Third t1= new Third();
		System.out.println(t1.displayValue());
		
	}

}
