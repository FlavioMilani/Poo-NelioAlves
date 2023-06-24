package br.com.fj.pooneliaalves.entities;

public class Triangle {
	public double sideA;
	public double sideB;
	public double sideC;
	
	
	public double area() {
		double perimeter;
		double area;
		
		perimeter = (this.sideA + this.sideB + this.sideC) / 2;
		area = Math.sqrt(perimeter * (perimeter - this.sideA) * (perimeter - this.sideB) * (perimeter - this.sideC));
		
		return area;
	}
}
