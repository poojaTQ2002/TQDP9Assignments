package methodOverridingAssignment;
class shape
{
    void draw()
    {
    	System.out.println("Draw shape");
    }
    
}
class Circle extends shape
{
    void draw()
    {
    	System.out.println("Draw circle");
    }
}
class Square extends shape
{
	void draw()
	{
		System.out.println("Draw square");
	}
}
class Rectangle extends shape
{
	void draw()
	{
		System.out.println("Draw square");
	}
}

  
public class Shape2 
{
	public static void main(String[] args) 
	  {
          shape s=new shape(); 
		  Rectangle r = new Rectangle();
		  Circle c=new Circle();       
		  Square sq=new Square();
		  s.draw();
		  r.draw();
		  c.draw();
		  sq.draw();
		  
	  }

}
