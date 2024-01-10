package Constructors;
class Operater
  {
	  int num1,num2,sum,sub,div,multi,mod;
	
	  Operater()
         {

		 }
	  Operater(int num1,int num2,int sum,int sub,int div,int multi,int mod)
	   {   
		   this.num1=num1;
		   this.num2=num2;
		   this.sum=sum;
		   this.sub=sub;
		   this.div=div;
		   this.multi=multi;
		   this.mod=mod;
	   }
	   int Add(int num1,int num2)
	   {
		   return num1+num2;
	   }
	   int Sub(int num1,int num2)
	   {
		   return num1-num2;
	   }
	   int Div(int num1,int num2)
	   {
		   return num1/num2;
	   }
	   int Multi(int num1,int num2)
	   {
		   return num1*num2;
	   }
	   int Modulus(int num1,int num2)
	   {
		   return num1%num2;
	   }
	   
}   
public class ArithmaticOperation
{
	public static void main(String[] args) 
	{
		Operater o1=new Operater();
		System.out.println("Sum is:"+o1.Add(5, 1));
		System.out.println("Sub is:"+o1.Sub(5, 1));
		System.out.println("division is:"+o1.Div(5, 1));
		System.out.println("multiplication is:"+o1.Multi(5, 1));
		System.out.println("modulus is:"+o1.Modulus(5, 1));
		
         
         
	}
  
}
