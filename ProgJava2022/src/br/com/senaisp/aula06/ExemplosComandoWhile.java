package br.com.senaisp.aula06;

public class ExemplosComandoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Exemplo utilizando While
		int intvalor = 10;
		//Mostrando os valores de 10 à 1 decescente
		//e Classificando em par ou impar
		while (intvalor > 0) {
			if (intvalor % 2 == 0)
				System.out.println("O valor " + intvalor + " é par.");
			else 
				System.out.println(" O valor " + intvalor + " é impar.");
			intvalor--;
			
		
		}
		
		
		
		
		

	}

}
