package Constructors;
class checkCube
{
	 int num;
	 int result;
	 checkCube()
	 {
		 
	 }
	 checkCube(int num,int result)
	 {
		 this.num=num;
		 this.result=result;
	 }
	 void printCube(int num)
	 {
		 System.out.println("Cube is :"+num*num*num);
	 }
	 
}
public class Cube
{
   public static void main(String[] args) 
   {
	   checkCube c1=new checkCube();
	   c1.printCube(2);
   }
}
