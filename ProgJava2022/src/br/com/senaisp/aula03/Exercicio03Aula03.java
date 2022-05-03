package br.com.senaisp.aula03;

import java.util.Scanner;

public class Exercicio03Aula03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite um valor inteiro de até 3 dígitos:");
		Scanner sc = new Scanner(System.in);
		int intvalor = sc.nextInt();
		int intcentena = intvalor / 100;
		int intdezena = intvalor % 100 / 10;
		int intunidade =  intvalor % 10;
		int intValorInverTido = intunidade * 100 +
								intdezena * 10 +
								intcentena;
		System.out.println("Valor invertido é: " + intValorInverTido);
		

	}

}
