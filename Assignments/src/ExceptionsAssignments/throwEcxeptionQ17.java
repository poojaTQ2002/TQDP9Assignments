package ExceptionsAssignments;

import java.util.InputMismatchException;
import java.util.Scanner;

public class throwEcxeptionQ17
{
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter age:");
		
		int age =sc.nextInt();
		sc.close();
		
		if(age<0)
			throw new InputMismatchException(); // handled by JVM
		else
			System.out.println("You are "+age +" years old.");
		
		
		
	}
}
