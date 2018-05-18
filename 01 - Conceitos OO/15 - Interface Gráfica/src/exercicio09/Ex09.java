package exercicio09;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex09 {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame("Obtendo Dados");
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 180);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);

		// JLabel nome
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe o primeiro!");
		rotulo.setBounds(10, 10, 150, 20);

		// JLabel idade
		JLabel rotulo1 = new JLabel();
		rotulo1.setText("Informe o segundo!");
		rotulo1.setBounds(10, 30, 160, 40);

		// JLabel cidade
		JLabel rotulo2 = new JLabel();
		rotulo2.setText("Informe o terceiro!");
		rotulo2.setBounds(10, 50, 170, 60);

		// JTextField nome
		JTextField campo = new JTextField();
		campo.setBounds(150, 10, 150, 20);

		// JTextField idade
		JTextField campo1 = new JTextField();
		campo1.setBounds(150, 40, 150, 20);

		// JTextField cidade
		JTextField campo2 = new JTextField();
		campo2.setBounds(150, 70, 150, 20);

		// JButton
		JButton botao = new JButton();
		botao.setBounds(170, 110, 150, 20);
		botao.setText("Obter Resultados");

		// Add ação ao botao
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if ((Double.parseDouble(campo.getText()) < Double.parseDouble(campo1.getText()))
						&& (Double.parseDouble(campo.getText()) < Double.parseDouble(campo2.getText()))) {
					JOptionPane.showMessageDialog(null, "O menor número é o " + Double.parseDouble(campo.getText()));
				} else if ((Double.parseDouble(campo1.getText()) < Double.parseDouble(campo.getText()))
						&& (Double.parseDouble(campo1.getText()) < Double.parseDouble(campo2.getText()))) {
					JOptionPane.showMessageDialog(null, "O menor número é o " + Double.parseDouble(campo1.getText()));
				} else if ((Double.parseDouble(campo2.getText()) < Double.parseDouble(campo.getText()))
						&& (Double.parseDouble(campo2.getText()) < Double.parseDouble(campo1.getText()))) {
					JOptionPane.showMessageDialog(null, "O menor número é o " + Double.parseDouble(campo2.getText()));
				}

				// Limpar o campo contendo nome
				campo.setText("");
				campo1.setText("");
				campo2.setText("");

				// Selecionar o campo nome
				campo.requestFocus();

			}
		});

		// Adicionando dados ao formulario
		formulario.add(rotulo);
		formulario.add(rotulo1);
		formulario.add(rotulo2);
		formulario.add(campo);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(botao);

	}

}
