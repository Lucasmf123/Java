package formularios;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import classes.Login;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormularioLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioLogin frame = new FormularioLogin();
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
	
	//Objeto da classe Login
	Login l = new Login();
	
	public FormularioLogin() {
		
		//Especificações do formulário
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 760);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//Borda
		Border emptyBorder = BorderFactory.createEmptyBorder();
		
		//Campo usuário
		textField = new JTextField();
		textField.setBounds(221, 354, 395, 38);
		textField.setOpaque(false);
		textField.setBorder(emptyBorder);
		contentPane.add(textField);
		textField.setColumns(10);
		
		//Campo Senha
		passwordField = new JPasswordField();
		passwordField.setBounds(221, 440, 395, 38);
		passwordField.setOpaque(false);
		passwordField.setBorder(emptyBorder);
		contentPane.add(passwordField);
		
		// Botão
		JButton btnNewButton = new JButton("");
		btnNewButton.setBounds(271, 572, 257, 57);
		btnNewButton.setOpaque(false);
		btnNewButton.setBorder(emptyBorder);
		btnNewButton.setContentAreaFilled(false);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				//Obter o usuário e a senha
				String nomeUsuario = textField.getText();
				String senhaUsuario = String.valueOf(passwordField.getPassword());
				
				
				//Método para validar
				boolean valida = l.validarLogin(nomeUsuario, senhaUsuario);
				
				//Verificar se o usuário é válido ou não
				if(valida == true) {
					
					int nivel = l.retornarNivel();
					FormularioPrincipal fp = new FormularioPrincipal(nivel);
					fp.setVisible(true);
					dispose();
				}else {
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");
				}
				
			}
		});
		
		lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblNewLabel_1.setCursor(new Cursor(Cursor.HAND_CURSOR));
			}
		});
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ralf.lima\\Desktop\\Noturno\\Java - Fundamentos\\06 - OO\\21 - Trabalho Avaliativo\\src\\imagens\\btn_fechar.png"));
		lblNewLabel_1.setBounds(729, 0, 55, 57);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ralf.lima\\Desktop\\Noturno\\Java - Fundamentos\\06 - OO\\21 - Trabalho Avaliativo\\src\\imagens\\login.jpg"));
		lblNewLabel.setBounds(0, 0, 784, 761);
		contentPane.add(lblNewLabel);
	}
}
