package br.com.fj.pooneliaalves.application;

import java.util.Scanner;

import br.com.fj.pooneliaalves.entities.Studant;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Studant std = new Studant();
		
		System.out.print("Aluno: ");
		std.setName(sc.nextLine());
		
		System.out.println("Notas: ");
		
		double scoreFQuarter = sc.nextDouble();
		
		if(scoreFQuarter > 30 || scoreFQuarter < 0) {
			while(scoreFQuarter > 30 || scoreFQuarter < 0) {
			System.out.println("Digite uma nota válida: ");
			scoreFQuarter = sc.nextDouble();
			}
		}
		std.setScoreFQuarter(scoreFQuarter);
		
		double scoreSQuarter = sc.nextDouble();
		
		if(scoreSQuarter > 35 || scoreSQuarter < 0) {
			while(scoreSQuarter > 35 || scoreSQuarter < 0) {
			System.out.println("Digite uma nota válida: ");
			scoreSQuarter = sc.nextDouble();
			}
		}
		std.setScoreSQuarter(scoreSQuarter);
		
		double scoreTQuarter = sc.nextDouble();
		
		if(scoreTQuarter > 35 || scoreTQuarter < 0) {
			while(scoreTQuarter > 35 || scoreTQuarter < 0) {
			System.out.println("Digite uma nota válida: ");
			scoreTQuarter = sc.nextDouble();
			}
		}
		std.setScoreTQuarter(scoreTQuarter);
		
		
		System.out.println("Nota final: " + String.format("%.2f", std.finalScore()));
					
		if(std.finalScore() > 60) {
			System.out.println("Passou!!");
		} else {
			System.out.println("Reprovou, faltaram " + String.format("%.2f", std.missingPoints()) + " pontos.");
		}
		
		sc.close();
	}

}
