package ex07_JRadioCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Principal {

	public static void main(String[] args) {

		// Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(230, 130);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);

		// JCheckBox
		JRadioButton rbtMasculino = new JRadioButton("Masculino");
		rbtMasculino.setBounds(10, 10, 100, 20);

		JRadioButton rbtFeminino = new JRadioButton("Feminino");
		rbtFeminino.setBounds(110, 10, 100, 20);

		// JButton
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(40, 50, 150, 20);

		// Ação
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if ((rbtMasculino.isSelected()) && (rbtFeminino.isSelected())) {
					JOptionPane.showMessageDialog(null, "Ambos estão selecionados");
				} else if (rbtMasculino.isSelected()) {
					JOptionPane.showMessageDialog(null, "Você é homem!");
				} else if (rbtFeminino.isSelected()) {
					JOptionPane.showMessageDialog(null, "Você é mulher!");
				} else {
					JOptionPane.showMessageDialog(null, "Não há nada selecionado");
				}

			}
		});

		// Adicionar componentes ao JFrame
		formulario.add(rbtMasculino);
		formulario.add(rbtFeminino);
		formulario.add(botao);

		// Exibir toda a estrutura
		formulario.setVisible(true);

	}

}