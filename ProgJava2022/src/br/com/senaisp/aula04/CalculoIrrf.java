package br.com.senaisp.aula04;

import java.util.Scanner;

public class CalculoIrrf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Informar seu salário base:");
		Scanner sc = new Scanner(System.in);
		double dblsalario = sc.nextDouble();
		System.out.println("Informe o Número de dependentes: ");
		double dbldependentes = sc.nextDouble();
		double dblconta = dblsalario - dbldependentes * 189.59 - 828.38;
		System.out.println("O valor base do imposto é: " + dblconta);
		double dbsirrf = dblconta * 27.5 / 100 - 869.36;
		System.out.println("Resultado Irrf: " + dbsirrf);
		
		

	}

}
