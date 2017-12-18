package Collections;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet1 {

	public static void testingHashSet(){
		
		
		
		Movie m1=new Movie("Title 1","Author 1", 1982);  
		Movie m2=new Movie("Title 1","Author 1", 1982);  
		
		Set<Movie> set = new HashSet<>();
		set.add(m1);
		set.add(m2);
		System.out.println("set: " + set.toString());
	}
	
	public static void main(String[] args) {
		
		testingHashSet();
	}

}


class Movie{

	private String title;
	private String author;
	private int year;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	Movie(String title, String author, int year){
		this.title=title;
		this.author=author;
		this.year=year;
	}
	
	public String toString(){
		return "Book [title=" + title + ", author=" + author + ", Year=" + year + "]";
		
		
	}
	
	public int hashCode(){
		return title.hashCode();
	}
	
	public boolean equals(Object o){
		return (year ==(((Movie)o).getYear())) && (author == (((Movie)o).getAuthor()));
		
	}
	
	
}