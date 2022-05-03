package br.com.senaisp.aula10;

import java.util.Scanner;

public class Aula10Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sistema de supermercado
		//variaveis
		int intcodigo, intquantidadeitem;
		double dblprecouni;
		String strdescrição;
		//scanner 
		Scanner sc = new Scanner(System.in);
		do {
			//Entrad do codigo do produto 
		do {
			System.out.println("Sistema de controle de vendas");
			System.out.println("Digite o código do produto:  (0 - fim)");
			intcodigo = sc.nextInt();
		} while (intcodigo > 0);
		//so posso digitar o codigo do produto se ele for maior que zero
		if (intcodigo > 0) {
			sc.nextLine(); //para retirar o enter do comando anterior
		//entrada da descrição
			do {
				System.out.println("Digite a descrição do produto: ");
				strdescrição = sc.nextLine();
			
		}while(strdescrição.isEmpty() || strdescrição.length() < 3);
		
		//entrada da quantidade de itens
			do {
				System.out.println("Digite a quantidade de mercadorias: ");
				intquantidadeitem = sc.nextInt();
			}while (intquantidadeitem <= 0);
		//entrando com o preço unitário 
		
			do {
				System.out.println("Digite o preço unitário");
			}
		//comparar depois com o do professor, e continuar a programar.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}while (intcodigo == 0);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
