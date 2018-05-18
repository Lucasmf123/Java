package exercicio07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex07 {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 80);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);

		// JLabel
		JLabel numero = new JLabel();
		numero.setBounds(10, 10, 150, 20);
		numero.setText("Informe um número");

		// JTextField
		JTextField campo = new JTextField();
		campo.setBounds(150, 10, 150, 20);

		// JButton
		JButton botao = new JButton();
		botao.setBounds(350, 10, 100, 20);
		botao.setText("Continuar");

		// Adicionar ação ao botão
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, ("Os resultados são \n"+(Double.parseDouble(campo.getText())*0)+"\n"+(Double.parseDouble(campo.getText())*1)+"\n"+(Double.parseDouble(campo.getText())*2)+"\n"+(Double.parseDouble(campo.getText())*3)+"\n"+(Double.parseDouble(campo.getText())*4)+"\n"+(Double.parseDouble(campo.getText())*5)+"\n"+(Double.parseDouble(campo.getText())*6)+"\n"+(Double.parseDouble(campo.getText())*7)+"\n"+(Double.parseDouble(campo.getText())*8)+"\n"+(Double.parseDouble(campo.getText())*9)+"\n"+(Double.parseDouble(campo.getText())*10)));

				// Limpar
				campo.setText("");

				// Selecionar
				campo.requestFocus();

			}
		});

		// Add
		formulario.add(numero);
		formulario.add(campo);
		formulario.add(botao);

		// Exibir
		formulario.setVisible(true);
		formulario.repaint();

	}

}
