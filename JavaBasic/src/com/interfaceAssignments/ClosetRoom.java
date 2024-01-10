package com.interfaceAssignments;
interface Closet
{

	void Room(String colour, float size);
}
class room implements Closet
{
   String colour;
   float size;
   room()
   {
	   
   }
	public room(String colour, float size) 
	{
	super();
	this.colour = colour;
	this.size = size;
   }

	@Override
	public void Room(String colour ,float size) 
	{
		System.out.println("Closet colour: "+colour);
		System.out.println("Closet size:"+size);
		
	}
	
    
	
}
public class ClosetRoom 
{
   public static void main(String[] args)
   {
	 room r=new room();
	 r.Room("Pink", 25);
   }
}
