package br.com.fj.poonelioalves.entities;

public class OutsourcedEmployee extends Employee {
	private Double bonus;
	
	public OutsourcedEmployee() {
	}
	
	public OutsourcedEmployee(String name, Integer hours, double valuePerHour, Double bonus) {
		super(name, hours, valuePerHour);
		this.bonus = bonus;
	}
	
	
	@Override
	public Double payment() {
		return super.payment() + bonus * 1.1;
	}
}
