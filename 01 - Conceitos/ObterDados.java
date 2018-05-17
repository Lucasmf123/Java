import javax.swing.*;

public class ObterDados{

	public static void main(String[] args){

		//Variável
		String nome;
		int idade;
		double media;

		//Obter o nome
		nome = JOptionPane.showInputDialog("Qual o seu nome?");

		//Obter o idade
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua Idade?"));
		
		//Obter a média
		media = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua média?"));
		
		//Mensagem contendo o nome digitado
		String texto = "Boa tarde "+nome;
			texto += "\nVocê tem "+idade+" anos.";
			texto += "\nE obteve média "+media;

		JOptionPane.showMessageDialog(null, texto);
				

	}

}