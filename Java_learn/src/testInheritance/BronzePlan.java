package testInheritance;

public class BronzePlan extends HealthInsurancePlan{

	//covers 60% of total bill
	public double getCoverage() {
		return 0.6;
	}

	@Override
	public double computeMonthlyPremium(double salary, int age, boolean smoking) {
		return 0.05 * salary + getOfferedBy().computeMonthlyPremium(this, age, smoking);
	}
}
