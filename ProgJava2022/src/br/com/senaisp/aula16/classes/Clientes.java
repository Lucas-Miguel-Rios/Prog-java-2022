package br.com.senaisp.aula16.classes;

public class Clientes {
	private int Codigo;
	private String Nome;
	private String Endereco;
	
	public int getCodigo() {
		return Codigo;
	}
	/**
	 * Setter para C�digo. Dever� ser entre 1 e 100.
	 * @param codigo informa c�digo entre 1 a 100
	 * @throws ParametroInvalidoException Caso n�o seja informado codigo de 1 a 100 ocorrera erro. 
	 */
	
	public void setCodigo(int codigo) throws ParametroInvalidoException {
		if (codigo<=0 || codigo>100) {
			throw new ParametroInvalidoException("C�digo dever� ser entre 1 e 100");
		}
		
		
		Codigo = codigo;
	}
	public String getNome() {
		return Nome;
	}
	/**
	 * O Nome deve conter pelo menos 3 letras.
	 * @param nome Informar nome com pelo menos 3 letras
	 * @throws ParametroInvalidoException Caso seja informado um nome com menos de 3 letras, ocorrera um erro.
	 */
	
	
	
	public void setNome(String nome) throws ParametroInvalidoException {
		if (nome.length() <3) {
			throw new ParametroInvalidoException("Nome deve ter pelo menos 3 letras!");
			
		}
		Nome = nome;
	}
	public String getEndereco() {
		return Endereco;
	}
	/**
	 * Setter para codigo. dever� apresentar um Endere�o com pelo menos 3 letras
	 * @param endereco Informar Endere�o com 3 letras
	 * @throws ParametroInvalidoException Caso seja Informado um endere�o com menos de 3 letras, ocorr� um erro
	 */
	
	
	
	
	public void setEndereco(String endereco) throws ParametroInvalidoException {
		if (endereco.length()<3) {
			throw new ParametroInvalidoException("Endere�o deve ter pelo menos 3 letra");
		}
		Endereco = endereco;
	}
	
	
	
	
	
	

}
