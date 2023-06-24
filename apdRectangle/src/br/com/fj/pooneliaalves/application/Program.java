package br.com.fj.pooneliaalves.application;

import java.util.Scanner;

import br.com.fj.pooneliaalves.entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();

		
		System.out.println("Coloque a largura e altura do retangulo: ");
		rec.setWidth(sc.nextDouble());
		rec.setHeight(sc.nextDouble());
		
		System.out.println("AREA = " + String.format("%.2f", rec.area()));
		System.out.println("PERIMETRO = " + String.format("%.2f", rec.perimeter()));
		System.out.println("DIAGONAL = " + String.format("%.2f", rec.diagonal()));
		
		
		sc.close();

	}

}
