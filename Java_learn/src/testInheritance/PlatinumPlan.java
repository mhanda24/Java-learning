package testInheritance;

public class PlatinumPlan extends HealthInsurancePlan{
	
	//covers 90% of total bill
	public double getCoverage() {
		return 0.9;
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return 0.08 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}



}
