package ProjetoClasses;


import java.util.List;


public class Ministrante {
	private List<Ministrante> listaMinistrante;
	private String nome;
	private int id;
	private int telefone;
	private String endereco;
	private String email;
	private int diasdispo;
	
	public Ministrante() {
		super();
		ConexaoFake fake = ConexaoFake.getInstance();
		//listaClientes = new ArrayList<Cliente>();
		listaMinistrante = fake.getListaMinistrante();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDiasdisponiveis() {
		return diasdispo;
	}

	public void setDiasdispo(int diasdispo) {
		this.diasdispo = diasdispo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	private String getMinistranteSize() {
		// TODO Auto-generated method stub
		return null;
	}

	public void adicionar() {
		int intId = pesqMinistrante(this.id);
		if (intId == -1) {
			// Criando o objeto Ministrante para adicionar as informações
			Ministrante minis = new Ministrante();
			// Setando os dados para o novo objeto
			minis.setId(id);
			minis.setNome(nome);
			minis.setTelefone(telefone);
			minis.setEndereco(endereco);
			minis.setEmail(email);
			minis.setDiasdispo(diasdispo);
			// Colocando objeto na lista

		}
	}

	private int pesqMinistrante(int id2) {
		int intRet = -1;
		for (int intI = 0; intI < listaMinistrante.size(); intI++) {
			if (listaMinistrante.get(intI).getId() == id2) {
				intRet = intI;
				break;
			}
		}

		return intRet;

	}
	
	public void listarMinistrante() {
		System.out.println("Listagem de Ministrantes");
		System.out.println("# - Codigo - Nome");
		System.out.println("---------------------------");
		for(int intI=0;intI<listaMinistrante.size();intI++) {
			Ministrante minis = listaMinistrante.get(intI);
			System.out.print(intI + " - ");
			System.out.print(minis.getId() + " - ");
			System.out.print(minis.getNome() + " - ");
			System.out.println(minis.toString() + " - " + 
								minis.getMinistranteSize());
			
		}
	}
	

	public int getListaSize() {
		return listaMinistrante.size();
	}
	
	public void alterar() {
		int intId=pesqMinistrante(id);
		if (intId>-1) {
			Ministrante minis = listaMinistrante.get(intId);
			minis.setNome(nome);
			minis.setEndereco(endereco);
		} else {
			System.out.println("Ministrante Não cadastrado!");
		}
	}
	
	public void excluir() {
		int intId=pesqMinistrante(id);
		if (intId>-1) {
			listaMinistrante.remove(intId);
		} else {
			System.out.println("Cliente Não cadastrado!");
		}
	}
	
	public void consultar() {
		int intId=pesqMinistrante(id);
		if (intId>-1) {
			Ministrante minis = listaMinistrante.get(intId);
			nome = minis.getNome();
			endereco = minis.getEndereco();
		} else {
			System.out.println("Ministrante Não cadastrado!");
		}		
	}
	public void mostrarCliente() {
		System.out.println("Codigo...: " + id);
		System.out.println("Nome.....: " + nome);
		System.out.println("Endereço.: " + endereco);
	}
	
	
	
	
	
}