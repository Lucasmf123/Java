import javax.swing.*;

public class Exercicio1{
	
	public static void main(String[] args){

		//Vari�veis
		String nome;
		int idade;
		String cidade;

		//Obter Dados
		nome = JOptionPane.showInputDialog("Qual o seu nome?");

		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
		
		cidade = JOptionPane.showInputDialog("Qual a cidade onde voc� mora?");

		//Resultado
		String texto = "Ol� "+nome+".";
		       texto += "\nVoc� tem "+idade+" anos.";
		       texto += "\nE mora em "+cidade;

		JOptionPane.showMessageDialog(null, texto);	

	}

}