package br.com.senaisp.aula24.classes;


import java.util.List;

public class Produto {
	private List<Produto> listaProduto;
	private int codigo;
	private String descricao;
	private double preco;

	public Produto() {

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public List<Produto> getListaProduto() {
		return listaProduto;
	}

	public void adicionar() {
		int intId = pesqProduto(this.codigo);
		if (intId == -1) {
			// Criar Objeto para Objeto Produto para adicionar as informações
			Produto prod = new Produto();
			// setando os dados para os novos objetos
			prod.setCodigo(codigo);
			prod.setDescricao(descricao);
			prod.setPreco(intId);
			// Colocando o objeto na lista
			listaProduto.add(prod);
		} else {
			System.out.println("Já existe esse Produto!");
		}

	}

	private int pesqProduto(int codigo2) {
		int intRet = -1;
		for (int intI = 0; intI < listaProduto.size(); intI++) {
			if (listaProduto.get(intI).getCodigo() == codigo2) {
				intRet = intI;
				break;
			}

		}

		return intRet;
	}

	public void alterar() {
		int intId = pesqProduto(codigo);
		if (intId > -1) {
			Produto prod = listaProduto.get(intId);
			prod.setDescricao(descricao);
			prod.setPreco(preco);
		} else {
			System.out.println("Produto não cadastrado");
		}

	}

	public void excluir() {
		int intId = pesqProduto(codigo);
		if (intId > -1) {
			listaProduto.remove(intId);
		} else {
			System.out.println("Produto não cadastrado!");
		}
	}

	public void consultar() {
		int intId = pesqProduto(codigo);
		if (intId > -1) {
			Produto prod = listaProduto.get(intId);
			descricao = prod.getDescricao();
			preco = prod.getPreco();
		}
	}

}
