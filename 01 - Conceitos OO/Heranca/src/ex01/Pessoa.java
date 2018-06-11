package ex01;

public class Pessoa {

	//Atributos
	protected String nome;
	protected int idade;

	//Método para retornar maior de idade ou não
	protected String situacaoIdade() {
		
		//Condicional
		String situacao = idade >= 18 ? "Maior de idade" : "Menor de idade";
		
		//Retorno
		return situacao;
		
	}
	
}
