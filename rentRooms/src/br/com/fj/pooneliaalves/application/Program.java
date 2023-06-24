package br.com.fj.pooneliaalves.application;

import java.util.Scanner;

import br.com.fj.pooneliaalves.entities.Student;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados? ");
		int qtdRooms = sc.nextInt();
		
		Student[] register = new Student[9];
		
		for (int i = 0; i < qtdRooms; i++) {
			System.out.println("Aluguel #" + (i+1));
			
			sc.nextLine();
			System.out.print("Nome: ");
			String name = sc.nextLine();
			
			System.out.print("Email: ");
			String mail = sc.nextLine();
			
			System.out.print("Quarto: ");
			int room = sc.nextInt();
			
			register[room] = new Student(name, mail);
			
		}
		

		System.out.println("\nQuartos ocupados:");
		
		for (int i = 0; i < register.length; i++) {
			if(register[i] != null) {
				System.out.println(i + ": " + register[i].getName() + ", " + register[i].getEmail());
			}
		}
		
		sc.close();
		
	}

}