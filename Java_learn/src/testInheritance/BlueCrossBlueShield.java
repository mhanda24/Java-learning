package testInheritance;

public class BlueCrossBlueShield implements InsuranceBrand {
	
	private long id;
	private String name;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public double computeMonthlyPremium(HealthInsurancePlan insurancePlan, int age, boolean smoking) {
		double amount=0.0;
		if (insurancePlan instanceof PlatinumPlan){
			if(age>55 && smoking == true){
				amount = 300.00;
			}else if(age>55 && smoking == false){
			 amount = 200.00;
			}else if(age<=55 && smoking==true){
				amount = 100.00;
			}
	}
		if (insurancePlan instanceof GoldPlan){
			 if(age>55 && smoking == true){
					amount = 240.00;
			 }else if(age>55 && smoking == false){
				 amount = 150.00;
			 }else if(age<=55 && smoking==true){
					amount = 90.00;
				}
		}
		if (insurancePlan instanceof SilverPlan){
			 if(age>55 && smoking == true){	
					amount = 180.00;
			 }else if(age>55 && smoking == false){
				 amount = 100.00;
			 }else if(age<=55 && smoking==true){
					amount = 80.00;
				}
		}

		if (insurancePlan instanceof BronzePlan){
			 if(age>55 && smoking == true){
					amount = 120.00;
			 }else if(age>55 && smoking == false){
				 amount = 50.00;
			 }else if(age<=55 && smoking==true){
					amount = 70.00;
				}
		}
		return amount;
	}
}
