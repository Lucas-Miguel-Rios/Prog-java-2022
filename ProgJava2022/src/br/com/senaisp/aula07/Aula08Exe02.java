package br.com.senaisp.aula07;

import java.util.Scanner;

public class Aula08Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intcontador = 0, intsoma = 0;
		int intnum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Programa m�dia de n�meros positivos");
		do {
		System.out.println("Digite um n�mero positivo" + "(negativo finaliza o programa)");
		intnum = sc.nextInt();
		if (intnum >= 0 ) {
			intcontador++;
			intsoma+=intnum;
		}
		
		
		} while (intnum >= 0);
		//temos que testa 
		if (intcontador >= 0)
			System.out.println("A m�dia de n�meros " + "positivos digitados foi de " + (intsoma/intcontador));
		sc.close();
				
		
		
		
		
		
		

	}

}
