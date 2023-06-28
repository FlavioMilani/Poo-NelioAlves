package br.com.fj.poonelioalves.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import br.com.fj.poonelioalves.model.entities.Reservation;
import br.com.fj.poonelioalves.model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Número do quarto: ");
			int number = sc.nextInt();
			
			System.out.print("Data check-in (DD/MM/YYYY):");
			Date checkIn = sdf.parse(sc.next());
			
			System.out.print("Data check-out (DD/MM/YYYY):");
			Date checkOut = sdf.parse(sc.next());
			
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("\nReserva: " + reservation);
			
			System.out.println("\nEntre com os dados para atualizar os dados:");
			
			System.out.print("Data check-in (DD/MM/YYYY):");
			checkIn = sdf.parse(sc.next());
			
			System.out.print("Data check-out (DD/MM/YYYY):");
			checkOut = sdf.parse(sc.next());		
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("\nReserva atualizada: " + reservation);
			
		} catch (ParseException e) {
			System.out.println("Formato de data inválido!");
		} catch (DomainException e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("Erro inesperado!");
		}
				
		sc.close();

	}

}
