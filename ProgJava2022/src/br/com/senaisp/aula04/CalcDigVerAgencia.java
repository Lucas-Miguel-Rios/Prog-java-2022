package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalcDigVerAgencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculando o digito verificador");
		System.out.println("Entre com o número da agência (mas. 4 díg.):");
		Scanner sc = new Scanner(System.in);
		int intagencia = sc.nextInt();
		//Calculando o dígito
		int intun = intagencia % 10;
		int intdez = intagencia % 100 / 10;
		int intcentena = intagencia % 1000 / 100;
		int intml = intagencia / 1000;
		int intsoma = intun * 6 + intdez * 7 + intcentena * 8 + intml * 9;
		int intdig = 10 - intsoma % 10;
		System.out.println("O digito verificado é: " + intdig);
	}

}
