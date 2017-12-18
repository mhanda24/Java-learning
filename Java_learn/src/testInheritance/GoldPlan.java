package testInheritance;

public class GoldPlan extends HealthInsurancePlan{

	//covers 80% of total bill
	public double getCoverage() {
		return 0.8;
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return 0.07 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}
