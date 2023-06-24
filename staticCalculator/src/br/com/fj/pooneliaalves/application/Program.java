package br.com.fj.pooneliaalves.application;

import java.util.Scanner;

import br.com.fj.pooneliaalves.util.Calculator;

public class Program {
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o raio: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.println("Circuferencia: " + String.format("%.2f", c));
		System.out.println("Volume: " + String.format("%.2f", v));
		System.out.println("Valor PI: " + String.format("%.2f", Calculator.PI));
		
		sc.close();
	}
	
	
}
