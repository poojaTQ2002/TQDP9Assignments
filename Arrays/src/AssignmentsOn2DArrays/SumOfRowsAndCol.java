package AssignmentsOn2DArrays;

public class SumOfRowsAndCol 
{
	 
	static void sumRows(int ar[][])
	{
	    int	rows = ar.length;    
	    int cols = ar[0].length;
	    int sumRow = 0; 
	     
	    for(int i = 0; i < rows; i++)
	    { 
	    	sumRow = 0;
	    	for(int j = 0; j < cols; j++)
	    	{    
              sumRow = sumRow + ar[i][j];    
            }    
            System.out.println("Sum of " + (i+1) +" row: " + sumRow);    
        } 
	}
	static void sumCol(int ar[][])
	{
		int	rows = ar.length;    
	    int cols = ar[0].length;
	    int sumCol = 0; 
	    
        for(int i = 0; i < cols; i++)
	    {    
        	sumCol = 0; 
          for(int j = 0; j < rows; j++)
            {    
              sumCol = sumCol + ar[j][i];    
            }    
            System.out.println("Sum of " + (i+1) +" column: " + sumCol);    
        }    
	}
   public static void main(String[] args) 
   {
	   int arr[][] = {{1, 2, 3},{4, 5, 6},{7, 8, 9} };  
	   sumRows(arr);
	   System.out.println("--------------");
	   sumCol(arr);
	   
   }
}
