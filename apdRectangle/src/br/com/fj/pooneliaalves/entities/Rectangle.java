package br.com.fj.pooneliaalves.entities;

public class Rectangle {
	
	private double width;
	private double height;
	
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	
	public double area() {
		double area;
		area = width * height;
		
		return area;
	}
	
	public double perimeter() {
		double perimeter;
		perimeter = 2 * (width + height);
		
		return perimeter;
	}
	
	public double diagonal() {
		double diagonal;
		diagonal = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		
		return diagonal;
	}
	
}
