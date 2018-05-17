//Classe = Molde
package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	// Atributos (Características)
	String nome;
	int idade;
	double peso, altura;

	// Método de apresentação
	public void apresentacao() {
		JOptionPane.showMessageDialog(null, "Boa tarde! Meu nome é " + nome);
	}

	// Método para calcular o IMC
	public double calculoIMC() {

		double imc = peso / Math.pow(altura, 2);

		return imc;

	}

	// Método para retornar a condição do IMC
	public String condicaoIMC() {

		// Obter o valor do IMC
		double imc = calculoIMC();

		// Variável contendo a condição
		String condicao;

		// Condicional
		if (imc < 17) {
			condicao = "Muito abaixo do Peso";
		} else if (imc < 18.5) {
			condicao = "Abaixo do Peso";
		} else if (imc < 25) {
			condicao = "Peso Normal";
		} else if (imc < 30) {
			condicao = "Acima do Peso";
		} else if (imc < 35) {
			condicao = "Obesidade I";
		} else if (imc < 40) {
			condicao = "Obesidade II";
		} else {
			condicao = "Obesidade III";

		}
		// Retorno
		return condicao;
	}

	// Método para exibir o IMC
	public void exibirIMC() {

		String msg = "*****IMC*****\n";
		msg += "Seu imc é de: " + String.format("%.2f", calculoIMC()) + ".\n";
		msg += "Sua condição é " + condicaoIMC();

		JOptionPane.showMessageDialog(null, msg);
	}

}
