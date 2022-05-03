import java.time.LocalDate;
import java.util.Scanner;

public class Aula08Exe04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Programa para uma clínica para dados cadastrais
		int intResp; // 1-sim, 2-n�o
		int intIdade, intAnoNascimento;
		String strNome, strEndereco;
		// Para os controles de menor e maior
		int intIdadeMenor = Integer.MAX_VALUE;
		int intIdadeMaior = Integer.MIN_VALUE;
		String strNomeMenor="", strNomeMaior="";
		String strEnderecoMenor="", strEnderecoMaior="";
		// Obtendo o ano atual
		int intAnoAtual = LocalDate.now().getYear();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Sistema de cadastramento de pacientes");
			System.out.println("Digite o nome do paciente:");
			strNome = sc.nextLine();
			System.out.println("Digite o endere�o do paciente:");
			strEndereco = sc.nextLine();
			/*
			 * Restringindo o usu�rio a digitar somente
			 * Valores entre o ano atual - 200 e o ano atual - 1
			 * Limitando assim a idade entre 1 e 199
			 * 
			 */
			do {
				System.out.println("Digite o ano de nascimento do paciente:");
				intAnoNascimento = sc.nextInt();
				if (intAnoNascimento <= intAnoAtual-200 || 
					intAnoNascimento >= intAnoAtual)
					System.out.println("Ano de Nascimento inv�lido!");
			} while (intAnoNascimento <= intAnoAtual - 200 || 
					 intAnoNascimento >= intAnoAtual);
			// In�cio da l�gica do programa
			//Calculando a idade
			intIdade = intAnoAtual - intAnoNascimento;
			//Testando as idades
			if (intIdade>intIdadeMaior) {
				intIdadeMaior = intIdade;
				strNomeMaior = strNome;
				strEnderecoMaior = strEndereco;
			}
			if (intIdade<intIdadeMenor) {
				intIdadeMenor = intIdade;
				strNomeMenor = strNome;
				strEnderecoMenor = strEndereco;
			}
			/*
			 * Restringindo o usu�rio a digitar somente 1 ou 2
			 * 
			 */
			do {
				System.out.println("Continuar? (1-Sim,2-N�o)");
				intResp = sc.nextInt();
				if (intResp!=1 && intResp!=2) 
					System.out.println("Valores permitidos s�o 1 ou 2!");
			} while (intResp!=1 && intResp!=2);
			/* 
			 * Quando utilizamos sc.nextInt(), sc.next(), sc.nextDouble()
			 * Qualquer sc sem o nextLine() e na sequ�ncia utilizamos
			 * o sc.nextLine() o enter ir� ser direcionado para ele
			 * perdendo assim a entrada do dado. 
			 * Experimente comentar a linha
			 * abaixo e na pergunta de continuar responda 1 para continuar
			 * voc� vai notar que o sc.nextLine() do nome ser� pulado
			 *  
			 */
			sc.nextLine();
		} while (intResp != 2);
		System.out.println("Menor idade: "+ intIdadeMenor);
		System.out.println("       Nome: "+ strNomeMenor);
		System.out.println("   Endere�o: "+ strEnderecoMenor);
		System.out.println("Maior idade: "+ intIdadeMaior);
		System.out.println("       Nome: "+ strNomeMaior);
		System.out.println("   Endere�o: "+ strEnderecoMaior);
		sc.close();
	}


	}


