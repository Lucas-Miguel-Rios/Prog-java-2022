package br.com.senaisp.aula10;
import java.util.Scanner;

public class Aula10Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa de n�meros primos
		int intres = 1, intcont, intprimo, inttermos, intpasso, intcontdiv; // 1-n�o/2-sim
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Digite a quantidade de termos primos desejadas:");
			inttermos = sc.nextInt();
			intcont = 1;
			intprimo = 0;
			while (intprimo <= inttermos) {
				intcontdiv = 0;
				for (intpasso = 1; intpasso <= intcont; intpasso++) {
					if (intcont % intpasso == 0) {
						intcontdiv++;
					}

				}
				if (intcontdiv <= 2) {
					System.out.print(intcont);
					intprimo++;
					if (intprimo < inttermos)
						System.out.print(",");

				}
				intcont++;
			}
			System.out.println(".");// pular a linha depois dos termos mostrados
			System.out.println("Deseja continuar? (1- sim, 2-n�o):");
			intres = sc.nextInt();

		} while (intres != 2);

		sc.close();

	}

}
