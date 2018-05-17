import javax.swing.*;

public class Ex9{

	public static void main(String[] args){

		//Variáveis
		int primeiro;
		int segundo;
		int terceiro;

		//Obter dados
		primeiro = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
		segundo = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));
		terceiro = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número"));

		//Calcular o menor
		if((primeiro < segundo) && (primeiro < terceiro)){JOptionPane.showMessageDialog(null, "O número menor é "+primeiro);}
		if((segundo < primeiro) && (segundo < terceiro)){JOptionPane.showMessageDialog(null, "O número menor é "+segundo);}
		if((terceiro < segundo) && (terceiro < primeiro)){JOptionPane.showMessageDialog(null, "O número menor é "+terceiro);}

	}

}