package br.com.fj.pooneliaalves.application;

import java.util.Scanner;

import br.com.fj.pooneliaalves.entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Nome: ");
		emp.setName(sc.nextLine());
		System.out.print("Salário bruto: ");
		emp.setGrossSalary(sc.nextDouble());
		System.out.print("Impostos: ");
		emp.setTax(sc.nextDouble());
		
		System.out.println("Funcionario: " + emp.getName() + ", Salário líquido: R$ " + String.format("%.2f", emp.netSalary()));
		
		System.out.println("Porcentagem de aumento de salário: ");
		double increanse = sc.nextDouble();
		
		System.out.println("Salario atualizado: R$" + String.format("%.2f", emp.increanseSalary(increanse)));
		
		sc.close();
		
	}

}
