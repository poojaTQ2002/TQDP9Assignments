package ExceptionsAssignments;

public class UncheckedExceptionPropogation 
{
	void method1()
	{
		throw new ArithmeticException("Divide by zero");
	}
	void method2()
	{
		method1();
	}
	
	void method3()
	{
		method2();
	}
	
	
	
	public static void main(String[] args) {
		UncheckedExceptionPropogation obj= new UncheckedExceptionPropogation();
		obj.method3();
		
	}

}
