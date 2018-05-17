package exercicio01;

import javax.swing.JOptionPane;

public class Cadastro {

	String nome;
	int idade;
	String sexo;
	int masculino = 0, feminino = 0;
	int maiores = 0, menores = 0;
	int gerente = 0, atendente = 0, acougueiro = 0, secretaria = 0, almoxarife = 0, padeiro = 0, estagiario = 0;
	Object[] cargo = { "Gerente", "Atendente", "Açougueiro", "Secretária", "Almoxarife", "Padeiro", "Estagiário" };
	Object escolha;

	// Realizar perguntas
	public void perguntas() {

		nome = JOptionPane.showInputDialog("Informe o nome");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade"));
		sexo = JOptionPane.showInputDialog("Informe seu sexo");
		escolha = JOptionPane.showInputDialog(null, "Escolha seu cargo", "Cargos", JOptionPane.PLAIN_MESSAGE, null,
				cargo, "");
	}

	// Repetição
	public void laco() {

		// Continuar?
		int continuar = 0;

		do {
			perguntas();
			contabilizaridade();
			contabilizarsexo();
			contabilizarcargos();
			exibirDados();

			continuar = JOptionPane.showConfirmDialog(null, "Continuar?");
		} while (continuar == 0);
	}

	// Contabilizar Idade
	public void contabilizaridade() {

		if (idade < 18) {
			menores++;
		} else {
			maiores++;
		}

	}

	// Contabilizar Sexo
	public void contabilizarsexo() {

		if (sexo.equals("masculino")) {
			masculino++;
		} else {
			feminino++;
		}

	}

	// Contabilizar cargos
	public void contabilizarcargos() {

		if (escolha.equals("Gerente")) {
			gerente++;
		} else if (escolha.equals("Atendente")) {
			atendente++;
		} else if (escolha.equals("Açougueiro")) {
			acougueiro++;
		} else if (escolha.equals("Secretária")) {
			secretaria++;
		} else if (escolha.equals("Almoxarife")) {
			almoxarife++;
		} else if (escolha.equals("Padeiro")) {
			padeiro++;
		} else if (escolha.equals("Estagiário")) {
			estagiario++;
		}

	}

	// Exibir Dados
	public void exibirDados() {

		String msg = "Quantidades:\n\n Homens: " + masculino + ".\nMulheres: " + feminino
				+ ".\n\n********\nCargos:\nGerentes: " + gerente + ".\nAtendentes: " + atendente + ".\nAçougueiros: "
				+ acougueiro + ".\nSecretarios(as): " + secretaria + ".\nAlmoxarifes: " + almoxarife + ".\nPadeiros: "
				+ padeiro + ".\nEstagiários: " + estagiario + ".\n\n********\nIdades:\nMaiores de 18: " + maiores
				+ ".\nMenores de 18: " + menores + ".";
		
		JOptionPane.showMessageDialog(null, msg);

	}

}
