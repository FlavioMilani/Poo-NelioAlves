package br.com.fj.poonelioalves.entities;

public class LegalPerson extends Contributors{
	public Integer employeeQuantity;

	public LegalPerson() {
	}

	public LegalPerson(String name, Double annualIncome, Integer employeeQuantity) {
		super(name, annualIncome);
		this.employeeQuantity = employeeQuantity;
	}

	public Integer getEmployeeQuantity() {
		return employeeQuantity;
	}

	public void setEmployeeQuantity(Integer employeeQuantity) {
		this.employeeQuantity = employeeQuantity;
	}
	
	@Override
	public Double taxCalculation() {
		Double tax = 0.0;
		if(employeeQuantity <= 10) {
			tax = super.getAnnualIncome() * 0.16;
		} else {
			tax = super.getAnnualIncome() * 0.14;
		}
		
		return tax;
	};
}
