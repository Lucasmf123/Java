import javax.swing.*;

public class ObterDados{

	public static void main(String[] args){

		//Vari�vel
		String nome;
		int idade;
		double media;

		//Obter o nome
		nome = JOptionPane.showInputDialog("Qual o seu nome?");

		//Obter o idade
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua Idade?"));
		
		//Obter a m�dia
		media = Double.parseDouble(JOptionPane.showInputDialog("Qual a sua m�dia?"));
		
		//Mensagem contendo o nome digitado
		String texto = "Boa tarde "+nome;
			texto += "\nVoc� tem "+idade+" anos.";
			texto += "\nE obteve m�dia "+media;

		JOptionPane.showMessageDialog(null, texto);
				

	}

}