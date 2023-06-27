package br.com.fj.poonelioalves.entities;

public class Products {
	protected String name;
	protected Double price;
	
	public Products() {
	}
	
	public Products(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String priceTag() {
		return name + " R$" + String.format("%.2f", price);
	}
}
