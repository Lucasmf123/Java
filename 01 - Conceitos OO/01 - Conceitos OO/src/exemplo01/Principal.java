package exemplo01;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar um objeto (Criar)
		Pessoa p1 = new Pessoa();
		p1.altura = 1.78;
		p1.idade = 16;
		p1.nome = "Lucas";
		p1.peso = 60.2;
		p1.apresentacao();
		p1.exibirIMC();
		
		//Instanciar outro objeto
		Pessoa p2 = new Pessoa();
		p2.altura = 1.56;
		p2.idade = 16;
		p2.nome = "Nicolle";
		p2.peso = 49;
		p2.apresentacao();
		
	}

}
