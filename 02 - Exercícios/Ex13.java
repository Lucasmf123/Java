import javax.swing.*;

public class Ex13{

	public static void main(String[] args){

	int numero;
	int suc; 
	int ant;

	numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro."));
	suc = numero+1;
	ant = numero-1;

	JOptionPane.showMessageDialog(null, "N�mero: "+numero+" \nSucessor: "+suc+" \nAntecessor: "+ant);

	}

}