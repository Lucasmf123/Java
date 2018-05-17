package exercicio09;

import javax.swing.JOptionPane;

public class Anos {

	int ano;
	
	
	//Obter Dados
	public void obterDados() {
		
		ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano desejado"));
		
	}
	
	//Laço
	public void laco() {
		
		int continuar = 0;
		
		do {
		obterDados();
		
		continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		
		validarexibir();
		
	}while (continuar == 0);

}
	
	//Validar Ano e exibir
	public void validarexibir() {
		
		if(ano % 4 == 0) {
			JOptionPane.showMessageDialog(null, "Ano bissexto");
		}else {
			JOptionPane.showMessageDialog(null, "Ano normal");
		}
		
	}
	
	
	
}
