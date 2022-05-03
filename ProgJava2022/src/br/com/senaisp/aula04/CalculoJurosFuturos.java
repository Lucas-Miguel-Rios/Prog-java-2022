package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalculoJurosFuturos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calcular os Júros Fúturos 
		System.out.println("Calculo de aplicação futura");
		System.out.println("Informar o valor a ser aplicado");
		Scanner sc = new Scanner(System.in);
		double dblvaloraplicado = sc.nextDouble();
		System.out.println("Informar o tempo de aplicação: ");
		int inttempodeaplicacao = sc.nextInt();
		System.out.println("Informar a taxa de juros ao mês: ");
		double dbltaxadejuros = sc.nextDouble();
		double dblconta = dblvaloraplicado * Math.pow((1 + dbltaxadejuros/100), inttempodeaplicacao);
		System.out.println("O valor futuro da aplicação é de: " + dblconta);
		
		
	}

}
