import javax.swing.*;

public class OperadoresLogicos{

	public static void main(String[] args){

		//Operadores Lógicos
		// E  = &&
		// OU = ||

		//Variáveis
		int faltas;
		double media;

		//Obter os valores
		faltas = Integer.parseInt(JOptionPane.showInputDialog("Informe suas faltas"));

		media = Double.parseDouble(JOptionPane.showInputDialog("Informe sua média"));

		//Condicional
		if((media >= 7) && (faltas <= 10)){JOptionPane.showMessageDialog(null, "Aprovado");}else{JOptionPane.showMessageDialog(null, "Reprovado");}

	}

}