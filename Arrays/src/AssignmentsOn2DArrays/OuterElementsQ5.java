package AssignmentsOn2DArrays;
//5.	WAP to print outer elements of 2D array of 4X4.

public class OuterElementsQ5 
{
	static void printOuterElements(int ar[][])
	{
		 for(int i=0;i<5;i++)
		  {
			 for(int j=0;j<5;j++)
			 {
				 if((i==0)||(i==4)||(j==0)||(j==4))
				 {
					 System.out.print(ar[i][j]+" ");
				 }
				 else
				 {
					 System.out.print("  ");
				 }
				 
			 }
			 System.out.println("");
			 
		  }
		
	}
  public static void main(String[] args) 
  {
	 int arr[][]= {{1,1,1,1,1},{2,2,2,2,2},{3,3,3,3,3},{4,4,4,4,4},{5,5,5,5,5}};
	 printOuterElements(arr);
  }
}
