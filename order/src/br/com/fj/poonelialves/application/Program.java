package br.com.fj.poonelialves.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import br.com.fj.poonelialves.entities.Client;
import br.com.fj.poonelialves.entities.Order;
import br.com.fj.poonelialves.entities.OrderItem;
import br.com.fj.poonelialves.entities.Product;
import br.com.fj.poonelialves.entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.nextLine();
		
		System.out.print("Data de nascimento: ");
		Date date = sdf.parse(sc.next());
		
		Client client = new Client(name, email, date);
		
		System.out.println("Entre com as informações do pedido:");
		
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		System.out.print("Quantos itens tem no pedido? ");
		Integer quantity = sc.nextInt();
		
		LocalDateTime orderMoment = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String formatDateTime = orderMoment.format(fmt);
		Date orderDate = sdf2.parse(formatDateTime);
		
		Order order = new Order(orderDate, status, client);
		
		for (int i = 0; i < quantity; i++) {
			sc.nextLine();
			System.out.printf("Entre com o %do item:\n", i+1);
			
			System.out.print("Produto: ");
			String productName = sc.nextLine();
			
			System.out.print("Preço: ");
			Double productPrice = sc.nextDouble();
			
			System.out.print("Quantidade: ");
			Integer productQtt= sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			OrderItem orderItem = new OrderItem(productQtt, productPrice, product);
	
			order.addItem(orderItem);
		}
		
		System.out.println("\n" + order);
		
		sc.close();
	}
}
