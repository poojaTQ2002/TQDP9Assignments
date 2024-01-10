package Constructors;

import java.util.Scanner;

public class AcademyTest 
{
	static Scanner sc=new Scanner(System.in);
	public static void Test2(Academy a1)
	{
		System.out.println("Enter Id : ");
		a1.setAid(sc.nextInt());
		System.out.println("Enter name : ");
		a1.setAname(sc.next());
		System.out.println("Enter Address: ");
		a1.setAddress(sc.next());
		
    }
	public static void main(String[] args) 
	{
		Academy a2=new Academy();
		Test2(a2);
		System.out.println(a2);
	}
}
