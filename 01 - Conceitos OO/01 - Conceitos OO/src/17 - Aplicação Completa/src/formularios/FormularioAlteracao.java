package formularios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class FormularioAlteracao {

	public FormularioAlteracao() {
		
		JFrame formularioa = new JFrame();
		formularioa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formularioa.setSize(350, 500);
		formularioa.setLocationRelativeTo(null);
		formularioa.setTitle("Utilizando ");
		formularioa.setLayout(null);
		
		//JComboBox
				JComboBox<String> combo = new JComboBox<>();
				combo.setBounds(10, 10, 270, 30);
				combo.addItem("Cadastrar");
				combo.addItem("Alterar");
				combo.addItem("Excluir");
				
				//Adicionar ao JFrame
				formularioa.add(combo);
				
				//Ação no combo
				combo.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, combo.getSelectedItem());
						
					}
				});
				
				//Exibir os componentes
				formularioa.repaint();
				formularioa.setVisible(true);
		
	}

}
