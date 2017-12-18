package Basics;

public class Book {
	public String title;
	
	
	public Book(){
		System.out.println("This is a parent class constructor");
		
	}
	public Book(String title) {
		this.title = title;
		System.out.println("This is a parent class constructor");
	}

    // your code (optional ~ you can avoid it. Depends on your implementation in Instructor)
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}