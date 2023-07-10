package br.com.fj.poonelioalves.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Contract {
	private Integer number;
	private LocalDate date;
	private Double totalValue;
	
	List<Installment> installments = new ArrayList<>();
	
	public Contract() {
	}

	public Contract(Integer number, LocalDate date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	//Não será permitido alterar número do contrato;
	public Integer getNumber() {
		return number;
	}
	
	//Não será permitido alterar valor do contrato(Apenas na parcela);
	public Double getTotalValue() {
		return totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
	
}
