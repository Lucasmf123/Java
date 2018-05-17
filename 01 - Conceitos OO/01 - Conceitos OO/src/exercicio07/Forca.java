package exercicio07;

import javax.swing.JOptionPane;

public class Forca {

	int erros = 0, acertos = 0;
	boolean continuar = true;
	String letra;
	boolean letraE = false, letraS = false, letraT = false, letraU = false, letraD = false, letraA = false,
			letraR = false;
	String estrutura = "";

	//Obter letras
	public void obterDados() {
		
		letra = JOptionPane.showInputDialog("Informe uma letra");
		
	}
	
	//Laço
	public void laco() {
		
		do {
			
			obterDados();
			
		} while ((acertos == 7) || (erros == 7));
		
	}
	
	
	
}
