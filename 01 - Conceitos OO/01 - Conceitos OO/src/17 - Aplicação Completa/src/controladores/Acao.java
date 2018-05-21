package controladores;

public class Acao {
	
	Produto p = new Produto();
	
		public void cadastro(String produto, int qtd, double val) {
		
			p.nome = produto;
			p.quantidade = qtd;
			p.valor = val;
			
			
			
	}
	
}