import javax.swing.*;

public class Ex6{

	public static void main(String[] args){

		//Vari�veis
		int numero1;
		int numero2;
		
		//Obter Dados
		numero1 = Integer.parseInt(
		JOptionPane.showInputDialog("Informe o primeiro n�mero"));
		
		numero2 = Integer.parseInt(
		JOptionPane.showInputDialog("Informe o segundo n�mero"));

		//Condicionais
		if(numero1 == numero2){System.out.println("O resultado ser� "+(numero1+numero2));
	}else{
		System.out.println("O resultado ser� "+(numero1*numero2));}

	}

}