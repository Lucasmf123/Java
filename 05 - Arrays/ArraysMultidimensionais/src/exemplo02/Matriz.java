package exemplo02;

import javax.swing.JOptionPane;

public class Matriz {

	public static void main(String[] args) {
		
		//Vetores
		int[][] numeros = new int[5][5];
		
		//Texto
		String texto = "";
		
		//Laço
		for(int linha = 0; linha < 5; linha++){
			
			for(int coluna = 0; coluna < 5; coluna++){
				
				texto = "Linha "+(linha+1)+"\nColuna "+(coluna+1);

				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog(texto));
				
			}
					
		}

		//Exibir os 25 números
		texto = "Tabela\n";
		
		for(int linha = 0; linha < 5; linha++){
			
			for(int coluna = 0; coluna < 5; coluna++){
				
				texto += numeros[linha][coluna]+" ";
				
			}
			
			texto += "\n";
			
		}
		
		JOptionPane.showMessageDialog(null, texto);
		
	}

}