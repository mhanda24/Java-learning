package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {
	
	public static void dequeTest(){
	System.out.println("\nInside DequeTest method...");
	
	//Queue
	Deque<String> deque = new ArrayDeque<String>();
	deque.add("Book1");
	deque.add("Book2");
	deque.add("Book3");
	
	System.out.println("\nPrinting Queue....");
	
	//Remove and return the element with remove()
	System.out.println(deque.remove());
	System.out.println(deque.remove());
	System.out.println(deque.remove());
	
	//Stack
	deque.push("Book1");
	deque.push("Book2");
	deque.push("Book3");
	
	System.out.println("\nPrinting Stack....");
	//Remove and return the element with pop()
		System.out.println(deque.pop());
		System.out.println(deque.pop());
		System.out.println(deque.pop());
	}
	
	
	public static void main(String[] args) {
		
		dequeTest();
		

	}

}
