package br.com.fj.poonelioalves.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.com.fj.poonelioalves.entities.ImportedProduct;
import br.com.fj.poonelioalves.entities.Products;
import br.com.fj.poonelioalves.entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Products> products = new ArrayList<>();
		
		System.out.print("Entre com a quantidade de produtos: ");
		int quantity = sc.nextInt();
		
		for(int i = 0; i < quantity; i++) {
			System.out.printf("Informações do produto #%d:\n", i+1);
			
			System.out.print("Comum, usado ou importado(c/u/i)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("preço: ");
			Double price = sc.nextDouble();
			
			switch (type) {
			case 'c': 
				Products commonProduct = new Products(name, price);
				products.add(commonProduct);
				break;
			
			case 'u':
				System.out.print("Data de fabricação (DD/MM/AAAA):");
				Date date = sdf.parse(sc.next());
				Products usedProduct = new UsedProduct(name, price, date);
				products.add(usedProduct);
				break;
			
			case 'i':
				System.out.print("Taxa: ");
				Double fee = sc.nextDouble();
				Products importedProducts = new ImportedProduct(name, price, fee);
				products.add(importedProducts);
				break;
			}
		}
		
		System.out.println("\nEtiquetas de preço:");
		
		for(Products productsList : products) {
			System.out.println(productsList.priceTag());
		}
		
		sc.close();
		
	}

}
