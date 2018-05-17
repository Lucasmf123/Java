package ex06_JCheckBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

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
		
		//JCheckBox
		JCheckBox cbxMasculino = new JCheckBox("Masculino");
		cbxMasculino.setBounds(10, 10, 100, 20);
		
		JCheckBox cbxFeminino = new JCheckBox("Feminino");
		cbxFeminino.setBounds(110, 10, 100, 20);
		
		//JButton
		JButton botao = new JButton("Clique aqui");
		botao.setBounds(40, 50, 150, 20);
		
		//A��o
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if ((cbxMasculino.isSelected()) && (cbxFeminino.isSelected())){
					JOptionPane.showMessageDialog(null, "Ambos est�o selecionados");
				}else if(cbxMasculino.isSelected()){
					JOptionPane.showMessageDialog(null, "Voc� � homem!");	
				}else if(cbxFeminino.isSelected()){
					JOptionPane.showMessageDialog(null, "Voc� � mulher!");
				}else {
					JOptionPane.showMessageDialog(null, "N�o h� nada selecionado");
				}
				
			}
		});
		
		//Adicionar componentes ao JFrame
		formulario.add(cbxMasculino);
		formulario.add(cbxFeminino);
		formulario.add(botao);
		
		//Exibir toda a estrutura
		formulario.setVisible(true);

	}

}