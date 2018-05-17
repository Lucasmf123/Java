import javax.swing.*;

public class CondicionalAninhada{

	public static void main(String[] args){

		//Variável
		double media;

		//Obter a média
		media = Double.parseDouble(JOptionPane.showInputDialog("Informe sua média"));

		//Condicional
		if(media == 10){JOptionPane.showMessageDialog(null, "Parabéns!");}
		else if(media >=9){JOptionPane.showMessageDialog(null, "Ótimo!");}
		else if(media >=8){JOptionPane.showMessageDialog(null, "Bom!");}
		else if(media >=7){JOptionPane.showMessageDialog(null, "Na Média!");}
		else if(media >=6){JOptionPane.showMessageDialog(null, "Exame!");}
		else{JOptionPane.showMessageDialog(null, "Reprovado!");}

	}

}