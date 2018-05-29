package Formularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToolBar;
import javax.swing.JSplitPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.LineBorder;

import Formularios.FormularioCadastro;

import javax.swing.JProgressBar;
import javax.swing.JToggleButton;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import java.awt.Toolkit;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPrincipal frame = new FormularioPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public FormularioPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\104952\\Downloads\\if_ic_settings_system_daydream_48px_352110.png"));
		setBackground(Color.RED);
		setTitle("Teste");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 308, 232);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setFont(new Font("Yu Gothic Light", Font.PLAIN, 16));
		btnEntrar.setBackground(SystemColor.activeCaption);
		btnEntrar.setBounds(50, 159, 100, 23);
		contentPane.add(btnEntrar);

		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.setFont(new Font("Yu Gothic Light", Font.PLAIN, 16));
		btnCadastrar.setBackground(SystemColor.activeCaption);
		btnCadastrar.setBounds(152, 159, 100, 23);
		contentPane.add(btnCadastrar);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\104952\\Downloads\\if_person_298840 (1).png"));
		lblNewLabel.setBounds(53, 29, 43, 55);
		contentPane.add(lblNewLabel);

		textField = new JTextField();
		textField.setBackground(SystemColor.window);
		textField.setBounds(118, 46, 133, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(118, 101, 133, 20);
		contentPane.add(passwordField);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\104952\\Downloads\\if_icons_password_1564520 (1).png"));
		lblNewLabel_1.setBounds(53, 84, 43, 55);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(
				"C:\\Users\\104952\\Downloads\\shutterstock_marutti_tecnologia_rede_conexao_icone-300x200.jpg"));
		lblNewLabel_2.setBounds(0, 0, 299, 200);
		contentPane.add(lblNewLabel_2);

		// Adicionar dados ao botão
		btnEntrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// Obter os dados
				String nomeProduto = "";
				double valorProduto = 0;
				int quantidadeProduto = 0;
				
				// Criar o novo formulário
				FormularioCadastro f = new FormularioCadastro(nomeProduto, valorProduto, quantidadeProduto);
				
			}
		});

		// Adicionar dados ao botão
		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				
				
			}
		});

	}
}
