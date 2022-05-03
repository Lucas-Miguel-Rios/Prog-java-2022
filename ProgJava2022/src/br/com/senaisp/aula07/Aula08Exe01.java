package br.com.senaisp.aula07;

import java.util.Scanner;

public class Aula08Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intcontador = 0;
		int intnum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa contador de números positivos");
		do {
			System.out.println("Digite um número positivo: " + "Negativo finaliza o programa");
			intnum = sc.nextInt();
			if (intnum>=0) intcontador++;
					}
		while (intnum >= 0);
		System.out.println("A quantidade de números " + "positivos digitados foi de " + intcontador );
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
