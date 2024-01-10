package Constructors;

import java.util.Scanner;

public class Employee1Test 
{
	static Scanner sc=new Scanner(System.in);
	public static void Test1(Employee e1)
	{
		System.out.println("Enter Id : ");
		e1.setEid(sc.nextInt());
		System.out.println("Enter name : ");
		e1.setEname(sc.next());
		System.out.println("Enter salary : ");
		e1.setEsalary(sc.nextFloat());
		
    }
	public static void main(String[] args) 
	{
		Employee e2=new Employee();
		Test1(e2);
		System.out.println(e2);
	}
}
