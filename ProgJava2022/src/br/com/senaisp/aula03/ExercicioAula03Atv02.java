package br.com.senaisp.aula03;

import java.util.Scanner;

public class ExercicioAula03Atv02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercicio de conver��o de graus C�lsius em graus Fahrenheit
		System.out.println("Escreva uma temperatura a ser convertida: ");
		Scanner sc = new Scanner(System.in);
		double doublevalor = sc.nextDouble();
		//posso calcular em uma vari�vel 
		//double dblefahrenheit = 9 * (doublevalor / 5) + 32;
		//System.out.println("O valor de graus C�lsiu convertido em Fahrenheit � de:" + dblefahrenheit);
		
		//posso calcular diretamente, exemplo
		System.out.println(" O valor de graus C�lsius voncertido em Fahrenheit � de:" + (9 * doublevalor / 5 + 32));
		
		

	}

}
