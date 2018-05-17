import javax.swing.*;

public class Ex10{

	public static void main(String[] args){

		//Variáveis
		int moeda1;
		int moeda2;
		int moeda3;
		int moeda4;
		int moeda5;
		int moeda6;

		//Obter Dados
		moeda1 = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de moedas de R$ 0,01?"));
		moeda2 = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de moedas de R$ 0,05?"));
		moeda3 = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de moedas de R$ 0,10?"));
		moeda4 = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de moedas de R$ 0,25?"));
		moeda5 = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de moedas de R$ 0,50?"));
		moeda6 = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de moedas de R$ 1,00?"));

		//Cálculo das Quantidades
		String msg = "QUANTIDADE DE MOEDAS:\n";
		       msg+= "\nR$0,01: "+(moeda1*0.01);
		       msg+= "\nR$0,05: "+(moeda2*0.05);
		       msg+= "\nR$0,10: "+(moeda3*0.10);
		       msg+= "\nR$0,25: "+(moeda4*0.25);
		       msg+= "\nR$0,50: "+(moeda5*0.50);
		       msg+= "\nR$1,00: "+(moeda6*1.00);	

		JOptionPane.showMessageDialog(null, msg);


	}

}