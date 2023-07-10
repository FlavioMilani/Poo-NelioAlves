package br.com.fj.poonelioalves.service;

public class PaypalService implements OnlinePaymentService{
	
	@Override
	public Double paymentFee(Double amount) {
		return amount * 0.02;
	}
	
	@Override
	public Double interest(Double amount, Integer months) {
		return amount * (1 * months / 100.0);
	}
}
