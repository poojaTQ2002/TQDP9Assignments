package AssignmentsOn2DArrays;
//12.	WAP to print upper triangular matrix.

public class UpperTriangularMatrixQ12
{
	static void upperTriangularMatrix(int ar[][])
	{
		int row = ar.length;
        int col = ar[0].length;
       
        // if number of rows and 
        // columns are not equal,then
        // return back
        if (row != col)
        {
            System.out.println("Matrix should be a Square Matrix");
            
        }
        else 
        {
          // looping over the whole matrix
           for (int i = 0; i < row; i++) 
           {
              for (int j = 0; j < col; j++)
              {
            	  // for the rows ,whose row number is
                   // greater then column number,mark the
                   // element as 0
                    if (i > j) 
                    {
                        ar[i][j] = 0;
                    }
                }
            }
 
            System.out.println("Upper Triangular Matrix is :");
           
            // printing the upper triangular matrix
            printMatrix(ar);
        }
	}
        public static void printMatrix(int a[][] )
        {
            for (int i = 0; i < a.length; i++) 
            {
                for (int j = 0; j < a[0].length; j++)
                    System.out.print(a[i][j] + " ");
                System.out.println();
            }
        }
	
  public static void main(String[] args) 
  {
	  int arr[][] = { { 2, 1, 4 }, { 1, 2, 3 }, { 3, 6, 2 } };
      
      // calling the function
      upperTriangularMatrix(arr);
  }
}
