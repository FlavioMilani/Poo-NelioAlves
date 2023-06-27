package br.com.fj.poonelioalves.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fj.poonelioalves.entities.Employee;
import br.com.fj.poonelioalves.entities.OutsourcedEmployee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o número de funcionários: ");
		int quantity = sc.nextInt();
		
		List<Employee> employees = new ArrayList<>();
		
		for(int i = 0; i < quantity; i++) {
			System.out.printf("Informações funcionário #%d:\n", i+1);
			System.out.print("Terceirizado? ");
			char isOutsourced = sc.next().charAt(0);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Horas: ");
			Integer hours = sc.nextInt();
			
			System.out.print("Valor/Hora: ");
			Double valuePerHour = sc.nextDouble();
			
			if(isOutsourced == 'n' || isOutsourced == 'N') {
				Employee notOutsourced = new Employee(name, hours, valuePerHour);
				employees.add(notOutsourced);
			} else {
				System.out.print("Valor adicional: ");
				Double bonus = sc.nextDouble();
				Employee outsourced = new OutsourcedEmployee(name, hours, valuePerHour, bonus);
				employees.add(outsourced);
			}
		}
		
		System.out.println("\nPagamentos:");
		
		
		for(Employee employeeList : employees) {
			System.out.println(employeeList.toString());
		}
		
		
		
		sc.close();
	}
}
