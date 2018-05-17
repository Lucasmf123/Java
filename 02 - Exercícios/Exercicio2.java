import javax.swing.*;

public class Exercicio2{

	public static void main(String[] args){

		//Variáveis
		double valor;
		
		//Inserir valor do Produto
		valor = Double.parseDouble(JOptionPane.showInputDialog("Quanto você pagou no Produto?"));

		//Tirar Porcentagem
		System.out.println("O seu produto sairá por "+(valor-(valor*0.10)));

	}

}