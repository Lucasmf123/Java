package exercicio03;

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {

		// Matriz
		int[][] numeros = new int[2][3];

		// Variáveis
		String texto = null;
		
		for (int linha = 0; linha < 2; linha++) {

			for (int coluna = 0; coluna < 3; coluna++) {

				texto = "Linha " + (linha + 1) + "\nColuna " + (coluna + 1);

				numeros[linha][coluna] = Integer.parseInt(JOptionPane.showInputDialog("Informe números inteiros.\n" + texto));

			}

		}
		

		// Exibir

		for (int linha = 0; linha < 2; linha++) {

			for (int coluna = 0; coluna < 3; coluna++) {

				System.out.print(numeros[linha][coluna] + " ");

			}

			System.out.print("\n");
		}

		System.out.println("----------------------------------");

		for (int coluna = 0; coluna < 3; coluna++) {

			for (int linha = 0; linha < 2; linha++) {

				System.out.print(numeros[linha][coluna] + " ");

			}

			System.out.print("\n");
		}

	}

}
