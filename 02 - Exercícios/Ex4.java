import javax.swing.*;

public class Ex4{

	public static void main(String[] args){

		//Vari�veis
		String produto;
		int valor;
		
		//Obter Dados
		produto = JOptionPane.showInputDialog("Qual o seu produto?");
		
		//Op��es
		Object[] forma = {"� vista", "� prazo", "No Cheque"};

		//Combo
		Object escolha = JOptionPane.showInputDialog(null, "Escolha seu M�todo de pagamento", "T�tulo", JOptionPane.PLAIN_MESSAGE, null, forma,"");
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor inicial do produto?"));

		//Tirando Porcentagem
		if((escolha == "� vista") && (valor >=500)){
			System.out.println("O seu produto sair� por "+(valor-(valor*0.10)));}

				

	}

} 