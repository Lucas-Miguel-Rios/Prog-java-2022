package br.com.senaisp.aula05;

import java.util.Scanner;

public class ExemploComandoSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Condicional switch
		System.out.println("Menu principal");
		System.out.println("1 - Calcular Soma");
		System.out.println("2 - Calcular Subtração");
		System.out.println("3 - Calcular Multiplicação");
		System.out.println("4 - Calcular Divisão");
		System.out.println("Digite sua opção:");
		Scanner sc = new Scanner(System.in);
		int intvlr1, intvlr2, intres;
		int intopcao = sc.nextInt();
		switch(intopcao) {
		case 1: 
			System.out.println("Digite o primeiro valor:");
			intvlr1 = sc.nextInt();
			System.out.println("Digite o segundo valor:");
			intvlr2 = sc.nextInt();
			intres= intvlr1 + intvlr2;
			System.out.println("O resultado será: " + intres);
			break;
		case 2: 
			System.out.println("Digite o primeiro valor:");
			intvlr1 = sc.nextInt();
			System.out.println("Digite o segundo valor: ");
			intvlr2 = sc.nextInt();
			intres = intvlr1 - intvlr2;
			System.out.println("O resultado será " + intres);
			break;
		
		
		
		}

	}

}
