package br.com.senaisp.aula13;

public class ExemploComparacaoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa para testar Strings
		String str1 = "Richard";
		String str2 = "richard";
		/* 
		 * Compara��o de igualdade de strings independetemente de
		 * mai�sculas ou min�sculas 
		 * 
		 * */
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("As 2 strings s�o iguais "+""
					+ "independentemente de mai�sculo e min�sculo");
		}
		/* Este teste diferencia mai�sculas de min�sculas */
		if (str1.equals(str2)) {
			System.out.println("As 2 strings s�o iguais "+""
					+ " testando mai�sculas e min�sculas");
		}
		/* Compara��o de maior ou menor em strings */
		
		/* Comparando se a str1 � maior que a str2 - 
		 * Diferencia mai�sculas de min�sculas */
		if (str1.compareTo(str2)>0) {
			System.out.println("A str1 � maior que a str2");
		}
		/* Comparando se a str1 � maior que a str2 independemente 
		 * de mai�sculas e min�sculas */
		if (str1.compareToIgnoreCase(str2)>0) {
			System.out.println("A str1 � maior que a str2");
		}
		/* Comparando se a str1 � menor que a str2 - 
		 * Diferencia mai�sculas de min�sculas */
		if (str1.compareTo(str2)<0) {
			System.out.println("A str1 � menor que a str2");
		}
		/* Comparando se a str1 � menor que a str2 independemente 
		 * de mai�sculas e min�sculas */
		if (str1.compareToIgnoreCase(str2)<0) {
			System.out.println("A str1 � menor que a str2");
		}
		
	}

}
