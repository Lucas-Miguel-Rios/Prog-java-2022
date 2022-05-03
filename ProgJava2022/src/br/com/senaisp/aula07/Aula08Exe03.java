package br.com.senaisp.aula07;

import java.util.Scanner;

public class Aula08Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intmenor = Integer.MAX_VALUE;
		int intmaior = Integer.MIN_VALUE;
		int intnum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa menor e maior de números positivos");
		do {
			System.out.println("Digite um número positivo: " + "(negativo finaliza o programa)");
			intnum = sc.nextInt();
			if (intnum >= 0) {
				if (intnum > intmaior)
					intmaior = intnum;
				if (intnum < intmenor)
					intmenor = intnum;
			
			}
			
		
		
		
		} while (intnum >= 0);
		System.out.println("O menor é" + intmenor);
		System.out.println("O maior é " + intmaior);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
