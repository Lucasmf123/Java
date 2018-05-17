package exemplo01;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
	
		//Array Multidimensional - Matriz
		String[][] dados = new String[3][3];
		
		//Laço
		for(int indice = 0; indice < 3; indice++){
			
			//Nome 
			dados[indice][0] = JOptionPane.showInputDialog("Nome");
			
			//Idade
			dados[indice][1] = JOptionPane.showInputDialog("Idade");
			
			//Cidade
			dados[indice][2] = JOptionPane.showInputDialog("Cidade");
				
		}
	
		//Exibir Dados
		String exibir = "Dados informados:\n";
		exibir += "\nLinhas Totais: "+dados.length+"\n";
		exibir += "\nColunas Linha 1: "+dados[0].length+"\n";
		
		for(int indice = 0; indice < 3; indice++){
			
			exibir += "\nNome: "+dados[indice][0];
			exibir += "\nIdade: "+dados[indice][1];
			exibir += "\nCidade: "+dados[indice][2]+"\n";
			exibir += "\nB==========D";
					
		}
		
		JOptionPane.showMessageDialog(null, exibir);
		
	}
	

}