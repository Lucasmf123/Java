package exercicio10;

import javax.swing.JOptionPane;

public class Votos {

	int voto;
	int voto1, voto2, voto3, voto4;
	int totalvotos;
	int maiorvoto = 0;
	String candidato = "";

	// Obter Dados
	public void obterDados() {

		voto = Integer.parseInt(JOptionPane.showInputDialog(
				"Candidato Lucas: 1\nCandidato Leonardo: 2\nCandidato Rocha: 3\nCandidato Fred: 4\n\nInforme o número de seu voto"));
		totalvotos++;
	}

	// Laço
	public void laco() {

		int continuar = 0;

		do {

			obterDados();
			contabilizarvotos();
			validar();
			candidatovencedor();			
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
			exibir(); 

		} while (continuar == 0);

	}

	// Contabilizar votos
	public void contabilizarvotos() {

		if (voto == 1) {
			voto1++;
		}
		if (voto == 2) {
			voto2++;
		}
		if (voto == 3) {
			voto3++;
		}
		if (voto == 4) {
			voto4++;
		}

	}

	// Validar votos
	public void validar() {

		if (voto1 > maiorvoto) {
			maiorvoto = voto1;
		}
		if (voto2 > maiorvoto) {
			maiorvoto = voto2;
		}
		if (voto3 > maiorvoto) {
			maiorvoto = voto3;
		}
		if (voto4 > maiorvoto) {
			maiorvoto = voto4;
		}

	}

	// Selecionar candidato com mais votos
	public void candidatovencedor() {

		if (maiorvoto == voto1) {
			candidato = "Lucas";
		}
		if (maiorvoto == voto2) {
			candidato = "Leonardo";
		}
		if (maiorvoto == voto3) {
			candidato = "Rocha";
		}
		if (maiorvoto == voto4) {
			candidato = "Fred";
		}

	}

	// Exibir Dados
	public void exibir() {
		
		String msg = "Candidato Eleito "+candidato+"\n\n";
			   msg+= "Quantidade de votos:\nLucas: "+voto1+"\nLeonardo: "+voto2+"\nRocha: "+voto3+"\nFred: "+voto4+"\n\nAs porcentagens foram de: "+(100/totalvotos)*voto1+" | "+(100/totalvotos)*voto2+" | "+(100/totalvotos)*voto3+" | "+(100/totalvotos)*voto4+ " Por cento.(%)";
			   
			   JOptionPane.showMessageDialog(null, msg);
		
	}

}
