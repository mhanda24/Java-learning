package Collections;

import java.util.Comparator;

public class Book  implements Comparable<Book>{
	private int id;  
	private String name,author,publisher;  
	private int quantity;
	
	Book(int id, String name, String author, String publisher, int quantity){
		this.id=id;  
	    this.name = name;  
	    this.author = author;  
	    this.publisher = publisher;  
	    this.quantity = quantity;  
		
	}

	public int getId() {
		return id;
	}
	
	public String getName(){
		return name;
	}
	
	public String getAuthor(){
		return author;
	}

	public String getPublisher(){
		return publisher;
	}	

	public int getQuantity(){
		return quantity;
	}
/*
	@Override
	public int compareTo(Book b) {
		if(quantity>b.quantity){
			return 1;
		}else if (quantity<b.quantity){
			return -1;
		}else{
		return 0;
	}
		
}*/
	
	@Override
	public int compareTo(Book b){
		return getName().compareTo(((Book)b).getName());
	}
}

class NameComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		return ((Book)o1).getName().compareTo(((Book)o2).getName());
	}


	
	
}
