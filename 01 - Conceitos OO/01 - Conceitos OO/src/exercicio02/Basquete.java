package exercicio02;

import javax.swing.JOptionPane;

public class Basquete {

	String nome;
	int nomeqtd = 0;
	String nomemaiorjogador = "";
	double maiorjogador = 0;
	String nomemaisvelho = "";
	int maisvelho = 0;
	String nomemaispesado = "";
	double maispesado = 0;
	double altura, peso;
	int idade;
	int somaalturas = 0;

	// Obter Dados
	public void obterDados() {

		nome = JOptionPane.showInputDialog("Informe o nome do jogador:");
		nomeqtd++;
		altura = Double.parseDouble(JOptionPane.showInputDialog("Informe a altura:"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso:"));
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade:"));

	}

	// Continuar ou não
	public void laco() {

		do {
			obterDados();
			contabilizarmaior();
			contabilizarvelho();
			contabilizarpesado();
			calculoMediaaltura();
			exibirDados();

		} while (!nome.equals("SAIR"));

	}

	// Contabilizar maior jogador
	public void contabilizarmaior() {

		if (altura > maiorjogador) {
			maiorjogador = altura;
			nomemaiorjogador = nome;
		}

	}

	// Contabilizar mais velho
	public void contabilizarvelho() {

		if (idade > maisvelho) {
			maisvelho = idade;
			nomemaisvelho = nome;
		}
	}

	// Contabilizar mais pesado
	public void contabilizarpesado() {

		if (peso > maispesado) {
			maispesado = peso;
			nomemaispesado = nome;
		}
	}

	// Tirando média das alturas
	public double calculoMediaaltura() {

		somaalturas += altura;
		double media = (somaalturas) / nomeqtd;
		return media;
	}

	// Exibir Dados
	public void exibirDados() {
		
		String msg = "Quantidade de jogadores: "+nomeqtd;
			   msg+= "\nNome e altura do maior jogador: "+nomemaiorjogador+", "+maiorjogador;
			   msg+= "\nNome e idade do mais velho: "+nomemaisvelho+", "+maisvelho+" anos.";
			   msg+= "\nNome e peso do mais pesado: "+nomemaispesado+", "+maispesado+"kg.";
			   msg+= "\nMédia de alturas: "+calculoMediaaltura();
			   
			   JOptionPane.showMessageDialog(null, msg);
	}
	
}
