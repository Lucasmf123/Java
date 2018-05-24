package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controladores.Acao;

public class FormularioPrincipal {

	// Construtor
	public FormularioPrincipal() {

		// JFrame
		JFrame formulario = new JFrame("Formulário Principal");
		formulario.setSize(500, 350);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Componentes para realizar o cadastro
		JLabel lblNomeProduto = new JLabel("Nome do produto:");
		JLabel lblValorProduto = new JLabel("Valor do produto:");
		JTextField txtNomeProduto = new JTextField();
		JTextField txtValorProduto = new JTextField();
		JButton btnCadastrar = new JButton("Cadastrar");
		JButton btnNext = new JButton("Pedido");
		JButton btnHistorico = new JButton("Historico");
		JButton btnEstatisticas = new JButton("Estatísticas");
		JButton btnSair = new JButton("Sair");
		
		
		lblNomeProduto.setBounds(80, 10, 120, 20);
		lblValorProduto.setBounds(80, 40, 120, 20);
		txtNomeProduto.setBounds(220, 10, 200, 20);
		txtValorProduto.setBounds(220, 40, 200, 20);
		btnCadastrar.setBounds(100, 110, 100, 30);
		btnNext.setBounds(300, 110, 100, 30);
		btnHistorico.setBounds(100, 210, 100, 30);
		btnEstatisticas.setBounds(300, 210, 100, 30);
		btnSair.setBounds(200, 160, 100, 30);
		

		// Instanciar um objeto da classe Ação
		Acao a = new Acao();

		// Adicionar ação ao btnCadastro
		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {

				// Obter Dados
				String nomedoProduto = txtNomeProduto.getText();
				double valordoProduto = Double.parseDouble(txtValorProduto.getText());

				//Criar e chamar
				a.cadastrar(nomedoProduto, valordoProduto);
				
				// Limpar campos
				txtNomeProduto.setText("");
				txtValorProduto.setText("");

				// Cursor no campo nome
				txtNomeProduto.requestFocus();
				
			}
		});
		
		//Ação do btnNext
		btnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// Criar formulário
				FormularioRegistroPedido frp = new FormularioRegistroPedido();

				// Fechar o FormulárioPrincipal
				formulario.dispose();
				
			}
		});

		// Adicionar ao formulario
		formulario.add(lblNomeProduto);
		formulario.add(lblValorProduto);
		formulario.add(txtNomeProduto);
		formulario.add(txtValorProduto);
		formulario.add(btnCadastrar);
		formulario.add(btnNext);
		formulario.add(btnHistorico);
		formulario.add(btnEstatisticas);
		formulario.add(btnSair);

		// Exibir
		formulario.setVisible(true);
		formulario.repaint();
	}
}
