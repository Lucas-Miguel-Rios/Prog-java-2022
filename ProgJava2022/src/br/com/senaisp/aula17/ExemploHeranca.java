package br.com.senaisp.aula17;

import br.com.senaisp.aula17.classes.Cachorro;
import br.com.senaisp.aula17.classes.Gato;
import br.com.senaisp.aula17.classes.Humano;
import br.com.senaisp.aula17.classes.Mamiferos;

public class ExemploHeranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mamiferos mam[] = new Mamiferos[4];
		
		//Criando Cachorro
		
		mam[0] = new Cachorro();
		mam[0].setCorPelo("Malhado");
		mam[0].setIdade(10);
		mam[0].setNome("Toto");
		//Cast
		((Cachorro) mam[0]).setRaca("SRD"); 
		
	
		
		//Criando Gato
		mam[1] = new Gato();
		mam[1].setCorPelo("Malhado");
		mam[1].setIdade(10);
		mam[1].setNome("Gatinho");
		//Cast
		((Gato) mam[1]).setRaca("SRD");
		((Gato) mam[1]).setPorte("Pequeno");
		

		
		//Criando Humano
		mam[2] = new Humano();
		mam[2].setCorPelo("Loiro");
		mam[2].setIdade(30);
		mam[2].setNome("Jordan");
		//Cast
		((Humano) mam[2]).setCorPele("Branca");
		

		
		//Mamifero Genérico
		mam[3] = new Mamiferos();
		mam[3].setCorPelo("Azul");
		mam[3].setIdade(45);
		mam[3].setNome("Avatar");
		
		

		for (int intI=0; intI<4; intI++) {
			System.out.println("Nome: " + mam[intI].getNome());
			System.out.println("Cor pelo: " + mam[intI].getCorPelo());
			System.out.println("Idade: " + mam[intI].getIdade());
			mam[intI].Falar();
			if (mam[intI] instanceof Humano) {
				System.out.println("Eu sou humano");
			}
			
			System.out.println("---------------------");
		}
		
	}

}
