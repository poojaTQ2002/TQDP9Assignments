package collectionsAssignments;

import java.util.ArrayList;

//1. Show in program, that size of an arraylist dynamically changes 

public class sizeChanegeQ1 
{
   public static void main(String[] args)
   {
	   ArrayList<String> animals = new ArrayList<>(3);
       // Adding new elements to the ArrayList
       animals.add("Lion");
       animals.add("Tiger");
       animals.add("Cat");
       animals.add("Dog");

       System.out.println(animals);

       // Adding an element at a particular index in an ArrayList
       animals.add(2, "Elephant");

       System.out.println(animals);
   }
   
}
