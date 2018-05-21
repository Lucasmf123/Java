package controladores;

import java.util.ArrayList;

public class Produto {

		String nome;
		double valor;
		int quantidade;
		
		static ArrayList<Produto> dados = new ArrayList<Produto>();
		
		public void setDados(Produto p) {
			dados.add(p);
		}
	
}
