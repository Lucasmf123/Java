import javax.swing.*;

public class Ex11{

	public static void main(String[] args){
		
		//Variáveis
		int nota1;
		int nota2;
		int nota3;
		int nota4;
		double media;
		int faltas;

		//Obter Dados
		nota1 = Integer.parseInt(JOptionPane.showInputDialog("Primeira nota!"));
		nota2 = Integer.parseInt(JOptionPane.showInputDialog("Segunda nota!"));
		nota3 = Integer.parseInt(JOptionPane.showInputDialog("Terceira nota!"));
		nota4 = Integer.parseInt(JOptionPane.showInputDialog("Quarta nota!"));
		faltas = Integer.parseInt(JOptionPane.showInputDialog("Informe o número de faltas."));

		//Media
		media = (nota1+nota2+nota3+nota4)/4;

		//Calculos
		if(faltas >15)JOptionPane.showMessageDialog(null, "Reprovado.-> "+media);
		if(media <5)JOptionPane.showMessageDialog(null, "Reprovado.-> "+media);
		if((media >5.1) && (media <6.9))JOptionPane.showMessageDialog(null, "Em Exame.-> "+media);
		if((media >7) && (media <8.9))JOptionPane.showMessageDialog(null, "Bom.-> "+media);
		if((media >9) && (media <9.9))JOptionPane.showMessageDialog(null, "Ótimo!-> "+media);
		if(media ==10)JOptionPane.showMessageDialog(null, "Parabéns!!-> "+media);
		if(media >10)JOptionPane.showMessageDialog(null, "Alguma Nota foi digitada errada. Corrija para continuar.-> "+media); 

	}

}