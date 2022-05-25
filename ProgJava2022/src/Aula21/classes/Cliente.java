package br.com.senaisp.aula21.classes;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private List<Cliente> listaClientes;
	private int codigo;
	private String nome;
	private String endereco;
	
	public Cliente() {
		super();
		listaClientes = new ArrayList<Cliente>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void adicionar() {
		int intId = pesqCliente(this.codigo);
		if (intId==-1) {
			Cliente cli = new Cliente();
			cli.setCodigo(codigo);
			cli.setNome(nome);
			cli.setEndereco(endereco);
			listaClientes.add(cli);
		} else {
			System.out.println("Já existe esse cliente!");
		}
	}

	private int pesqCliente(int codigo2) {
		int intRet = -1;
		for (int intI=0;intI<listaClientes.size();intI++) {
			if (listaClientes.get(intI).getCodigo()==codigo2) {
				intRet=intI;
				break;
			}
		}
		return intRet;
	}
	public void listarClientes () {
		System.out.println("Listagem de clientes");
		System.out.println("# - Codigo - Nome");
		System.out.println("-------------------------");
		for(int intI=0; intI<listaClientes.size(); intI++) {
				Cliente cli = listaClientes.get(intI);
				System.out.println(intI + "-");
				System.out.println(cli.getCodigo() + "-");
				System.out.println(cli.getNome() + "-");
				System.out.println(cli.toString());
		}
	}
}
