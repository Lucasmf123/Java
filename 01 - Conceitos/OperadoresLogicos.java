import javax.swing.*;

public class OperadoresLogicos{

	public static void main(String[] args){

		//Operadores L�gicos
		// E  = &&
		// OU = ||

		//Vari�veis
		int faltas;
		double media;

		//Obter os valores
		faltas = Integer.parseInt(JOptionPane.showInputDialog("Informe suas faltas"));

		media = Double.parseDouble(JOptionPane.showInputDialog("Informe sua m�dia"));

		//Condicional
		if((media >= 7) && (faltas <= 10)){JOptionPane.showMessageDialog(null, "Aprovado");}else{JOptionPane.showMessageDialog(null, "Reprovado");}

	}

}