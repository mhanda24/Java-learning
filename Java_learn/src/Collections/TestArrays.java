package Collections;

import java.util.Arrays;
import java.util.List;

public class TestArrays {
	
	public static void Sequential(){
		String[] strArray = new String[]{"Raj", "Anita"};
		List<String> strings = Arrays.asList(strArray);//Convert Array to fixed list with Arrays.asList()
		System.out.println(strings);
		
		//Add/update element in the list
		strings.set(0,"John");
		System.out.println("Updated Array " + Arrays.toString(strArray));
		
		//to create fixed size arraylist
		List<String> fixedList = Arrays.asList(new String[3]);
		List<int[]> fixedList2 = Arrays.asList(new int[3]);
		
		
		System.out.println(fixedList2.size());
		
		Arrays.sort(strArray);
		System.out.println("Sorting: " + Arrays.toString(strArray));
		
		
		System.out.println(Arrays.binarySearch(strArray, "John"));
		
		
		String[] strArray1 = Arrays.copyOf(strArray, 6);
		System.out.println(Arrays.toString(strArray1));
		
		System.out.println("Equals? " + Arrays.equals(strArray, strArray1));
		
	}

	public static void main(String[] args) {
		Sequential();

	}

}
