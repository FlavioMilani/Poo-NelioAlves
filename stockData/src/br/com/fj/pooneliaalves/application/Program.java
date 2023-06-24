package br.com.fj.pooneliaalves.application;

import java.util.Scanner;

import br.com.fj.pooneliaalves.entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coloque as informações do produto:");
		System.out.print("Produto: ");
		String product = sc.nextLine();
		System.out.print("Preço: ");
		double price = sc.nextDouble();
		
		
		Product p = new Product(product, price);
		
		System.out.println("\nInformações do produto: " + p.getProduct() + ", R$ " + String.format("%.2f", p.getPrice()) + 
				", " + p.getQuantity() + " unidades, total: R$" + String.format("%.2f", p.totalValueStock()));
		
		System.out.println("Quantidade de produtos adicionados ao estoque: ");
		p.addProduct(sc.nextInt());
		
		System.out.println("Quantidade de produtos removidos ao estoque: ");
		p.removeProduct(sc.nextInt());
		
		sc.close();

	}

}
