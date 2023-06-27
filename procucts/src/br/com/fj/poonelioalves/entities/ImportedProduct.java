package br.com.fj.poonelioalves.entities;

public class ImportedProduct extends Products {
	private Double customsFee;

	public ImportedProduct() {
	}
	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalPrice() {
		return price + customsFee;
	}
	
	@Override
	public String priceTag() {
		return name + " R$" + String.format("%.2f", totalPrice()) 
			+ " (Taxas customizadas: R$" + String.format("%.2f", customsFee) + ")";
	}
}
