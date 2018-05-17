import javax.swing.*;

public class Ex13{

	public static void main(String[] args){

	int numero;
	int suc; 
	int ant;

	numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro."));
	suc = numero+1;
	ant = numero-1;

	JOptionPane.showMessageDialog(null, "Número: "+numero+" \nSucessor: "+suc+" \nAntecessor: "+ant);

	}

}