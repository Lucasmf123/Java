import javax.swing.*;

public class Ex9{

	public static void main(String[] args){

		//Vari�veis
		int primeiro;
		int segundo;
		int terceiro;

		//Obter dados
		primeiro = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro n�mero"));
		segundo = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo n�mero"));
		terceiro = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro n�mero"));

		//Calcular o menor
		if((primeiro < segundo) && (primeiro < terceiro)){JOptionPane.showMessageDialog(null, "O n�mero menor � "+primeiro);}
		if((segundo < primeiro) && (segundo < terceiro)){JOptionPane.showMessageDialog(null, "O n�mero menor � "+segundo);}
		if((terceiro < segundo) && (terceiro < primeiro)){JOptionPane.showMessageDialog(null, "O n�mero menor � "+terceiro);}

	}

}