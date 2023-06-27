package br.com.fj.poonelioalves.application;

import java.util.ArrayList;
import java.util.List;

import br.com.fj.poonelioalves.entities.Account;
import br.com.fj.poonelioalves.entities.BusinessAccount;
import br.com.fj.poonelioalves.entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Account acc1 = new Account(1001, "Alex", 1000.0); Account acc2 = new
		 * SavingsAccount(1002, "Maria", 1000.0, 0.01); Account acc3 = new
		 * BusinessAccount(1003, "Bob", 1000.0, 500.0);
		 */
		List<Account> list = new ArrayList<>();
		
		list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
		list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));
		
		double sum = 0.0;
		for(Account acc : list) {
			sum += acc.getBalance();
		}
		
		System.out.println("Total balance: " + String.format("%.2f", sum));
		
		for(Account acc : list) {
			acc.deposit(10.0);
			
		}
		
		for(Account acc : list) {
			System.out.println("balance updated for account " + acc.getNumber() + ": " 
					+ String.format("%.2f", acc.getBalance()));
			
		}
		
		/*
		 * Account acc = new Account(1001, "Alex", 1000.0); BusinessAccount bacc = new
		 * BusinessAccount(1002, "Maria", 0.0, 500.0);
		 * 
		 * // UPCASTING
		 * 
		 * Account acc1 = bacc; Account acc2 = new BusinessAccount(1003, "Bob", 1000.0,
		 * 500.0); Account acc3 = new SavingsAccount(1004, "Anna", 1000.0, 0.01);
		 */
		// DOWNCASTING
		
		/*
		 * BusinessAccount acc4 = (BusinessAccount)acc2; acc4.loan(100.0);
		 */
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		/*
		 * if (acc3 instanceof BusinessAccount) { BusinessAccount acc5 =
		 * (BusinessAccount)acc3; acc5.loan(200.0); System.out.println("Loan!"); }
		 * 
		 * if (acc3 instanceof SavingsAccount) { SavingsAccount acc5 =
		 * (SavingsAccount)acc3; acc5.updateBalance(); System.out.println("Update!"); }
		 */
		
		//Override
		
		/*
		 * acc.withdraw(200); System.out.println(acc.getBalance());
		 * 
		 * acc3.withdraw(200); System.out.println(acc3.getBalance());
		 * 
		 * acc2.withdraw(200); System.out.println(acc2.getBalance());
		 */
		
	}
}