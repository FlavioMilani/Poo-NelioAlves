package br.com.fj.poonelioalves.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fj.poonelioalves.entities.Contributors;
import br.com.fj.poonelioalves.entities.LegalPerson;
import br.com.fj.poonelioalves.entities.PhysicalPerson;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Contributors> contributors = new ArrayList<>();
		
		System.out.print("Entre com a quantidade de pagadores de impostos: ");
		int quantity = sc.nextInt();
		
		for(int i = 0; i < quantity; i++) {
			System.out.printf("Informações pagador #%d:\n", i+1);
			System.out.print("Pessoa física ou jurídica (f/j)? ");
			char type = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Renda anual: ");
			Double annualIncome = sc.nextDouble();
			
			
			if(type == 'f' || type == 'F') {
				
				System.out.print("Gastos com saúde: ");
				Double healthExpenses = sc.nextDouble();
				Contributors physicalPerson = new PhysicalPerson(name, annualIncome, healthExpenses);
				contributors.add(physicalPerson);
			} else {
				System.out.print("Quantidade de funcionarios: ");
				Integer employeeQuantity = sc.nextInt();
				Contributors physicalPerson = new LegalPerson(name, annualIncome, employeeQuantity);
				contributors.add(physicalPerson);
			}
		}
		
		System.out.println("\nImpostos pagos:");
		
		Double total = 0.0;
		for(Contributors contributorsList : contributors) {
			System.out.println(contributorsList.getName() + ": R$" 
					+ String.format("%.2f", contributorsList.taxCalculation()));
			total += contributorsList.taxCalculation();
		}
		
		System.out.println("\nTotal de impostos: R$" + String.format("%.2f", total));
		
		sc.close();
		
	}

}
