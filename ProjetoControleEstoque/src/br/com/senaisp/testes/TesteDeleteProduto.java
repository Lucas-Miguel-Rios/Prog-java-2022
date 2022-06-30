package br.com.senaisp.testes;

import br.com.senaisp.classes.Produto;

public class TesteDeleteProduto {

	public static void main(String[] args) {
		Produto prod = new Produto();
		// Setando o id para pesquisar
		prod.setId(1);
		// pesquisando
		if (prod.read()) {
			// Agora podemos excluir
			System.out.println("Produto encontrado");
			
			// executando a exclusão
			if (prod.delete()) {
				System.out.println("Produto deletado com sucesso!");
			} else {
				System.out.println("Problema ao excluir");
				System.out.println("Erro: " + prod.getMsgErro());
			}
		}else {
			System.out.println("Produto não encontrado!");
		}

	}

}
