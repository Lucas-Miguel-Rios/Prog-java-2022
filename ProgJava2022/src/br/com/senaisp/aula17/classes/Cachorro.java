package br.com.senaisp.aula17.classes;

public class Cachorro extends Mamiferos {
	private String Raca;

	public String getRaca() {
		return Raca;
	}

	public void setRaca(String raca) {
		Raca = raca;
	}
	
	public void Falar() {
		super.Falar(); //Executando o falar da classe PAI
		System.out.println("Cachorro falando: " + "AU AU AU");
	}
	
	
	
	
}
