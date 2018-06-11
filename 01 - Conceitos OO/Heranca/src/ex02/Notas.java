package ex02;

import javax.swing.JOptionPane;

public class Notas {
	
	//Atributos
	private int nota1, nota2, nota3;
	
	//Construtor
	public Notas(int nota1, int nota2, int nota3) {
		
		//Inicializar
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		
		//Mensagem
		JOptionPane.showMessageDialog(null, "Construtor Executado");
		
	}
	
	//Método para retornar a media
	protected double media() {
		
		//Cálculo
		double media = (nota1+nota2+nota3)/3;
		
		//Retorno
		return media;
		
	}

}
