package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayvsLinked {

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Tom");
		list1.add("Bob");
		list1.add("Sam");
		
		
		/*LinkedList<Integer> list2 = new LinkedList<Integer>();
		
		list2.add(40);
		list2.add(30);
		list2.add(40);
		list2.add(20);
		list2.add(40);
		*/
		ListIterator<String> iterator = list1.listIterator();
		
		System.out.println("traversing elements in forward direction...");  
		while(iterator.hasNext()){  
			System.out.println(iterator.next());  
			}  
		System.out.println("traversing elements in backward direction...");  
		while(iterator.hasPrevious()){
			System.out.println(iterator.previous());
		}
		
	}

}
