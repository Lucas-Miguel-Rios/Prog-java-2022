package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercício com IF e ELSE
		System.out.println("Identificando se o número é par ou impar");
		System.out.println("Digite um número: ");
		Scanner sc = new Scanner(System.in);
		int intnum = sc.nextInt();
		
		if (intnum % 2 == 0 ) {
			System.out.println("É par!");
		
		}else {
			System.out.println("É impar!");
		}
			
		
		
		
		

	}

}
