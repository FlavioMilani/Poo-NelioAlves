package br.com.fj.pooneliaalves.entities;

public class Account {
	private String accountNum;
	private String accountOwn;
	private double balance;
	
	private static  double FEE = 5.00;
	
	public Account(){
		
	}
	
	public Account(String accountNum, String accountOwn, double balance) {
		this.accountNum = accountNum;
		this.accountOwn = accountOwn;
		this.balance = balance;
	}
	
	public Account(String accountNum, String accountOwn) {
		this.accountNum = accountNum;
		this.accountOwn = accountOwn;
	}

	public String getAccountOwn() {
		return accountOwn;
	}

	public void setAccountOwn(String accountOwn) {
		this.accountOwn = accountOwn;
	}

	public String getAccountNum() {
		return accountNum;
	}
	
	public double getBalance() {
		return balance;
	}

	public void withdraw(double withdraw) {
		balance = balance - withdraw - FEE;
	}
	
	public void deposit(double deposit) {
		balance += deposit;
	}
	
	public String showAccountInfo() {
		return 	"Conta: " + accountNum 
				+ ", Titular: " + accountOwn
				+ ", Saldo: R$" + String.format("%.2f", balance);
	}
	
}
