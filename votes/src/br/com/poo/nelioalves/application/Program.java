package br.com.poo.nelioalves.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o nome do pacote inteiro: ");
		String path = sc.nextLine();
		
		Map<String, Integer> votes = new LinkedHashMap<>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] vect = line.split(",");
				String name = vect[0];
				Integer vote = Integer.parseInt(vect[1]);
				
				if(votes.containsKey(name)) {
					Integer votesSoFar = votes.get(name);
					votes.put(name, vote + votesSoFar);
				} else {
					votes.put(name, vote);
				}
				
				line = br.readLine();
			}
			
			for(String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		sc.close();
		
	}
}
