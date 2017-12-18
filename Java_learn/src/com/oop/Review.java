package com.oop;

public class Review {
	
	public String reviewText;
	private boolean isApproved;
	
	public Review(String reviewText){
		this.reviewText=reviewText;
	}
	
	
	public boolean isApproved() {
		return isApproved;
	}
	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}
	

}
