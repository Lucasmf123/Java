import javax.swing.*;

public class Ex15{

	public static void main(String[] args){

		int dias;

		Object[] apes = {"Apartamento Simples", "Apartamento Duplo", "Suíte Presidencial"};

		Object escolha = JOptionPane.showInputDialog(null, "Escolha o tipo de apartamento.", "Apartamentos", JOptionPane.PLAIN_MESSAGE, null, apes,"");

		dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantos dias você deseja ficar?"));

		if(escolha.equals("Apartamento Simples"))JOptionPane.showMessageDialog(null, "A hospedagem custára: R$ "+dias*45);
		if(escolha.equals("Apartamento Duplo"))JOptionPane.showMessageDialog(null, "A hospedagem custára: R$ "+dias*65);
		if(escolha.equals("Suíte Presidencial"))JOptionPane.showMessageDialog(null, "A hospedagem custára: R$ "+dias*110);

	}

}