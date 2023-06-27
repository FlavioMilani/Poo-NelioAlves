package br.com.fj.poonelioalves.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Products {
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return name + "(used) R$" + String.format("%.2f", price) 
			+ "(Data de fabricação: " + sdf.format(manufactureDate) + ")";
	}
}
