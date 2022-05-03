package br.com.senaisp.aula06;

import java.util.Scanner;

public class Aula06Exe01 {
static final double pi = 3.1415;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cálculando o Raio e a Altura de um cilindro
		int intresp = 1; //1 - sim, 2 - não 
		Scanner sc = new Scanner(System.in);
		//Começando o laço de repetição
		while (intresp != 2) {
			//Limpando a tela no termina/site (só funciona no terminal)
			System.out.println("\033[h\033[2j");
			System.out.flush();
			//Fim da limpeza de tela.
			System.out.println("Programa de calculo de área de cilindro");
			System.out.println("Digite o raio do cilíndro:");
			double dblraio = sc.nextDouble();
			System.out.println("Digite a altura do cilíndro:");
			double dblaltura = sc.nextDouble();
			double dblarea = 2 * pi * dblraio * (dblraio + dblaltura);
			System.out.println("A área calculada é " + dblarea);
			System.out.println("Deseja continuar? (1-sim/2-não):);");
			intresp = sc.nextInt();
		}
		
		
		
		
		
		
		
		
		

	}

}
