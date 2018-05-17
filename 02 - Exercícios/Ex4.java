import javax.swing.*;

public class Ex4{

	public static void main(String[] args){

		//Variáveis
		String produto;
		int valor;
		
		//Obter Dados
		produto = JOptionPane.showInputDialog("Qual o seu produto?");
		
		//Opções
		Object[] forma = {"Á vista", "Á prazo", "No Cheque"};

		//Combo
		Object escolha = JOptionPane.showInputDialog(null, "Escolha seu Método de pagamento", "Título", JOptionPane.PLAIN_MESSAGE, null, forma,"");
		
		valor = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor inicial do produto?"));

		//Tirando Porcentagem
		if((escolha == "Á vista") && (valor >=500)){
			System.out.println("O seu produto sairá por "+(valor-(valor*0.10)));}

				

	}

} 