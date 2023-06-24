package br.com.fj.pooneliaalves.application;

import java.util.Scanner;

import br.com.fj.pooneliaalves.util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual o valor do dolar? ");
		double price = sc.nextDouble();
		System.out.print("Quantos dólares serão comprados?");
		double dollars = sc.nextDouble();
		
		System.out.println("Quantia a ser paga em reais é de: " + String.format("%.2f", CurrencyConverter.exchange(price, dollars)));
		
		sc.close();
		
	}

}
