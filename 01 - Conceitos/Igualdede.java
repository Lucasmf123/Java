import javax.swing.*;

public class Igualdade{

	public static void main(String[] args){

		//Variáveis
		String nome1, nome2;

		//Pedir os dois nomes
		nome1 = JOptionPane.showInputDialog("Informe o 1° nome");
		nome2 = JOptionPane.showInputDialog("Informe o 2° nome");

		//Condicional
		if(nome1 == nome2){
		JOptionPane.showMessageDialog(null, "Iguais");}else{JOptionPane.showMessageDialog(null, "Diferentes");}

	}

}