package collectionsAssignments;

import java.util.LinkedList;

public class LastOccurence
{
   public static void main(String[] args)
   {
	   LinkedList<String> list = new LinkedList<String>();
		list.add("CPP"); 
		list.add("PYTHON"); 
		list.add("RUBY"); 
		list.add("JAVA");  
		System.out.println(list);
		System.out.println("--------------------------");
		//list.getLast();
		
		
		list.addFirst("c++");
		System.out.println(list);
		
		list.addLast("c");
		System.out.println(list);
		
		System.out.println(list.getFirst());
		
		System.out.println(list.getLast());
		
		list.removeFirst();
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		list.retainAll(list);
		System.out.println(list);
   }
}
