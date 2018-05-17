package exemplo01;

public class Pessoa {
	
	//Atributo da classe
	private static int contador = 0;
	
	//Construtor
	public Pessoa() {
		
		contador++;
		System.out.println(contador);
		
	}

}
