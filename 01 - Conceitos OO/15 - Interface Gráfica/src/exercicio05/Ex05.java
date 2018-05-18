package exercicio05;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex05 {

	public static void main(String[] args) {
		
		//JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(300, 100);	
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
				
		//JLabel
		JLabel pergunta = new JLabel();
		pergunta.setBounds(80, 10, 150, 20);		
		pergunta.setText("Informe o dia desejado");
		
		//JTextField
		JTextField campo = new JTextField();
		campo.setBounds(90, 35, 35, 20);
		
		//JButton
		JButton botao = new JButton();
		botao.setBounds(150, 35, 60, 20);
		botao.setText("Next");
		
		//Ação
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				

				if((Integer.parseInt(campo.getText()) ==3) || (Integer.parseInt(campo.getText()) ==4) || (Integer.parseInt(campo.getText()) ==10) || (Integer.parseInt(campo.getText()) ==11) || (Integer.parseInt(campo.getText()) ==17) || (Integer.parseInt(campo.getText()) ==18) || (Integer.parseInt(campo.getText()) ==24) || (Integer.parseInt(campo.getText()) ==25)){JOptionPane.showMessageDialog(null, "Fim de Semana");
		}else if(
				(Integer.parseInt(campo.getText()) <1) || (Integer.parseInt(campo.getText()) >28)){JOptionPane.showMessageDialog(null, "Data Inválida.");
		}else{
				JOptionPane.showMessageDialog(null, "Dia de Semana");}
			
				//Limpar
				campo.setText("");
				
				//Selecionar
				campo.requestFocus();
				
			}
		});
		
		//Adicionar
		formulario.add(pergunta);
		formulario.add(campo);
		formulario.add(botao);
		
		//Exibir
		formulario.setVisible(true);
		formulario.repaint();
		
	}

}
