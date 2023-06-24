package br.com.fj.pooneliaalves.entities;

public class Product {
	private String product;
	private double price;
	private int quantity;
	
	public Product() {
		
	}
	
	public Product(String product, double price, int quantity) {
		this.product = product;
		this.price = price;
		this.quantity = quantity; 
	}
	
	public Product(String product, double price) {
		this.product = product;
		this.price = price;
		quantity = 0;
	}
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double totalValueStock() {
		
		return price * quantity;
	}
	
	public void addProduct(int value) {
		quantity += value;
		
		System.out.println("Informações atualizadas: " + product + ", R$ " + String.format("%.2f", price) + ", " + quantity + 
				" unidades, total: R$" + String.format("%.2f", totalValueStock()));
	}
	
	public void removeProduct(int value) {
		quantity -= value;
		
		System.out.println("Informações atualizadas: " + product + ", R$ " + String.format("%.2f", price) + ", " + quantity + 
				" unidades, total: R$" + String.format("%.2f", totalValueStock()));
	}
	
}
