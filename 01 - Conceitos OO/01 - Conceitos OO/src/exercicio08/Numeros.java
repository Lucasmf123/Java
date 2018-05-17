package exercicio08;

import javax.swing.JOptionPane;

public class Numeros {

	int numero;
	boolean valida = false;
	
	//Obter Dados
	public void obterDados() {
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
		
	}
	
	//Laço
	public void laco() {
		
		do {
			
			obterDados();
			exibir();
			valida = true;
			
		} while (valida == false);
		
	}
	
	//Exibir Dados
	public void exibir() {
		
		String msg = "Número: "+numero+"\n\n";
			   msg+= "Sucessores:     |     Antecessores:\n\n";
			   msg+= (numero+1)+"     |     "+(numero-1)+"\n";
			   msg+= (numero+2)+"     |     "+(numero-2)+"\n";
			   msg+= (numero+3)+"     |     "+(numero-3)+"\n";
			   msg+= (numero+4)+"     |     "+(numero-4)+"\n";
			   msg+= (numero+5)+"     |     "+(numero-5)+"\n";
			   msg+= (numero+6)+"     |     "+(numero-6)+"\n";
			   msg+= (numero+7)+"     |     "+(numero-7)+"\n";
			   msg+= (numero+8)+"     |     "+(numero-8)+"\n";
			   msg+= (numero+9)+"     |     "+(numero-9)+"\n";
			   msg+= (numero+10)+"     |     "+(numero-10);
		
			   JOptionPane.showMessageDialog(null, msg);
			   
	}
	
}
