package br.com.senaisp.aula09;

public class Aula09Exe06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Utilizando while ao inves de for
		int intlinha = 1;
		int intcoluna;
		while (intlinha < 10) {
			intcoluna = 1;
			while (intcoluna < 10) {
				System.out.print(intlinha + "-" + intcoluna + " ");
				intcoluna++;

			}
			System.out.println();
			intlinha++;
		}

	}

}
