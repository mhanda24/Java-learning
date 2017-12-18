package testInheritance;



public class TestInsurance {

	
	
	public static void main(String[] args) {
		
		HealthInsurancePlan pP,gP,sP,bP;
		pP= new PlatinumPlan();
		System.out.println(pP.getCoverage());
		pP.getCoverage();
		gP= new GoldPlan();
		System.out.println(gP.getCoverage());
		sP= new SilverPlan();
		System.out.println(sP.getCoverage());
		bP= new BronzePlan();
		System.out.println(bP.getCoverage());
		
		Patient patient = new Patient();
		patient.setInsurancePlan(pP);
		//patient.setInsurancePlan(gP);
		//patient.setInsurancePlan(sP);
		//patient.setInsurancePlan(bP);
		patient.setInsurancePlan(pP);
		
		double[] bills = Billing.computePaymentAmount(patient, 1000.00);
		for (double bill : bills){
			System.out.println(bill);
		}
	
		User staff = new User();
		InsuranceBrand insuranceBrand = new BlueCrossBlueShield();
		HealthInsurancePlan insurancePlan = new PlatinumPlan();
		
		insurancePlan.setOfferedBy(insuranceBrand);
		staff.setInsurancePlan(insurancePlan);
		System.out.println(insurancePlan.computeMonthlyPremium(5000, 56, false));
		
	}
	

}
