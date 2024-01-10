package com.methodoverloading;
class checkRoom
{  
	int calcuArea(int lenght,int breadth)
	{
		return(lenght*breadth);
	}
   void calccheckRoom(int lenght,int breadth,int height)
   {
	   System.out.println("Volume of room :"+lenght*breadth*height);
   }
   void calccheckRoom(int length,int breadth)
   {
	   System.out.println("Area of room :"+length*breadth);
   }
}
public class Room 
{
  public static void main(String[] args)
  {
	  checkRoom r1=new checkRoom();
	  r1.calccheckRoom(2, 3);
	  r1.calcuArea(5,6);
	  
	  checkRoom r2=new checkRoom();
	  r2.calccheckRoom(2, 3,5);
	  
  }
}
