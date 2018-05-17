package ex05_JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		// Instanciar JFrame
		JFrame formulario = new JFrame();
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(300, 130);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Utilizando JFrame");
		formulario.setLayout(null);
		
		//JComboBox
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(10, 10, 270, 30);
		combo.addItem("Item 01");
		combo.addItem("Item 02");
		combo.addItem("Item 03");
		
		//Adicionar ao JFrame
		formulario.add(combo);
		
		//A��o no combo
		combo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, combo.getSelectedItem());
				
			}
		});
		
		//Exibir os componentes
		formulario.setVisible(true);
		
		

		
	}

}
