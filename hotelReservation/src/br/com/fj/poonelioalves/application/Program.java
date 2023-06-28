package br.com.fj.poonelioalves.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.fj.poonelioalves.model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
	
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Número do quarto: ");
		int number = sc.nextInt();
		
		System.out.print("Data check-in (DD/MM/YYYY):");
		Date checkIn = sdf.parse(sc.next());
		
		System.out.print("Data check-out (DD/MM/YYYY):");
		Date checkOut = sdf.parse(sc.next());
		
		if(!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: Check-out deve ser depois da data de check-in.");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("\nReserva: " + reservation);
			
			System.out.println("\nEntre com os dados para atualizar os dados:");
			
			System.out.print("Data check-in (DD/MM/YYYY):");
			checkIn = sdf.parse(sc.next());
			
			System.out.print("Data check-out (DD/MM/YYYY):");
			checkOut = sdf.parse(sc.next());		
			
			String error = reservation.updateDates(checkIn, checkOut);
			if(error != null) {
				System.out.println("Erro na atualização da reserva: " + error);
			} else {
				System.out.println("\nReserva atualizada: " + reservation);
			}		
		}
				
		sc.close();

	}

}
