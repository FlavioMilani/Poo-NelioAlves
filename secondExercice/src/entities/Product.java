package entities;

public class Product {
	private String product;
	private double price;
	private int quantity;
	
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
		System.out.println("Quantidade de produtos removidos ao estoque: ");
		quantity -= value;
		
		System.out.println("Informações atualizadas: " + product + ", R$ " + String.format("%.2f", price) + ", " + quantity + 
				" unidades, total: R$" + String.format("%.2f", totalValueStock()));
	}
	
}
