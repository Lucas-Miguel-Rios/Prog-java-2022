package br.com.senaisp.aula14.classes;

public class MamiferosEncapsulados {
	private String Pele;
	private String Olhos;
	private String Boca;
	private double Peso;
	public String getPele() {
		return Pele;
	}
	public void setPele(String pele) throws Exception {
		if (!pele.equalsIgnoreCase("branca") &&
			!pele.equalsIgnoreCase("morena") &&
			!pele.equalsIgnoreCase("pardo") &&
			!pele.equalsIgnoreCase("negro"))
			throw new Exception ("Valor inválido para a pele ");
		else		
		Pele = pele;
	}
	public String getOlhos() {
		return Olhos;
	}
	public void setOlhos(String olhos) throws Exception {
		if (!olhos.equalsIgnoreCase("castanho") &&
			!olhos.equalsIgnoreCase("preto") &&
			!olhos.equalsIgnoreCase("castanho") &&
			!olhos.equalsIgnoreCase("castanho"))
			//System.out.println("Valor Inválido para os olhos");
			throw new Exception ("Valor inválido para os olhos ");
		else
		Olhos = olhos;
	}
	public String getBoca() {
		return Boca;
	}
	public void setBoca(String boca) {
		Boca = boca;
	}
	public double getPeso() {
		return Peso;
	}
	public void setPeso(double peso) {
		Peso = peso;
	}

}
