import javax.swing.*;

public class Exercicio2{

	public static void main(String[] args){

		//Vari�veis
		double valor;
		
		//Inserir valor do Produto
		valor = Double.parseDouble(JOptionPane.showInputDialog("Quanto voc� pagou no Produto?"));

		//Tirar Porcentagem
		System.out.println("O seu produto sair� por "+(valor-(valor*0.10)));

	}

}