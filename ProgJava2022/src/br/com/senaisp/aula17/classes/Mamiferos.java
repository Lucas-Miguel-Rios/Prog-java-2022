package br.com.senaisp.aula17.classes;

public class Mamiferos {
	private String nome;
	private int idade;
	private String corPelo;
	public void Falar() {
		System.out.println("Mamifero falando!");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	

	}

