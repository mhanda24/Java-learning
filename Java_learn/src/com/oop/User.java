package com.oop;


public class User{
	public int id =1;
	private String firstName;
	private HealthInsurancePlan insurancePlan;
	
	
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		//System.out.println("user: firstname");
	}
	

	public void printUserType(){
		System.out.println("user");
	}
	
	
	public void saveWebLink(){
		System.out.println("user: weblink");
		//postAReview();
	}
	
	public Review postAReview(String reviewText){
		System.out.println("user: postAReview");
		Review review = new Review(reviewText);
		return review;
	}

	public HealthInsurancePlan getInsurancePlan() {
		return insurancePlan;
	}

	public void setInsurancePlan(HealthInsurancePlan insurancePlan) {
		this.insurancePlan = insurancePlan;
	}
		public void printId(){
			System.out.println("user method");			
		}

	}

