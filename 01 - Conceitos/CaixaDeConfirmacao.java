import javax.swing.*;

public class CaixaDeConfirmacao{

	public static void main(String[] args){

		//Pergunta 1
		int resposta1 = JOptionPane.showConfirmDialog(null, "Esta gostando de Java?");

		//Resposta 
		JOptionPane.showMessageDialog(null, resposta1);

		//Pergunta 2
		int resposta2 = JOptionPane.showConfirmDialog(null, "Você aceita instalar o Baidu?", "Título", 2);

		//Pergunta 3
		int resposta3 = JOptionPane.showConfirmDialog(null, "Pergunta 3", "Título", 1);

	}

}