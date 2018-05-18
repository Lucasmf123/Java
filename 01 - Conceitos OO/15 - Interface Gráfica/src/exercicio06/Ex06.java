package exercicio06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex06 {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(450, 110);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);

		// JLabel
		JLabel pergunta1 = new JLabel();
		pergunta1.setBounds(10, 10, 150, 20);
		pergunta1.setText("Primeiro Número");

		// JLabel2
		JLabel pergunta2 = new JLabel();
		pergunta2.setBounds(10, 40, 150, 20);
		pergunta2.setText("Segundo Número");

		// Campo
		JTextField campo = new JTextField();
		campo.setBounds(150, 10, 150, 20);

		// Campo1
		JTextField campo1 = new JTextField();
		campo1.setBounds(150, 40, 150, 20);

		// Botão
		JButton botao = new JButton();
		botao.setBounds(310, 10, 100, 50);
		botao.setText("Continuar");

		// Adicionar ação ao botão
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (Double.parseDouble(campo.getText()) == (Double.parseDouble(campo1.getText()))) {
					JOptionPane.showMessageDialog(null,
							"A soma dos valores é de: "+(Double.parseDouble(campo.getText())+Double.parseDouble(campo1.getText())));
				}else {
					JOptionPane.showMessageDialog(null,
							"A multiplicação dos valores é de: "+(Double.parseDouble(campo.getText())*Double.parseDouble(campo1.getText())));
				}

				// Limpar
				campo.setText("");
				campo1.setText("");
				
				// Selecionar
				campo.requestFocus();
				
				formulario.dispose();

			}
		});

		// Add
		formulario.add(pergunta1);
		formulario.add(pergunta2);
		formulario.add(campo);
		formulario.add(campo1);
		formulario.add(botao);

		// Exibir
		formulario.setVisible(true);
		formulario.repaint();

	}

}
