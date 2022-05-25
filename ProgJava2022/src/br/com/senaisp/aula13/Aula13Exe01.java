package br.com.senaisp.aula13;

import java.util.Scanner;

public class Aula13Exe01 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//programa de cadastramento de nomes
		String strnome[] = new String[10];
		Scanner sc = new Scanner(System.in);
		//Entrnado com os nomes dos clientes
		for (int intI = 0; intI<10; intI++) {
			System.out.println("Digite o nome das pessoas" + ( intI + 1) + ":");
			strnome[intI] = sc.nextLine();
		}
		//Ordenando so valores - BublleSort - Bolha
		String strApoio;
		for (int intI = 0; intI < 9; intI++) {
			for (int intf = intI; intf < 10; intf++) {
				//Ordenação Ascendente 
				if (strnome[intI].compareToIgnoreCase(strnome[intf])>0);
				strApoio = strnome[intI];
				strnome[intI] = strnome[intf];
				strnome[intf] = strApoio;
			}	
		}
			
			
			
		
		
		
		
		
		//mostrnando os nomes 
		System.out.println("Mostrando os nomes digitados!");
		for (int intI =0; intI < 10; intI++) {
			System.out.println(strnome[intI]);
			sc.close();
		}
		
		
		
		

	}

}
