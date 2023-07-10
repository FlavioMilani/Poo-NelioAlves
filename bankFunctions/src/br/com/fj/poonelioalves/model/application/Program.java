package br.com.fj.poonelioalves.model.application;

import java.util.Scanner;

import br.com.fj.poonelioalves.model.entities.Account;
import br.com.fj.poonelioalves.model.exception.DomainException;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados da conta:");
		
		try {
		System.out.print("Numero: ");
		Integer number = sc.nextInt();
		
		System.out.print("Titular: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Saldo inicial: ");
		Double initialBalance = sc.nextDouble(); 

		System.out.print("Limite de saque: ");
		Double withdrawLimit = sc.nextDouble(); 
		
		Account account = new Account(number, name, initialBalance, withdrawLimit);
		
		System.out.print("\nColoque a quantia para saque: ");
		Double amount = sc.nextDouble(); 
		
		account.withdraw(amount);
		} catch (DomainException e){
			System.out.println("Erro ao efetuar o saque: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado!");
		} finally {
			sc.close();
		}
		
	}

}
