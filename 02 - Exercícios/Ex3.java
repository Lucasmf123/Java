import javax.swing.*;

public class Ex3{

	public static void main(String[] args){

		//Vari�veis
		int nota1;
		int nota2;
		int nota3;
		int nota4;
		double media;

		//Informas notas
		nota1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a m�dia do 1� Bimestre"));
		nota2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a m�dia do 2� Bimestre"));
		nota3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a m�dia do 3� Bimestre"));
		nota4 = Integer.parseInt(JOptionPane.showInputDialog("Informe a m�dia do 4� Bimestre"));

		//Tirar m�dia
		media = (nota1+nota2+nota3+nota4)/4;
	
		JOptionPane.showMessageDialog(null, "Sua m�dia � "+media);	

		//Situa��o
		if(media >=7)JOptionPane.showMessageDialog(null, "Aprovado");	
		if((media >=5) && (media <=6.9))JOptionPane.showMessageDialog(null, "Em exame");
		if(media <=4.9)JOptionPane.showMessageDialog(null, "Reprovado");

	}

}