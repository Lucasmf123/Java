//Importar classe
import javax.swing.*;

public class ExibirMensagem{

	public static void main(String[] args){

		//Mensagem Simples
		JOptionPane.showMessageDialog(null,"Hello World");

		//Mensagem de Apenas Texto
		JOptionPane.showMessageDialog(null,"Apenas Texto","Título",-1);

		//Mensagem de Erro
		JOptionPane.showMessageDialog(null,"Mensagem de Erro","Título",0);

		//Mensagem de Informação
		JOptionPane.showMessageDialog(null,"Informação","Título",1);

		//Mensagem de Alerta
		JOptionPane.showMessageDialog(null,"Alerta","Título",2);
		
		//Mensagem de Pergunta
		JOptionPane.showMessageDialog(null,"Pergunta","Título",3);



	}

}