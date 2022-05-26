package ProjetoClasses;

import java.util.ArrayList;
import java.util.List;

public class ConexaoFake {
	private static ConexaoFake instancia;
	private List<Ministrante> listaMinistrante;
	//constructor
	private ConexaoFake() {
		listaMinistrante = new ArrayList<Ministrante>();
	}
	
	public List<Ministrante> getListaMinistrante(){
		return listaMinistrante;
	}
	
	public static synchronized ConexaoFake getInstance() {
		if (instancia == null) {
			instancia = new ConexaoFake();
		}
		return instancia;
	}
}

