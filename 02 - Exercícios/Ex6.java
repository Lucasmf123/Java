import javax.swing.*;

public class Ex6{

	public static void main(String[] args){

		//Variáveis
		int numero1;
		int numero2;
		
		//Obter Dados
		numero1 = Integer.parseInt(
		JOptionPane.showInputDialog("Informe o primeiro número"));
		
		numero2 = Integer.parseInt(
		JOptionPane.showInputDialog("Informe o segundo número"));

		//Condicionais
		if(numero1 == numero2){System.out.println("O resultado será "+(numero1+numero2));
	}else{
		System.out.println("O resultado será "+(numero1*numero2));}

	}

}