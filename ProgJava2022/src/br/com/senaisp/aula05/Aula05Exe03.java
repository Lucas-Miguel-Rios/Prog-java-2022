package br.com.senaisp.aula05;

import java.util.Scanner;

public class Aula05Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calculando o emprestimo
		System.out.println("Calculo de emprestimo de PM Bauru");
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do sal�rio bruto:");
		double dblsalario = sc.nextDouble();
		System.out.println("Digite o valor da parcela a se contratada:");
		double dblparcela = sc.nextDouble();
		//Verificando se � possivel a d�vida
		if (dblsalario * 30 / 100 >= dblparcela)
			System.out.println("Parabn�ns, seu empr�stimo foi aprovado!");
		else 
			System.out.println("Infelizmente seu emprestimo n�o foi aprovado! ");
		
		
		
		
		
		

	}

}
