package exercicio05;

import javax.swing.JOptionPane;

public class Produto {

	String produto;
	int produtosoma = 0;
	double valor;
	double x1, x2, x3, x4, x5, x6, x7, x8, x9, x10;

	// Obter Dados
	public void obterDados() {

		produto = JOptionPane.showInputDialog("Informe o nome do Produto.");
		valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Produto."));

	}

	// Calculos
	public void calculos() {

		x1 = valor - (valor * 0.05);
		x2 = valor - (valor * 0.10);
		x3 = valor - (valor * 0.15);
		x4 = valor - (valor * 0.20);
		x5 = valor - (valor * 0.25);
		x6 = valor - (valor * 0.30);
		x7 = valor - (valor * 0.35);
		x8 = valor - (valor * 0.40);
		x9 = valor - (valor * 0.45);
		x10 = valor - (valor * 0.50);

	}

	// Laço
	public void laco() {
		
		int continuar = 0;

		do {
			obterDados();
			continuar = JOptionPane.showConfirmDialog(null, "Continuar?");
			
		} while (continuar == 0);

		calculos();
		exibirDados();
		
	}

	// Exibir Dados
	public void exibirDados() {

		String msg = "Produto: " + produto;
		msg += "\nValor Inicial: " + valor;
		msg += "\n\nPreços com Descontos:\n";
		msg += "1 x R$" + x1 + " - "+x1*1;
		msg += "\n2 x R$" + x2 + " - "+x2*2;
		msg += "\n3 x R$" + x3 + " - "+x3*3;
		msg += "\n4 x R$" + x4 + " - "+x4*4;
		msg += "\n5 x R$" + x5 + " - "+x5*5;
		msg += "\n6 x R$" + x6 + " - "+x6*6;
		msg += "\n7 x R$" + x7 + " - "+x7*7;
		msg += "\n8 x R$" + x8 + " - "+x8*8;
		msg += "\n9 x R$" + x9 + " - "+x9*9;
		msg += "\n10 x R$" + x10 + " - "+x10*10;
		msg+= "\n\n";
		
		JOptionPane.showMessageDialog(null, msg);
	}

}
