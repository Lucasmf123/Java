//Importar classe
import javax.swing.*;

public class ExibirMensagem{

	public static void main(String[] args){

		//Mensagem Simples
		JOptionPane.showMessageDialog(null,"Hello World");

		//Mensagem de Apenas Texto
		JOptionPane.showMessageDialog(null,"Apenas Texto","T�tulo",-1);

		//Mensagem de Erro
		JOptionPane.showMessageDialog(null,"Mensagem de Erro","T�tulo",0);

		//Mensagem de Informa��o
		JOptionPane.showMessageDialog(null,"Informa��o","T�tulo",1);

		//Mensagem de Alerta
		JOptionPane.showMessageDialog(null,"Alerta","T�tulo",2);
		
		//Mensagem de Pergunta
		JOptionPane.showMessageDialog(null,"Pergunta","T�tulo",3);



	}

}