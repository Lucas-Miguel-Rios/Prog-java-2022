package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solicitando um número e vendo se é divisível por 3 e por 5
		System.out.println("Identificando se o número é divisível por 3 e 5" );
		System.out.println("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int intnum = sc.nextInt();
		
		if (intnum % 3 == 0 && intnum % 5 == 0)
			System.out.println("O número é divisível por 3 e 5");
		else if (intnum % 3 == 0)
			System.out.println("O número digitado é divisível por 3");
		else if (intnum % 5 == 0)
			System.out.println("O número é divisível 5");
		else 
			System.out.println("O número digitado não é divisível por 3 ou 5");
		
		
		

	}

}
