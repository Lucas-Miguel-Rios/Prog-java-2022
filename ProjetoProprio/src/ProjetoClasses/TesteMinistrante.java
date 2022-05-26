package ProjetoClasses;

import ProjetoClasses.Ministrante; 


public class TesteMinistrante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ministrante minis = new Ministrante();
		
		for (int intI = 0; intI<15; intI++) {
			minis.setId(intI + 1);
			minis.setNome("Genérico " + (intI + 1));
			minis.setEndereco("Rua " + (intI + 1));
			minis.adicionar();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
