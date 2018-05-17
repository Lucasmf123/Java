package exercicio02;

import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {

		// Vetores
		int[][] dados = new int[5][5];
		String texto = "Matriz:\n";
		int soma1 = 0;
		int soma2 = 0;
		int somadp = 0;
		int somads = 0;
		int somam = 0;

		// Tirar Dados
		for (int linha = 0; linha < 5; linha++) {

			for (int coluna = 0; coluna < 5; coluna++) {

				texto = "Total de Linhas: " + (linha + 1) + "\nTotal de Colunas: " + (coluna + 1) + "\n";

				dados[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe os números"));

				if (linha == 3) {
					soma1 = dados[linha][coluna];
				}

				if (linha == 5) {
					soma2 = dados[linha][coluna];
				}

				if (linha == coluna) {
					somadp += dados[linha][coluna];
				}

				if (linha + coluna == 4) {
					somads += dados[linha][coluna];
				}
			}

		}

		// Exibir Matriz
		for (int linha = 0; linha < 5; linha++) {

			for (int coluna = 0; coluna < 5; coluna++) {

				texto += dados[linha][coluna] + " ";

			}

			texto += "\n";

		}

		JOptionPane.showMessageDialog(null,
				texto + "\n\nSoma quarta linha: " + soma1 + "\nSoma segunda coluna: " + soma2
						+ "\nSoma diagonal principal: " + somadp + "\nSoma diagonal secundária: " + somads
						+ "\nSoma de tudo: " + somam);

	}

}
