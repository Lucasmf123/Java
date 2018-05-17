package exercicio04;

import javax.swing.JOptionPane;

public class Filme {

	int excelente = 0;
	int otimo = 0;
	int bom = 0;
	int regular = 0;
	int ruim = 0;
	int idade = 0;
	int criancas = 0;
	int adolescentes = 0;
	int adultos = 0;
	int totalvotos = 0;
	Object[] opcoes = { "Excelente", "Ótimo", "Bom", "Regular", "Ruim", "SAIR" };
	Object escolha;

	// Obter Dados
	public void obterDados() {

		escolha = JOptionPane.showInputDialog(null, "Escolha uma opção", "", JOptionPane.PLAIN_MESSAGE, null, opcoes,
				"");
		totalvotos++;
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));
		
	}

	// Laço
	public void laco() {

		int continuar = 0;

		do {

			obterDados();

			continuar = JOptionPane.showConfirmDialog(null, "Continuar?");

		} while (continuar == 0);

		avaliacao();
		idades();
		exibirDados();

	}

	// Validar avaliações
	public void avaliacao() {

		if (escolha.equals("Excelente")) {
			excelente++;
		}
		if (escolha.equals("Ótimo")) {
			otimo++;
		}
		if (escolha.equals("Bom")) {
			bom++;
		}
		if (escolha.equals("Regular")) {
			regular++;
		}
		if (escolha.equals("Ruim")) {
			ruim++;
		}
	}

	// Validar idades
	public void idades() {
		boolean valida = false;

		do {

			if (idade <= 14) {
				criancas++;
			}
			if (idade <= 17) {
				adolescentes++;
			}
			if (idade >= 18) {
				adultos++;
			}
			if ((idade <= 0) || (idade >= 100)) {

				JOptionPane.showInputDialog("Informe uma idade válida!");

			}

		} while (valida == true);

	}

	// Exibir Dados
	public void exibirDados() {

		String msg = "Porcentagem de avaliações: \n";
		msg += "Excelente: " + (100 / totalvotos) * excelente + "%\n";
		msg += "Ótimo: " + (100 / totalvotos) * otimo + "%\n";
		msg += "Bom: " + (100 / totalvotos) * bom + "%\n";
		msg += "Regular: " + (100 / totalvotos) * regular + "%\n";
		msg += "Ruim: " + (100 / totalvotos) * ruim + "%\n";
		msg += "\n\nPorcentagem de idades:\n";
		msg += "Crianças: " + criancas +"\n";
		msg += "Adolescentes: " + adolescentes +"\n";
		msg += "Adultos: " + adultos +"\n";

		JOptionPane.showMessageDialog(null, msg);
	}

}
