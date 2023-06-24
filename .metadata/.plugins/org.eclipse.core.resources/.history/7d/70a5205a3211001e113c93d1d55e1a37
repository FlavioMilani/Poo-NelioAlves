package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Product p = new Product();
		
		System.out.println("Coloque as informações do produto:");
		System.out.print("Produto: ");
		p.setProduct(sc.nextLine());
		System.out.print("Preço: ");
		p.setPrice(sc.nextDouble());
		System.out.print("Quantidade em estoque: ");
		p.setQuantity(sc.nextInt());
		
		System.out.println("Informações do produto: " + p.getProduct() + ", R$ " + String.format("%.2f", p.getPrice()) + 
				", " + p.getQuantity() + " unidades, total: R$" + String.format("%.2f", p.totalValueStock()));
		
		System.out.println("Quantidade de produtos adicionados ao estoque: ");
		p.addProduct(sc.nextInt());
		
		System.out.println("Quantidade de produtos removidos ao estoque: ");
		p.removeProduct(sc.nextInt());
		
		sc.close();

	}

}
