package ArraysAssignments;

import java.util.Arrays;

//WAP to find min character in character array. Means e.g. arr[] = [‘A’, ‘D’, ‘E’, ‘x’, ‘z’, 
//‘R’], so min character is ‘A’. 

public class minCharacter
{
	public static char findMin(char ar[])
	{
		char min=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
			}
		}
		return min;
	}
   public static void main(String[] args) 
   {
	  char arr[]= {'A','D','E','x','z','R'};
	  System.out.println(Arrays.toString(arr));
	  System.out.println("--------------");
	  System.out.println("Minium Charracter is :");
	  findMin(arr);
   }
}
