import javax.swing.*;

public class CondicionalSimples{

	public static void main(String[] args){

		//Vari�vel
		int idade;

		//Obter a idade
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));

		//Condicional
		if(idade >= 18){JOptionPane.showMessageDialog(null, "Pode tirar a CNH");}else{JOptionPane.showMessageDialog(null, "Continue a p�!");}

		if(idade >= 60){JOptionPane.showMessageDialog(null, "Chame um Uber");}	

	}

}