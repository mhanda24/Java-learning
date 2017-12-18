package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestArrayListBook {

	public static void main(String[] args) {
		
		//Creating list of books
		List<Book> list1 = new ArrayList<Book>();
		
		//creating three books
		Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
	    Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 
		
	    //Adding books
	    list1.add(b1);
	    list1.add(b2);
	    list1.add(b3);
	    
	    //Traversing list with for each
	    for(Book b : list1){
	    	System.out.println(b.getId() + " " + b.getName() + " " + b.getPublisher() + " " + b.getQuantity() + " " + b.getAuthor());
	    }
	    
	  //Traversing list with Iterator
	    Iterator<Book> iterator = list1.iterator();
	    
	    while(iterator.hasNext()){
	    Book obj=(Book)iterator.next();
	    System.out.println(obj.getId() + " " + obj.getName() + " " + obj.getPublisher() + " " + obj.getQuantity() + " " + obj.getAuthor());
	    }
	    	
	}

}
