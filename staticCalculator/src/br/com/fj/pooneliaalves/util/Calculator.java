package br.com.fj.pooneliaalves.util;

public class Calculator {
	public static final double PI = 3.14159; // FINAL DEFINE A CONSTANTE - PADRÃO DO NOME É MAIÚSCULO!
	
	public static double circumference(double radius) {
		return 2.0 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4.0 * PI * Math.pow(radius, 3) / 3;
	}

}
