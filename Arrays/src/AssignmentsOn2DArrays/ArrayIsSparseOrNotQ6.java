package AssignmentsOn2DArrays;
//6.	WAP to check if a matrix is a Sparse matrix (in which most of the elements are 0).
//Print “Sparse” if it is Sparse else print “Not sparse”

public class ArrayIsSparseOrNotQ6 
{
	static void checkSparseOrNot(int ar[][])
	{
		int rows=ar.length;
		int clo=ar[0].length;
		int counter=0;
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<clo;j++)
			{
				if(ar[i][j]==0)
				{
					counter++;
				}
			}
		}
		if(counter > ((rows*clo)/2))  
            System.out.println("Given matrix is a sparse matrix");  
        else  
            System.out.println("Given matrix is not a sparse matrix");  
	}
    public static void main(String[] args)
    {
    	int arr[][]  = { { 1, 0, 3 }, { 0, 0, 4 }, { 6, 0, 0 } };
    	checkSparseOrNot(arr);
    	
	}
}
