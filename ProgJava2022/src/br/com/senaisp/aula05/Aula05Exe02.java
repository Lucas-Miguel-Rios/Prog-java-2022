package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Solicitando um n�mero e vendo se � divis�vel por 3 e por 5
		System.out.println("Identificando se o n�mero � divis�vel por 3 e 5" );
		System.out.println("Digite um n�mero: ");
		Scanner sc = new Scanner(System.in);
		int intnum = sc.nextInt();
		
		if (intnum % 3 == 0 && intnum % 5 == 0)
			System.out.println("O n�mero � divis�vel por 3 e 5");
		else if (intnum % 3 == 0)
			System.out.println("O n�mero digitado � divis�vel por 3");
		else if (intnum % 5 == 0)
			System.out.println("O n�mero � divis�vel 5");
		else 
			System.out.println("O n�mero digitado n�o � divis�vel por 3 ou 5");
		
		
		

	}

}
