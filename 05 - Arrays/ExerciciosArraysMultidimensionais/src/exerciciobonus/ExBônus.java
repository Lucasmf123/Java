package exerciciobonus;

import java.util.Random;

import javax.swing.JOptionPane;

public class ExB�nus {

	public static void main(String[] args) {

		// Vetores
		int[] numero = new int[5];
		int pegarNumero = 0;
		Random r = new Random();
		String texto = "";

		// Adicionar dados ao vetor
		for (int i = 0; i < 5; i++) {

			pegarNumero = r.nextInt(21);

			if (i != 0) {
				for (int i2 = 0; i2 < i; i2++) {
					if (pegarNumero == numero[i2]) {
						i2 = i;
						i--;

					} else if (i2 == i - 1) {
						numero[i] = pegarNumero;
					}
				}

			} else {
				numero[i] = pegarNumero;
			}

		}

		for (int i3 : numero) {
			texto += i3 + "\n";
		}
		JOptionPane.showMessageDialog(null, texto);
	}
}