package exemplo02;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Aluno {

	// Atributos
	private String nome;
	private double nota1, nota2, media;

	// ArrayList
	ArrayList<Aluno> dados = new ArrayList<>();

	// M�todo para cadastrar no ArrayList
	private void cadastrar() {

		// Instanciar um objeto
		Aluno a = new Aluno();

		// Obter os dados do aluno
		a.nome = JOptionPane.showInputDialog("Nome");
		a.nota1 = Integer.parseInt(JOptionPane.showInputDialog("Nota 1"));
		a.nota2 = Integer.parseInt(JOptionPane.showInputDialog("Nota 2"));

		// Realizar a m�dia
		a.media = (a.nota1 + a.nota2) / 2;

		// Adicionar o aluno ao vetor
		dados.add(a);

		// Mensagem
		JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso");

	}

	// M�todo para listar os alunos cadastrados
	private void listar() {

		// Agrupar
		String agrupar = "Alunos cadastrados:\n\n";

		// La�o
		for (int i = 0; i < dados.size(); i++) {

			agrupar += "Nome: "+dados.get(i).nome + "\n";
			agrupar += "Media: "+dados.get(i).media + "\n\n";

		}

		// Exibir
		JOptionPane.showMessageDialog(null, agrupar);

	}

	// M�todo menu
	public void menu() {

		// menu
		String menu = "***MENU***\n\n";
		menu += "1 Cadastrar aluno\n";
		menu += "2 Listar aluno\n";
		menu += "3 Sair";

		// Obter op��o selecionada
		int opcao = 0;

		// La�o
		do {

			opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));

			switch (opcao) {
			case 1:
				cadastrar();
				break;

			case 2:
				listar();
				break;

			case 3:
				JOptionPane.showMessageDialog(null, "Tchau");
				break;
			}

		} while (opcao != 3);

	}

}
