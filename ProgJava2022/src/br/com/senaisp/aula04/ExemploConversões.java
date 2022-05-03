package br.com.senaisp.aula04;

public class ExemploConvers�es {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Definindo uma vari�vel double com um valor qualquer
		double dblteste = 51.12;
		System.out.println("Double: " + dblteste);
		//Convertendo para float
		float fltteste = (float) dblteste;
		System.out.println("Float:" + fltteste);
		
		//Agora convertendo para long (inteiro)
		long lngteste = (long) fltteste;
		System.out.println("Long: " + lngteste);
		
		//Convertendo para int (inteiro)
		int intteste = (int) lngteste;
		System.out.println("int: " + intteste);
		
		
		//Convertendo para short (inteiro)
		short shtteste = (short) intteste;
		System.out.println("Short: " + shtteste);
		
		//Convertendo para byte (inteiro)
		byte bytteste = (byte) shtteste;
		System.out.println("Byte: " + bytteste);
		
		//CONVERTENDO N�MERO PARA TEXTO
		System.out.println("Vamos iniciar Convers�o de String para N�meros");
		String strvalor = "51";
		
		// Convertendo para Double
		dblteste = Double.parseDouble(strvalor);
		System.out.println("Double: " + dblteste);
		
		//Convertendo para Float
		fltteste = Float.parseFloat(strvalor);
		System.out.println("Float: " + fltteste);
		
		//Convertendo para long
		lngteste = Long.parseLong(strvalor);
		System.out.println("Long: " + lngteste);
		
		//Convertendo para INT
		intteste = Integer.parseInt(strvalor);
		System.out.println("Int: " + intteste);
		
		//Convertendo para short
		shtteste = Short.parseShort(strvalor);
		System.out.println("Short: " + shtteste);
		
		//Convertendo para Byte
		bytteste = Byte.parseByte(strvalor);
		System.out.println("Byte :" + bytteste);
		
		//Convertendo para String
		System.out.println("Agora vamos de n�meros para String/Caracter");
		intteste = 65; //tabela Ascii A = 65
		char chrteste = (char) intteste;
		System.out.println("Char: + chrteste");
		
		//Convertendo de Double para String
		dblteste = 52.12;
		String strteste = Double.toString(dblteste);
		System.out.println("Double para String: " + strteste);
		
		//Convertendo de Float para String
		fltteste = 52.12f; 
		strteste = Float.toString(fltteste);
		System.out.println("Float para String: " + fltteste);
		
		//Convertendo de Long para String
		lngteste = 523;
		strteste = Long.toString(lngteste);
		System.out.println("Long para string: " + strteste);
		
		//Convertendo de Inteiro para String
		intteste = 523;
		strteste = Integer.toString(intteste);
		System.out.println("Inteiro para String: " + strteste);
		
		//Convertendo de Short para String 
		shtteste = 523;
		strteste = Short.toString(shtteste);
		System.out.println("Short para String: " + strteste);
		
		//Convertendo de Byte para String
		bytteste = 52;
		strteste = Byte.toString(bytteste);
		System.out.println("Byte para String: " + strteste);
		
		//Vamos converter agora o inteiro para outras bases
		//Convertendo N�meros par outras bases 
		System.out.println("Convertendo n�meros para outras bases");
		intteste = 225;
		
		//Convertendo para Bin�rio (base2)
		strteste = Integer.toString(intteste, 2);
		System.out.println("O n�mero " + intteste + "em bin�rio � " + strteste);
		
		//Convertendo em hexadecimal 
		strteste = Integer.toString(intteste, 16);
		System.out.println("O n�mero " + intteste + "em hexadecimal �" + strteste);
		
		//Em Octal 
		strteste = Integer.toString(intteste, 8);
		System.out.println("O n�mero " + intteste + "em octal �" + strteste );
		
		//OPERA��O INVERSA, OU SEJA, DE OUTRAS BASES PARA A DECIMAL 
		//HEXADECIMAL PARA DECIMAL
		strteste = "ff";
		intteste = Integer.parseInt(strteste, 16);
		System.out.println("hexadecimal " + strteste + "na base 10: " + intteste);
		
		//Bin�rio para decimal
		strteste = "11111111";
		intteste = Integer.parseInt(strteste, 2);
		System.out.println("Bin�rio " + strteste + "na base 10:" + intteste);
		
		//Octal para decimal 
		strteste = "377";
		intteste= Integer.parseInt(strteste, 8);
		System.out.println("Octal "+ strteste + "na base 10: " + intteste);
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		

	}

}
