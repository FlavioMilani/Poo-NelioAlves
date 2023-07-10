package br.com.fj.poonelioalves.service;

public interface OnlinePaymentService {
	
	
	public Double paymentFee(Double amount);
	public Double interest(Double amount, Integer months);
}
