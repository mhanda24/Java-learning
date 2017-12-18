package com.oop;

public class testInheritance {

	public void getCoverage(HealthInsurancePlan insurancePlan){
		insurancePlan.getCoverage();
	}
	
	public static String setName(User u, String Name){
		u.setFirstName(Name);
		return u.getFirstName();
	}

	
	
	public static void main(String[] args) {
		
		testInheritance user1 = new testInheritance();
		HealthInsurancePlan plan1 = new SilverPlan();
		
		user1.getCoverage(plan1);
		
	}
}
