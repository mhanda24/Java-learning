package com.oop;

public class testPolymorphism {

	public void printUserType(User u){
		u.printUserType();
	}
	
	public void setFirstName(User u, String firstName){
		u.setFirstName(firstName);
	}
	
	public void getFirstName(User u){
		u.getFirstName();
		
	}
	
	public void approveRequest(Staff s){
		if( s instanceof Editor){
		((Editor)s).approveRequest();
	}else{
		System.out.println("Wrong object type");
	}
}
	public static void main(String[] args) {
		
	User user = new User();
	User staff = new Staff();
	User editor = new Editor();
	Review review = new Review("Hi How r u doing");
	editor.printId();
	review = staff.postAReview("i am fine");
	System.out.println(review);
	
	
	
		
	testPolymorphism tp = new testPolymorphism();
	//Can have super class refernce type and any subclass object type in polymorphism
	tp.printUserType(user);
	tp.printUserType(staff);
	tp.printUserType(editor);
	
		
	//Step 2
	
	staff.saveWebLink();
	
	
	//Step 3 //setting up a editor firstname
	
	
	tp.setFirstName(user, "Bob");
	tp.setFirstName(staff, "Tom");
	tp.setFirstName(editor, "Max");
	
	tp.getFirstName(user);
	tp.getFirstName(staff);
	tp.getFirstName(editor);
	
	//step 4 //instanceof
	Staff staff1 = new Staff();
	Staff editor1 = new Editor();
	
	tp.approveRequest(staff1);
	
	}

}
