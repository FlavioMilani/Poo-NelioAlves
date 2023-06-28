package br.com.fj.poonelioalves.entities;

public class PhysicalPerson extends Contributors{
	public Double healthExpenses;

	public PhysicalPerson() {
	}

	public PhysicalPerson(String name, Double annualIncome, Double healthExpenses) {
		super(name, annualIncome);
		this.healthExpenses = healthExpenses;
	}

	public Double getHealthExpenses() {
		return healthExpenses;
	}

	public void setHealthExpenses(Double healthExpenses) {
		this.healthExpenses = healthExpenses;
	}
	
	@Override
	public Double taxCalculation() {
		Double tax = 0.0;
		if(super.getAnnualIncome() > 20000 && healthExpenses > 0) {
			tax = (super.getAnnualIncome() * 0.25) - (healthExpenses * 0.5);
		} else if(super.getAnnualIncome() > 20000) {
			tax = (super.getAnnualIncome() * 0.25);
		} else {
			tax = super.getAnnualIncome() * 0.15;
		}
		
		return tax;
	}
	
}
