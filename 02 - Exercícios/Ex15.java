import javax.swing.*;

public class Ex15{

	public static void main(String[] args){

		int dias;

		Object[] apes = {"Apartamento Simples", "Apartamento Duplo", "Su�te Presidencial"};

		Object escolha = JOptionPane.showInputDialog(null, "Escolha o tipo de apartamento.", "Apartamentos", JOptionPane.PLAIN_MESSAGE, null, apes,"");

		dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos dias voc� deseja ficar?"));

		if(escolha.equals("Apartamento Simples"))JOptionPane.showMessageDialog(null, "A hospedagem cust�ra: R$ "+dias*45);
		if(escolha.equals("Apartamento Duplo"))JOptionPane.showMessageDialog(null, "A hospedagem cust�ra: R$ "+dias*65);
		if(escolha.equals("Su�te Presidencial"))JOptionPane.showMessageDialog(null, "A hospedagem cust�ra: R$ "+dias*110);

	}

}