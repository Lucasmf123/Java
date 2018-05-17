package exercicio05;

import javax.net.ssl.HostnameVerifier;
import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {

		// Vetores
		String[][] dados = new String[20][6];

		int normal = 0;
		int obesidade1 = 0;
		int obesidade2 = 0;
		int obesidade3 = 0;
		int abaixo = 0;
		int mtabaixo = 0;
		int acimapeso = 0;
		String texto = "Matriz:\n";
		int continuar = 0;
		int indice = 0;
		double imc, peso, altura;
		int masculino = 0;
		int feminino = 0;
		int contador = 0;
		String situacao = "";
		int totalpessoas = 0;

		// Laço

		do {
			
			totalpessoas++;
			dados[indice][0] = JOptionPane.showInputDialog("Informe o Nome");
			dados[indice][1] = JOptionPane.showInputDialog("Informe o Sexo");

			if (dados[indice][1].equals("Masculino")) {
				masculino++;
			} else {
				feminino++;
			}

			dados[indice][2] = JOptionPane.showInputDialog("Informe a altura separando-a com : (.)");
			dados[indice][3] = JOptionPane.showInputDialog("Informe o peso separando-o com : (.)");
			peso = Double.parseDouble(dados[indice][3]);
			altura = Double.parseDouble(dados[indice][2]);
			imc = peso / (altura * altura);
			dados[indice][4] = "" + imc;

			if (imc < 17) {
				mtabaixo++;
				situacao = "Muito abaixo do peso.";
			} else if ((imc >= 17) && (imc < 18.49)) {
				abaixo++;
				situacao = "Abaixo do peso.";
			} else if ((imc >= 18.5) && (imc < 24.99)) {
				normal++;
				situacao = "Peso normal.";
			} else if ((imc >= 25) && (imc < 29.99)) {
				acimapeso++;
				situacao = "Acima do peso.";
			} else if ((imc >= 30) && (imc < 34.99)) {
				obesidade1++;
				situacao = "Obesidade I.";
			} else if ((imc >= 35) && (imc < 39.99)) {
				obesidade2++;
				situacao = "Obesidade II (severa).";
			} else if (imc > 40) {
				obesidade3++;
				situacao = "Obesidade III (mórbida).";
			}

			indice++;
			continuar = JOptionPane.showConfirmDialog(null, "Continuar?");

		} while (continuar == 0);

		// Exibir resultados
		for (int i = 0; i < 20; i++) {

			for (int i2 = 0; i2 < 6; i2++) {

				if (dados[i][i2] != null) {
					texto += dados[i][i2]+"\n ";                                                
					
				}

			}

		}

		JOptionPane.showMessageDialog(null, texto+"\nTeve "+(100/totalpessoas*masculino)+"% de homens.\nTeve "+(100/totalpessoas*feminino)+"% de mulheres.\nTeve "+mtabaixo+" muito abaixo do peso.\nTeve "+abaixo+" abaixo do pesso.\nTeve "+normal+" com o peso normal.\nTeve "+acimapeso+" acima do pesso.\nTeve "+obesidade1+" com obesidade 1.\nTeve "+obesidade2+" com obesidade 2 (severa).\nTeve "+obesidade3+" com obesidade 3 (mórbida)");


	}

}
