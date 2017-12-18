package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestArrayList {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList();
		
		list1.add(1);
		list1.add(3);
		list1.add(5);
		list1.add(2);
		list1.add(7);
		
		System.out.println("List1: " + list1);
		
		list1.remove(2);
		System.out.println("List1: " + list1);
		
		
		List<Integer> list2 = new ArrayList();
		list2.add(10);
		list2.add(5);
				
		list1.addAll(list2);
		
		System.out.println("List1: " + list1);
		
		//list1.removeAll(list2);
		//System.out.println("List1: " + list1);
		
		System.out.println(list1.size());
		
		list1.retainAll(list2);
		System.out.println("List1: " + list1);
		
		System.out.println(list1.contains(5));
		System.out.println(list1.indexOf(5));
		
	}

}
