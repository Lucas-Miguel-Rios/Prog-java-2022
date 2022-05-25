package br.com.senaisp.aula13;

import java.util.Scanner;

public class Aula13Exe03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String strDados[][] = new String[10][2];
		int intOpc;
		//inicializando a matriz
		for (int intI=0;intI<10;intI++) { 
			strDados[intI][0] = ""; //nome
			strDados[intI][1] = "*";//controle
		}
		//
		do {
			//mostrando o menu de op�oes
			System.out.println("Menu de Op��es");
			System.out.println("1 - Cadastrar");
			System.out.println("2 - Consultar pelo Id");
			System.out.println("3 - Alterar pelo Id");
			System.out.println("4 - Excluir pelo Id");
			System.out.println("5 - Listar em ordem de Id");
			System.out.println("9 - Fim do programa");
			System.out.println("Escolha uma das op��es:");
			intOpc = sc.nextInt();
			//
			int intDisponivel;
			switch(intOpc) {
			case 1: 
				System.out.println("Cadastramento de Pessoas");
				intDisponivel=-1;
				for(int intI=0; intI<10;intI++) {
					if (strDados[intI][1].equals("*")) {
						intDisponivel = intI;
						break; //quebrando o la�o de repeti��o
					}
				}
				sc.nextLine(); //para evitar o enter do menu de op�oes;
				if (intDisponivel>-1) {
					System.out.println("Digite o nome a ser cadastrado:");
					strDados[intDisponivel][0] = sc.nextLine();
					strDados[intDisponivel][1] = ""; //n�o esquecer de tirar o *
					System.out.println("Castrado com sucesso! Seu id � " + intDisponivel);
				} else {
					System.out.println("Sem espa�o para cadastramento!");
				}
				System.out.println("Digite enter para voltar ao menu");
				sc.nextLine();
				break; //break do case
			case 5: //Listagem
				sc.nextLine();//para evitar o enter das op�oes;
				System.out.println("Listagem de cadastros");
				for (int intI=0;intI<10;intI++) {
					if (strDados[intI][1].equals("")) {
						System.out.println(intI + " - " + strDados[intI][0]);
					}
				}
				System.out.println("Digite enter para voltar ao menu");
				sc.nextLine();
				break;
			case 2: //consulta do cliente
				System.out.println("Consultar o Nome pelo Id");
				sc.nextLine(); //para pegar o enter do menu;
				System.out.println("Digite o ID do nome a ser buscado:");
				intDisponivel=sc.nextInt(); //digitar o id a ser buscado
				if (intDisponivel>=0 && intDisponivel<10 && 
					strDados[intDisponivel][1].equals("") ) {
					System.out.println("Nome encontrado!");
					System.out.println("Nome: " + strDados[intDisponivel][0]);
				} else {
					System.out.println("Nome n�o encontrado!");
				}
				sc.nextLine(); //para pegar o enter do id buscar
				System.out.println("Digite enter para voltar ao menu");
				sc.nextLine();
				break;
			case 3: //Altera��o
				System.out.println("Altera��o pelo Id");
				sc.nextLine(); //para pegar o enter do menu;
				System.out.println("Digite o ID do nome a ser buscado:");
				intDisponivel=sc.nextInt(); //digitar o id a ser buscado
				if (intDisponivel>=0 && intDisponivel<10 && 
					strDados[intDisponivel][1].equals("") ) {
					System.out.println("Nome encontrado!");
					System.out.println("Nome: " + strDados[intDisponivel][0]);
					//Processo de altera��o
					sc.nextLine(); //para pegar o enter do id buscar
					System.out.println("Digite o nome para substituir o atual:");
					strDados[intDisponivel][0]=sc.nextLine();
				} else {
					System.out.println("Nome n�o encontrado!");
				}
				System.out.println("Digite enter para voltar ao menu");
				sc.nextLine();
				break;
			case 4: //Exclus�o
				System.out.println("Exclus�o pelo Id");
				sc.nextLine(); //para pegar o enter do menu;
				System.out.println("Digite o ID do nome a ser deletado:");
				intDisponivel=sc.nextInt(); //digitar o id a ser buscado
				if (intDisponivel>=0 && intDisponivel<10 && 
					strDados[intDisponivel][1].equals("") ) {
					System.out.println("Nome encontrado!");
					System.out.println("Nome: " + strDados[intDisponivel][0]);
					//Processo de altera��o
					System.out.println("Confirma a exclus�o?(1-sim,2-n�o):");
					int intOpcExcl = sc.nextInt();
					if (intOpcExcl==1) {
						strDados[intDisponivel][1]="*";
					}
					sc.nextLine(); //para pegar o enter do id buscar
				} else {
					System.out.println("Nome n�o encontrado!");
				}
				System.out.println("Digite enter para voltar ao menu");
				sc.nextLine();
				break;

			}
			
		}while(intOpc!=9);

	}

}

