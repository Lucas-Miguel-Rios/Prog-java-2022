package br.com.senaisp.aula12;

public class Aula12Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strCinema[] [] = new String[10] [20];
		
		
		
		
		
		
		
		
		

	}
	public static void limpezaCinema(String[] [] strAss) {
		for (int intlin = 0; intlin<10; intlin++) {
			for (int intcol=0; intcol<20; intcol++) {
				strAss [intlin][intcol] = "-";
			}
		}
	}
public static void mostrarcinema (String [][]strass) {
	for (int intlin=0; intlin<10; intlin++) {
		System.out.println((intlin + 1 )+ " ");
		for (int intcol=0; intcol<20; intcol++){
			System.out.println(strass [intlin] [intcol] + " ");
		}
		System.out.println();
	}
}
}
