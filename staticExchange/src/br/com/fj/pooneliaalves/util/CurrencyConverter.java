package br.com.fj.pooneliaalves.util;

public class CurrencyConverter {
	public static double IOF = 1.06;
	
	public static double exchange(double price, double dollars) {
		return price * dollars * IOF;
	}
}
