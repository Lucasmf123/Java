import javax.swing.*;

public class Exercicio1{
	
	public static void main(String[] args){

		//Variáveis
		String nome;
		int idade;
		String cidade;

		//Obter Dados
		nome = JOptionPane.showInputDialog("Qual o seu nome?");

		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
		
		cidade = JOptionPane.showInputDialog("Qual a cidade onde você mora?");

		//Resultado
		String texto = "Olá "+nome+".";
		       texto += "\nVocê tem "+idade+" anos.";
		       texto += "\nE mora em "+cidade;

		JOptionPane.showMessageDialog(null, texto);	

	}

}