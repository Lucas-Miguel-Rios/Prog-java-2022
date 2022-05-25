package br.com.senaisp.aula10;

import java.util.Locale;
import java.util.Scanner;

public class Aula10Exe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intResp = 1;
		// Scanner ir� colocar ponto decimal ao inv�s de v�rgula decimal
		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
		// While de continua��o
		while (intResp != 2) {
			System.out.println("Sistema de c�lculo de temperatura");
			System.out.println("1 - Celsius");
			System.out.println("2 - Fahrenheit");
			System.out.println("3 - Kelvin");
			int intTempOri = entradaTemperatura(sc);
			/*do {
				System.out.println("Temperatura Origem: (1 ou 2 ou 3)");
				intTempOri = sc.nextInt();
			} while (intTempOri != 1 && intTempOri != 2 && intTempOri != 3);
				*/
			int intTempDes;
			do {
				System.out.println("Temperatura Destino: (1 ou 2 ou 3)");
				intTempDes = sc.nextInt();
			} while (intTempDes != 1 && intTempDes != 2 && intTempDes != 3);
			
			System.out.println("Valor Temperatura a ser convertida:");
			double dblTemperatura = sc.nextDouble();

			double dblTempConv = dblTemperatura;
			// teste de convers�o
			if (intTempOri == 1) { // testando origem celsius
				if (intTempDes == 2) { // testando destino Fahrenheit
					dblTempConv = dblTemperatura * 9 / 5 + 32;
				} else if (intTempDes == 3) { // testando destino kelvin
					dblTempConv = dblTemperatura + 273;
				}
			} else if (intTempOri == 2) { // testando origem fahrenheit
				if (intTempDes == 1) { // testando destino Celsius
					dblTempConv = ( dblTemperatura - 32 ) * 5 / 9;
				} else if (intTempDes == 3) { // testando destino kelvin
					dblTempConv = ( dblTemperatura - 32 ) * 5 / 9 + 273;
				}
			} else { // Calculand origem Kelvin
				if (intTempDes == 1) { // testando destino Celsius
					dblTempConv = dblTemperatura - 273;
				} else if (intTempDes == 2) { // testando destino Fahenheit
					dblTempConv = ( dblTemperatura - 273 ) * 9 / 5 + 32;
				}
			}
			System.out.println("A temperatura calculada final � " + dblTempConv);
			System.out.println("Deseja calcular mais uma temperatura? (1-sim,2-n�o):");
			intResp = sc.nextInt();
		}
	}
	/**
	 * Função que dará entrada na temperatura e tratará os valores entre 1, 2 ou 3
	 * @param sc Deve ser passado o Scanner para entrada de dados 
	 * @return Retorna um valor inteiro entre 1 e 3
	 */
	public static int entradaTemperatura(Scanner sc) {
		int intTempOri;
		do {
			System.out.println("Temperatura Origem: (1 ou 2 ou 3)");
			intTempOri = sc.nextInt();
		} while (intTempOri != 1 && intTempOri != 2 && intTempOri != 3);
		return intTempOri;
	}
}
