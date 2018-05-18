package exercicio08;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex08 {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 180);
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
		botao.setBounds(350, 10, 100, 50);
		botao.setText("Continuar");
		
		//JComboBox
				JComboBox<String> combo = new JComboBox<>();
				combo.setBounds(10, 75, 270, 30);
				combo.addItem("Somar");
				combo.addItem("Subtrair");
				combo.addItem("Multiplicar");
				combo.addItem("Dividir");

		// Adicionar ação ao botão
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

			
				  if(combo.getSelectedItem().equals("Somar")){JOptionPane.showMessageDialog(null,
				  "O resultado é "+(Double.parseDouble(campo.getText())+Double.parseDouble(campo1.getText())));}
				  if(combo.getSelectedItem().equals("Subtrair")){JOptionPane.showMessageDialog(null,
				  "O resultado é "+(Double.parseDouble(campo.getText())-Double.parseDouble(campo1.getText())));}
				  if(combo.getSelectedItem().equals("Multiplicar")){JOptionPane.showMessageDialog(null,
				  "O resultado é "+(Double.parseDouble(campo.getText())*Double.parseDouble(campo1.getText())));}
				  if(combo.getSelectedItem().equals("Dividir")){JOptionPane.showMessageDialog(null,
				  "O resultado é "+(Double.parseDouble(campo.getText())/Double.parseDouble(campo1.getText())));}
				 

				// Limpar
				campo.setText("");
				campo1.setText("");

				// Selecionar
				campo.requestFocus();

				formulario.dispose();
			}
		});

		// Adicionar ao formulario
		formulario.add(pergunta1);
		formulario.add(pergunta2);
		formulario.add(campo);
		formulario.add(campo1);
		formulario.add(botao);
		formulario.add(combo);

		// Exibir
		formulario.setVisible(true);
		formulario.repaint();
		

	}

}
