package exercicio04;

import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {

		// Variáveis
		Random numeroGerado = new Random();

		String[][] numeros = new String[5][15];

		for (int linha = 0; linha < 5; linha++) {

			for (int coluna = 0; coluna < 15; coluna++) {

				if ((linha == 2) && (coluna == 7)) {
					numeros[linha][coluna] = ""+numeroGerado.nextInt(10);
				} else if ((linha == 0) || (linha == 4) || (coluna == 0) || (coluna == 14)) {
					numeros[linha][coluna] = "*";
				} else {
					numeros[linha][coluna] = " ";
				}

			}

		}

		for (int l = 0; l < 5; l++) {

			for (int c = 0; c < 15; c++) {

				System.out.print(numeros[l][c] + " ");

			}

			System.out.println(" ");

		}

	}

}
