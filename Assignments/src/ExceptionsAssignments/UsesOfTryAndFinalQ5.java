package ExceptionsAssignments;
//5. WAP where only try and finally is used

public class UsesOfTryAndFinalQ5 
{
    public static void main(String[] args)
    {
    	 try
    	 {    
    	   int data=25/5;    
    	   System.out.println(data);    
    	  }      
    	 catch(NullPointerException e)
    	 {  
    		System.out.println(e+" "+"Hello");  
    	 }    
    		 
         finally
         {  
    		System.out.println("finally block is always executed");  
    	 }    
    		    
    		System.out.println("rest of code...");    
    } 
}
