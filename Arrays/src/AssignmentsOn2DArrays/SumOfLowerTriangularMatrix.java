package AssignmentsOn2DArrays;

public class SumOfLowerTriangularMatrix 
{
	static void SumLowerTriangular(int ar[][])
	{
		int row = ar.length;
        int col = ar[0].length;
        int sum=0;
       
        // if number of rows and 
        // columns are not equal,then
        // return back
        if (row != col)
        {
            System.out.println("Please check given matrix is Square Matrix....");
            
        }
        else 
        {    
            //Performs required operation to convert given matrix into lower triangular matrix    
            System.out.println("Lower triangular matrix: ");    
            for(int i = 0; i < row; i++)
            {    
                for(int j = 0; j < col; j++)
                {    
                  //if(j > i)    
                	  if(i > j) 
      				{
      					sum = sum +ar[i][j];
      				}   
                }    
                   
            } 
            System.out.println("The Sum of the Lower Triangle Matrix =  " + sum); 
        }    
  }    
    
//        public static void printMatrix(int a[][] )
//        {
//            for (int i = 0; i < a.length; i++) 
//            {
//                for (int j = 0; j < a[0].length; j++)
//                    System.out.print(a[i][j] + " ");
//                System.out.println();
//            }
//        }
	
  public static void main(String[] args) 
  {
	  int arr[][] = { { 10,20,30 }, { 40,50,60}, { 70,80,90} };
      
      // calling the function
	  SumLowerTriangular(arr);
  }
}
