package br.com.fj.poonelioalves.model.entities;

import br.com.fj.poonelioalves.model.exception.DomainException;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}
	
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}
	public Double getBalance() {
		return balance;
	}
	
	public void deposit(Double amount) {
		balance += amount;
		System.out.println("Novo saldo: " + balance);
	}
	
	public void withdraw(Double amount) {
		if(amount > withdrawLimit) {
			throw new DomainException("Quantia de saque maior que o limite permitido.");
		} else if (amount > balance) {
			throw new DomainException("Quantia de saque maior que o seu saldo.");
		} else {
			balance -= amount;
			System.out.println("Novo saldo: R$" + String.format("%.2f", balance));
		}
	}
}
