package br.com.senaisp.aula03;

import java.util.Scanner;

public class ExercicioAula03Atv02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exercicio de converção de graus Célsius em graus Fahrenheit
		System.out.println("Escreva uma temperatura a ser convertida: ");
		Scanner sc = new Scanner(System.in);
		double doublevalor = sc.nextDouble();
		//posso calcular em uma variável 
		//double dblefahrenheit = 9 * (doublevalor / 5) + 32;
		//System.out.println("O valor de graus Célsiu convertido em Fahrenheit é de:" + dblefahrenheit);
		
		//posso calcular diretamente, exemplo
		System.out.println(" O valor de graus Célsius voncertido em Fahrenheit é de:" + (9 * doublevalor / 5 + 32));
		
		

	}

}
