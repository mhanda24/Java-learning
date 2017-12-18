package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {

	public static void testingCollections(){
		
		List<String> list = new ArrayList<>();
		list.add("Vishal");
		list.add("John");
		list.add("John");
		
		String[] name = {"Anita"};
		
		Collections.addAll(list, name);
		
		System.out.println("newList : " + list);
		
		Collections.sort(list);
		
		System.out.println("Sorted List : " + list);
		
		System.out.println("Is john there " + Collections.binarySearch(list, "John"));
		
		Collections.reverse(list);
		System.out.println("Reverse List " + list);
		
		Collections.swap(list, 0, 3);
		System.out.println("Swap List " + list);
		
		System.out.println("#John " + Collections.frequency(list, "John"));
		
		Collections.shuffle(list);
		System.out.println("Shuffle List " + list);
		
	}
	
	public static void main(String[] args) {
		
		testingCollections();
		

	}

}
