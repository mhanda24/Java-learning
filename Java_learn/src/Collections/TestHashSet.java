package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Book> set = new LinkedHashSet<Book>();
		
		//Creating books
		
		 Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
		 Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
		 Book b3=new Book(103,"Operating System","Galvin","Wiley",6);  
		
		 //Adding books to hashset
		 set.add(b1);
		 set.add(b2);
		 set.add(b3);
		 
		//Traversing elements
		Iterator<Book> itr = set.iterator();
		
		while(itr.hasNext()){
			Book obj = (Book)itr.next();
			System.out.println(obj.getId() + " " + obj.getName() + " " + obj.getPublisher() + " " + obj.getQuantity() + " " + obj.getAuthor());
		}

	}

}
