package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FormularioPrincipal {

	public FormularioPrincipal() {
		// Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(350, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Cadastros");
		formulario.setLayout(null);

		// JLabel
		JLabel pergunta1 = new JLabel();
		pergunta1.setBounds(10, 10, 150, 20);
		pergunta1.setText("Nome do Produto:");

		// JLabel2
		JLabel pergunta2 = new JLabel();
		pergunta2.setBounds(10, 40, 150, 20);
		pergunta2.setText("Valor do Produto:");

		// JLabel3
		JLabel pergunta3 = new JLabel();
		pergunta3.setBounds(10, 70, 150, 20);
		pergunta3.setText("Quantidade:");

		// Campo
		JTextField campo = new JTextField();
		campo.setBounds(150, 10, 150, 20);

		// Campo1
		JTextField campo1 = new JTextField();
		campo1.setBounds(150, 40, 150, 20);

		// Campo2
		JTextField campo2 = new JTextField();
		campo2.setBounds(150, 70, 150, 20);

		// Botao
		JButton botao = new JButton();
		botao.setBounds(20, 110, 100, 40);
		botao.setText("Cadastrar");

		// Botao2
		JButton botao2 = new JButton();
		botao2.setBounds(120, 110, 100, 40);
		botao2.setText("Excluir");

		// Botao3
		JButton botao3 = new JButton();
		botao3.setBounds(220, 110, 100, 40);
		botao3.setText("Alterar");

		// DefaultTableModel
		DefaultTableModel exibirDados = new DefaultTableModel();

		// Colunas
		exibirDados.addColumn("Produto");
		exibirDados.addColumn("Valor");
		exibirDados.addColumn("Quantidade");

		// JTable
		JTable tabela = new JTable(exibirDados);

		// Adicionar ação ao botão
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String produto;
				double val;
				int qtd;

				produto = campo.getText();
				val = Double.parseDouble(campo1.getText());
				qtd = Integer.parseInt(campo2.getText());

				exibirDados.addRow(new Object[] { produto, val, qtd });

				// Limpar
				campo.setText("");
				campo1.setText("");
				campo2.setText("");

				// Selecionar
				campo.requestFocus();

			}
		});

		// Adicionar ação ao botão2
		botao2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				DefaultTableModel dtm = (DefaultTableModel) tabela.getModel();
				if (tabela.getSelectedRow() >= 0) {
					dtm.removeRow(tabela.getSelectedRow());
					tabela.setModel(dtm);
				} else {
					JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
				}

			}
		});

		// Adicionar ação ao botão3
		botao3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				

			}
		});

		// JScrollPane
		JScrollPane barraRolagem = new JScrollPane(tabela);
		barraRolagem.setBounds(10, 175, 315, 250);

		// Adicionar componente ao JFrame
		formulario.add(pergunta1);
		formulario.add(pergunta2);
		formulario.add(pergunta3);
		formulario.add(campo);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(botao);
		formulario.add(barraRolagem);
		formulario.add(botao2);
		formulario.add(botao3);

		// Forçar Exibição
		formulario.repaint();
		formulario.setVisible(true);

	}

}
