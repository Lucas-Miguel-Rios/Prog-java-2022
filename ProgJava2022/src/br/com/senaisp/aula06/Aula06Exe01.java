package br.com.senaisp.aula06;

import java.util.Scanner;

public class Aula06Exe01 {
static final double pi = 3.1415;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C�lculando o Raio e a Altura de um cilindro
		int intresp = 1; //1 - sim, 2 - n�o 
		Scanner sc = new Scanner(System.in);
		//Come�ando o la�o de repeti��o
		while (intresp != 2) {
			//Limpando a tela no termina/site (s� funciona no terminal)
			System.out.println("\033[h\033[2j");
			System.out.flush();
			//Fim da limpeza de tela.
			System.out.println("Programa de calculo de �rea de cilindro");
			System.out.println("Digite o raio do cil�ndro:");
			double dblraio = sc.nextDouble();
			System.out.println("Digite a altura do cil�ndro:");
			double dblaltura = sc.nextDouble();
			double dblarea = 2 * pi * dblraio * (dblraio + dblaltura);
			System.out.println("A �rea calculada � " + dblarea);
			System.out.println("Deseja continuar? (1-sim/2-n�o):);");
			intresp = sc.nextInt();
		}
		
		
		
		
		
		
		
		
		

	}

}
