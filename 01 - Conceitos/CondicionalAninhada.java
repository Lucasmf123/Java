import javax.swing.*;

public class CondicionalAninhada{

	public static void main(String[] args){

		//Vari�vel
		double media;

		//Obter a m�dia
		media = Double.parseDouble(JOptionPane.showInputDialog("Informe sua m�dia"));

		//Condicional
		if(media == 10){JOptionPane.showMessageDialog(null, "Parab�ns!");}
		else if(media >=9){JOptionPane.showMessageDialog(null, "�timo!");}
		else if(media >=8){JOptionPane.showMessageDialog(null, "Bom!");}
		else if(media >=7){JOptionPane.showMessageDialog(null, "Na M�dia!");}
		else if(media >=6){JOptionPane.showMessageDialog(null, "Exame!");}
		else{JOptionPane.showMessageDialog(null, "Reprovado!");}

	}

}