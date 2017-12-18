package Basics;

public class testSuper extends Book {
		
	public testSuper() {
		super();
		System.out.println("This is a student class constructor");
	}
	
	public testSuper(String title) {
		super(title);
		System.out.println("This is a student class constructor with args");
	}

	public static void main(String[] args) {
		
	testSuper ts = new testSuper("Main of child");
	

	}

}
