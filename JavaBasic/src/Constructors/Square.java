package Constructors;
class checkSquare
{
	 int num;
	 int result;
	 checkSquare()
	 {
		 
	 }
	 checkSquare(int num,int result)
	 {
		 this.num=num;
		 this.result=result;
	 }
	 void printSquare(int num)
	 {
		 System.out.println("Square is :"+num*num);
	 }
	 
}
public class Square
{
   public static void main(String[] args) 
   {
	   checkSquare cs1=new checkSquare();
	   cs1.printSquare(10);
   }
}
