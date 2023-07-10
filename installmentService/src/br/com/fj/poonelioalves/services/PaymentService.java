package br.com.fj.poonelioalves.services;

public interface PaymentService {

	Double paymentFee(Double amount);
	Double interest(Double amount, Integer months);
}
