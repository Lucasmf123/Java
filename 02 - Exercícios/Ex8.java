import javax.swing.*;

public class Ex8{

	public static void main(String[] args){

		//Variáveis
		int numero1;
		int numero2;
		
		//Pergunta 1° numero
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Qual o primeiro valor?"));		
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Qual o segundo valor?"));

		//Obter Dados
		Object[] calculos = {"Somar", "Subtrair", "Multiplicar", "Dividir"};

		//Combo
		Object escolha = JOptionPane.showInputDialog(null, "Escolha a operação desejada", "Título", JOptionPane.PLAIN_MESSAGE, null, calculos,"");	

		if(escolha.equals("Somar")){JOptionPane.showMessageDialog(null, "O resultado é "+(numero1+numero2));}
		if(escolha.equals("Subtrair")){JOptionPane.showMessageDialog(null, "O resultado é "+(numero1-numero2));}
		if(escolha.equals("Multiplicar")){JOptionPane.showMessageDialog(null, "O resultado é "+(numero1*numero2));}
		if(escolha.equals("Dividir")){JOptionPane.showMessageDialog(null, "O resultado é "+(numero1/numero2));}		

	}

}