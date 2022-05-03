package br.com.senaisp.aula09;

public class Aula09Exe02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int intlinha = 1; intlinha < 10; intlinha++) {
			for (int intcol = 1; intcol < 10; intcol++) {
				if (intlinha <= intcol) {
					System.out.print(intlinha + "-" + intcol + "  ");
				} else
					System.out.print("     ");

			}
			System.out.println();
		}

	}

}
