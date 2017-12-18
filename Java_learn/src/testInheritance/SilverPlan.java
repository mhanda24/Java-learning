package testInheritance;

public class SilverPlan extends HealthInsurancePlan{

	//covers 70% of total bill
	public double getCoverage() {
		return 0.7;
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return 0.06 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}
