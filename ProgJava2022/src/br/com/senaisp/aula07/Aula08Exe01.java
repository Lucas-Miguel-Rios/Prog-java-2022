package br.com.senaisp.aula07;

import java.util.Scanner;

public class Aula08Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intcontador = 0;
		int intnum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa contador de n�meros positivos");
		do {
			System.out.println("Digite um n�mero positivo: " + "Negativo finaliza o programa");
			intnum = sc.nextInt();
			if (intnum>=0) intcontador++;
					}
		while (intnum >= 0);
		System.out.println("A quantidade de n�meros " + "positivos digitados foi de " + intcontador );
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
