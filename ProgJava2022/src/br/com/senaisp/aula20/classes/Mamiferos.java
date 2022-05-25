package br.com.senaisp.aula20.classes;

public abstract class Mamiferos {
	private String corPele;
	private int Idade;
	
	public Mamiferos(String corPele, int idade) {
		this.corPele = corPele;
		this.Idade = idade;
	}
	
	
	public String getCorPele() {
		return corPele;
	}
	public void setCorPele(String corPele) {
		this.corPele = corPele;
	}
	public int getIdade() {
		return Idade;
	}
	public void setIdade(int idade) {
		Idade = idade;
	}
	
	

}
