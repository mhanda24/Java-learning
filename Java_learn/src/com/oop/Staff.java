package com.oop;

public class Staff extends User{
	
	public int id =2;
/*	public void printUserType(){
		System.out.println("staff");
	}*/
	
	public Review postAReview(String reviewText){
		System.out.println("Staff: postAReview");
		Review review = super.postAReview(reviewText);
		review.setApproved(true);
		return review;
	}
	
	public void printId(){
		System.out.println("staff method");	
		System.out.println("id " + id);
		System.out.println("super.id" + super.id);
	}
	

}
