package br.com.senaisp.aula07;

import java.util.Scanner;

public class Aula07Exe05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intresp = 1; //1-para sim/2-para não
		Scanner sc = new Scanner(System.in);
		while (intresp != 2) {
			System.out.println("Programa frequencia de fibonacci");
			System.out.println("Entre com o número do termo desejado: ");
		int inttermo = sc.nextInt();
		int intant1 = 0; 
		int intant2 = 1;
		int intapoio = 0;
		//imprimindo o 1 e 2 termo
		System.out.println(intant1 + " " + intant2 + " " );
		for (int intcont = 3; intcont <= inttermo; intcont++) {
			System.out.print((intant1 + intant2) + " " );
			intapoio = intant1;
			intant1 = intant2;
			intant2 = intapoio + intant2;
			
		}
		System.out.println(" Deseja continuar? (1-sim/2-não");
		intresp = sc.nextInt();
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
