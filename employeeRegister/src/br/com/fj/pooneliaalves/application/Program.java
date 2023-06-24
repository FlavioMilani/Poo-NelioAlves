package br.com.fj.pooneliaalves.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fj.pooneliaalves.entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<Employee> emp = new ArrayList<>();
		
		System.out.print("Quantos funcionários vão ser registrados? ");
		int qttEmployee = sc.nextInt();
		
		for(int i = 0; i < qttEmployee; i++) {
			System.out.println("\nEmployee #" + (i+1));
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			emp.add(new Employee(id, name, salary));
		}
		
		System.out.println("Entre com o id do funcionário que terá um aumento: ");
		sc.nextLine();
		int id = sc.nextInt();
		
		Employee empId = emp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if(empId == null) {
			System.out.println("O ID não existe!");
		} else {
			System.out.print("Entre com o porcentagem? ");
			empId.increanse(sc.nextDouble());
		}
		
		System.out.println("\nLista de funcionários: ");
		
		for(Employee list : emp) {
			System.out.println(list.getId() + ", " + list.getName() + ", " + String.format("%.2f", list.getSalary()));
		}
		
		sc.close();
	}

}
