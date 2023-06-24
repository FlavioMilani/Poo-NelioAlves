package br.com.fj.pooneliaalves.application;

import java.util.Scanner;

import br.com.fj.pooneliaalves.entities.Account;


public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Account account;
		
		System.out.print("Entre com o número da conta: ");
		String accountNum = sc.nextLine();
		
		System.out.print("Entre com o nome do titular: ");
		String accountOwn = sc.nextLine();
		
		System.out.println("Terá um deposito inicial? ");
		char initDeposit = sc.next().charAt(0);
		
		
		if(initDeposit == 'S' || initDeposit == 's') {
			System.out.println("Entre com o valor do deposito inicial: ");
			double balance = sc.nextDouble();
			account = new Account(accountNum, accountOwn, balance);
		} else {
			account = new Account(accountNum, accountOwn);
		}
		
		System.out.println("\nInformações da conta:\n" + account.showAccountInfo());
		
		System.out.print("\nEntre com o valor do depósito: R$");
		double deposit = sc.nextDouble();
		account.deposit(deposit);
		
		System.out.println("\nInformações da conta atualizada:\n" + account.showAccountInfo());
		
		System.out.print("\nEntre com o valor do saque: R$");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println("\nInformações da conta atualizada:\n" + account.showAccountInfo());
		
		
		sc.close();
	}

}
