package br.com.fj.pooneliaalves.application;

import java.util.Scanner;

import br.com.fj.pooneliaalves.entities.Triangle;

/*
 * Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):
*/

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Triangle x, y;
		
		x = new Triangle();
		y = new Triangle();
		
		
		System.out.println("Coloca as medidas dos lados do triângulo X ");
		x.sideA = sc.nextDouble();
		x.sideB = sc.nextDouble();
		x.sideC = sc.nextDouble();
		
		System.out.println("Coloca as medidas dos lados do triângulo Y: ");
		y.sideA = sc.nextDouble();
		y.sideB = sc.nextDouble();
		y.sideC = sc.nextDouble();
		
		sc.close();
		
		double areaX = x.area();	
		double areaY = y.area();
		
		System.out.println("Area do triângulo X = " + String.format("%.4f", areaX));
		System.out.println("Area do triângulo Y= " + String.format("%.4f", areaY));
		
		if(areaX > areaY) {
			System.out.println("A area maior : triângulo X");
		} else {
			System.out.println("A area maior : triângulo Y");
		}
	}
	
}
