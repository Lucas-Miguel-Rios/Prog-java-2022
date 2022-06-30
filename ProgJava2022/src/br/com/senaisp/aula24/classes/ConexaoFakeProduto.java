package br.com.senaisp.aula24.classes;

import java.util.ArrayList;
import java.util.List;

public class ConexaoFakeProduto {
	private static ConexaoFakeProduto instancia;
	private List<Produto> listaProduto;

	private ConexaoFakeProduto() {
		listaProduto = new ArrayList<Produto>();
	}

	public List<Produto> getListaProduto() {
		return listaProduto;
	}

	public static synchronized ConexaoFakeProduto getInstance() {
		if (instancia == null) {
			instancia = new ConexaoFakeProduto();
		}
		return instancia;
	}

}
