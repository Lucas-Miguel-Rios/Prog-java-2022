package br.com.senaisp.aula06;

import java.util.Scanner;

public class Aula06Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//calculando o IMC da pessoa
		int intresposta = 1; //1-sim. 2-n�o
		Scanner sc = new Scanner(System.in);
		//come�ando os c�lculos 
		while (intresposta == 1) {
			System.out.println("Programa para calcualr o IMC");
			System.out.println("Informe a altura: ");
			double dblaltura = sc.nextDouble();
			System.out.println("Informe o peso: ");
			double dblpeso = sc.nextDouble();
			double dblimc = dblpeso / Math.pow(dblaltura, 2); // Ou posso fazer dblpeso / (dblaltura * dblaltura)
			System.out.println("O IMC � de: " + dblimc);
			if (dblimc < 20 ) {
				System.out.println("Abaixo do peso");
			}
			else if (dblimc >= 20 && dblimc <= 25) {
				System.out.println("Normal");
			}
			else if (dblimc > 25 && dblimc <= 30) {
				System.out.println("Excesso de peso");
			}
			else if (dblimc > 30 && dblimc <= 35) {
				System.out.println("Obesidade");
			}
			else { 
				System.out.println("Obesidade m�rbida");
			}
			System.out.println("Deseja continuar? (1-sim/2-n�o)");
			intresposta = sc.nextInt();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
