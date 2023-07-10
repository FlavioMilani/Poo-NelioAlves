package br.com.fj.poonelioalves.service;

import java.time.LocalDate;

import br.com.fj.poonelioalves.entities.Contract;
import br.com.fj.poonelioalves.entities.Installment;

public class ContractService {
	
	OnlinePaymentService paymentService;
	
	
	public ContractService(OnlinePaymentService paymentService) {
		super();
		this.paymentService = paymentService;
	}

	public void processContract(Contract contract, Integer months) {
		Double amount = contract.getTotalValue() / months;
		
		for(int i = 1; i <= months; i++) {
			Double interest = paymentService.interest(amount, i);
			Double paymentFee = paymentService.paymentFee(amount + interest);
			LocalDate dueDate = contract.getDate().plusMonths(i);
			Double installmentValue = interest + paymentFee + amount;
			
			contract.getInstallments().add(new Installment(dueDate, installmentValue));
		}
	}
}
