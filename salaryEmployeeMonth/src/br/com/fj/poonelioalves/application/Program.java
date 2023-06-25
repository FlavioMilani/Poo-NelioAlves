package br.com.fj.poonelioalves.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.fj.pooneliaalves.entities.Department;
import br.com.fj.pooneliaalves.entities.HourContract;
import br.com.fj.pooneliaalves.entities.Worker;
import br.com.fj.pooneliaalves.entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre o nome do departamento: ");
		Department department = new Department(sc.nextLine());
		
		System.out.println("Entre os dados do trabalhador: ");
		Worker worker = new Worker();
		System.out.print("Nome: ");
		worker.setName(sc.nextLine());
		System.out.print("Level: ");
		worker.setLevel(WorkerLevel.valueOf(sc.nextLine()));
		System.out.print("Salário base: R$");
		worker.setBaseSalary(sc.nextDouble());
		worker.setDepartment(department);
		
		System.out.print("Quantos contratos ele tem? ");
		int qttContracts = sc.nextInt();
		
		
		for (int i = 0; i < qttContracts; i++) {
			System.out.printf("Contrato #%d:\n", i+1);
			System.out.print("Data (DD/MM/AAAA): ");
			sc.nextLine();
			Date contractDate = sdf.parse(sc.next());
			
			System.out.print("Valor por hora: R$");
			Double valuerPerHour = sc.nextDouble();
			
			System.out.print("Duração (horas): ");
			Integer duration = sc.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuerPerHour, duration);
			worker.addContract(contract);
		}
		
		System.out.print("\nEntre com o mês e ano para calcular a renda (MM/YYYY): ");
		String monthYear = sc.next();
		
		int month = Integer.parseInt(monthYear.substring(0, 2));
		int year = Integer.parseInt(monthYear.substring(3));
		
		System.out.print("Nome: " + worker.getName() + "\nDepartamento: " + worker.getDepartment().getName() 
				+ "\nRenda de " + monthYear + ": R$" + String.format("%.2f", worker.income(year, month)));
		
		sc.close();
	}

}
