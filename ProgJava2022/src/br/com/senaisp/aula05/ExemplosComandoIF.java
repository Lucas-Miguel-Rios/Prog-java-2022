package br.com.senaisp.aula05;

public class ExemplosComandoIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Criando condi��es.
		// Uso do condicional IF sem blocos
		int intidade = 100;
		if (intidade>=18 )
			System.out.println("Voc� � maior!");
		
		//Uso do condicional IF com bloco
		if (intidade>=60) {
			System.out.println("Voc� � adulto");
			System.out.println("Voc� � sexagen�rio");
		}
		
		//Uso do condicional IF sem blocos e do ELSE sem blocos
		if (intidade>=18 && intidade<=25) {
			System.out.println("Voc� � um maior jovem!");		
		
		} else {
			System.out.println("Voc� � menor ou maior de 25 anos!");
		}
		//Uso do condicional IF com bloco e do ELSE com bloco
		if (intidade>=18 && intidade <=25) {
			System.out.println("Voc� � um maior Joven!");
		} else { 
			System.out.println("Voc� � menor ou maior de 25 anos!");	
		}
		//Condicional IF e ELSE encadeado 
		if (intidade>=18 && intidade <=25) {
			System.out.println("Voc� tem idade entre 18 e 25!");
			 
		} else if (intidade>=26 && intidade <=35) {
			System.out.println("Voc� tem idade entre 26 e 35!");
		} else {
			System.out.println("Voc� tem idade menor que 18 ou maior que 35");
		
		}
		
	
	
	
	}
		
		

}
