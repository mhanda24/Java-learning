package Collections;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {

	public static void main(String[] args) {
		
		//Create object of Treeset
		Set<Book> set = new TreeSet<Book>(new NameComparator());
		
		//Create books
		Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
	    Book b2=new Book(233,"Operating System","Galvin","Wiley",6);  
	    Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
	    Book b4=new Book(121,"Let us C","Yashwant Kanetkar","BPB",8);  
	    
	    
	    //Adding books to treeset
	    set.add(b1);
	    set.add(b2);
	    set.add(b3);
	    
	    for(Book b : set){
	    	System.out.println(b.getId()+" "+b.getName()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getQuantity());  
	    }
	    
	    
	    
	}

}
