package exercicio01;

import java.util.Random;

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {

		// Matriz
		int[][] dados = new int[5][6];
		int par = 0;
		int impar = 0;
		int media = 0;
		int maiores = 0;
		String texto = "Matriz:\n\n";

		// Tirar par ou impar / media / maior ou menor que m�dia
		for (int linha = 0; linha < 5; linha++) {

			for (int coluna = 0; coluna < 6; coluna++) {

				dados[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe os n�meros"));

				if (dados[linha][coluna] % 2 == 0) {
					par++;
				} else {
					impar++;
				}
				media += dados[linha][coluna];

				
			}

		}
		
		media = media / 30;
		for(int linha = 0; linha < 5; linha++) {
			
			for(int coluna = 0; coluna < 6; coluna++) {
				if (dados[linha][coluna] >= media) {
					maiores++;		

				}
			}
			
			
		}
		

		// Exibir Matriz
		for (int linha = 0; linha < 5; linha++) {

			for (int coluna = 0; coluna < 6; coluna++) {

				texto += dados[linha][coluna] + " ";

			}

			texto += "\n";

		}

		JOptionPane.showMessageDialog(null, texto+"\nM�dia: "+media+"\nMaiores ou Iguais a m�dia: "+maiores+"\nQtd. Pares: "+par+"\nQntd. Impares: "+impar+"");
	}

}