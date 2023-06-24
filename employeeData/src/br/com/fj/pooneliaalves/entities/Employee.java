package br.com.fj.pooneliaalves.entities;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increanseSalary(double percentage) {
		return grossSalary * (1 + percentage / 100) - tax;
	}
}
