package br.com.fj.poonelioalves.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import br.com.fj.poonelioalves.entities.Contract;
import br.com.fj.poonelioalves.entities.Installment;
import br.com.fj.poonelioalves.service.ContractService;
import br.com.fj.poonelioalves.service.PaypalService;
public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		Integer number = sc.nextInt();
		
		System.out.print("Data (dd/MM/yyyy): ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.nextLine(), fmt);
		
		System.out.print("Valor do contrato: R$ ");
		Double totalValue = sc.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);
		
		System.out.print("\nEntre com o numero de parcelas: ");
		Integer installmentQtt = sc.nextInt();
		
		ContractService service = new ContractService(new PaypalService());
		service.processContract(contract, installmentQtt);
		
		
		for(Installment installments : contract.getInstallments()) {
			System.out.println("" + installments.getDueDate().format(fmt) + " - " 
					+ installments.getAmount());
			
		}
		
		sc.close();
	}

}
