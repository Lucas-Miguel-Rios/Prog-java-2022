package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sistema de calculo de peso nos planetas");
		Scanner sc = new Scanner(System.in);
		System.out.println("Opções de planetas");
		System.out.println("1 - Mercúrio");
		System.out.println("2 - Vênus");
		System.out.println("3 - Marte");
		System.out.println("4 - Júpiter");
		System.out.println("5 - Saturno");
		System.out.println("6 - Urano");
		System.out.println("Entre com o planeta desejado:");
		int intplaneta = sc.nextInt();
		System.out.println("Entre com o peso na Terra:");
		double dblpesoterra = sc.nextDouble();
		double dblindice = 10.00;
		switch(intplaneta) {
		case 1: dblindice = 0.37; break;
		case 2: dblindice = 0.88; break;
		case 3: dblindice = 0.38; break;
		case 4: dblindice = 2.64; break;
		case 5: dblindice = 1.15; break;
		case 6: dblindice = 1.17; break;
		default: 
			System.out.println("Planeta inválido");
		}
		
		double dblpeso = dblpesoterra / 10 * dblindice;
			System.out.println("O peso no planeta selecionado é " + dblpeso);
		
		
		
		}
		

	}


