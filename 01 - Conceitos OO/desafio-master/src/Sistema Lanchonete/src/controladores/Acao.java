package controladores;

public class Acao {

	//M�todo para cadastro
	public void cadastrar(String nomeProduto, double valorProduto) {
		
		//Criar objeto
		Lanches p = new Lanches();
		p.setNomeProduto(nomeProduto);
		p.setValorProduto(valorProduto);
		
		//Adicionar ao ArrayList
		Lanches.dados.add(p);
		
	}
}