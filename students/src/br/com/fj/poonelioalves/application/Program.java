package br.com.fj.poonelioalves.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> it = new HashSet<>(); // Information Technology
		Set<Integer> ds = new HashSet<>(); // Data Science
		Set<Integer> se = new HashSet<>(); // Software Engineering
		
		System.out.print("Quantos alunos cursam TI? ");
		int qtt = sc.nextInt();
		
		for (int i = 0; i < qtt; i++) {
			Integer studentId = sc.nextInt();
			it.add(studentId);
		}
		
		System.out.print("Quantos alunos cursam DS? ");
		qtt = sc.nextInt();
		
		for (int i = 0; i < qtt; i++) {
			Integer studentId = sc.nextInt();
			ds.add(studentId);
		}
		
		System.out.print("Quantos alunos cursam SE? ");
		qtt = sc.nextInt();
		
		for (int i = 0; i < qtt; i++) {
			Integer studentId = sc.nextInt();
			se.add(studentId);
		}
		
		Set<Integer> totalStudents = new HashSet<>();
		
		totalStudents.addAll(it);
		totalStudents.addAll(ds);
		totalStudents.addAll(se);
		
		System.out.println("\nTotal de alunos com o Professor Alex: " + totalStudents.size());
		
		
		
		sc.close();
	}
	
	
}
