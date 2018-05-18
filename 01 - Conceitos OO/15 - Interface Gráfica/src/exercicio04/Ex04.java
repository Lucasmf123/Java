package exercicio04;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Ex04 {

	public static void main(String[] args) {

		// JFrame
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 150);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);

		// JLabel
		JLabel pergunta1 = new JLabel();
		pergunta1.setBounds(10, 10, 150, 20);
		pergunta1.setText("Nome do Produto");

		// JLabel2
		JLabel pergunta2 = new JLabel();
		pergunta2.setBounds(10, 40, 150, 20);
		pergunta2.setText("Valor do Produto");

		// JLabel3
		JLabel pergunta3 = new JLabel();
		pergunta3.setBounds(10, 70, 150, 20);
		pergunta3.setText("Forma de pagamento");

		// Campo
		JTextField campo = new JTextField();
		campo.setBounds(150, 10, 150, 20);

		// Campo1
		JTextField campo1 = new JTextField();
		campo1.setBounds(150, 40, 150, 20);

		// Campo2
		JTextField campo2 = new JTextField();
		campo2.setBounds(150, 70, 150, 20);
		
		//Botão
		JButton botao = new JButton();
		botao.setBounds(350, 25, 100, 50);
		botao.setText("Continuar");
		
		//Adicionar ação ao botão
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if (((campo2.getText()).equals("A VISTA")) && ((Double.parseDouble(campo1.getText())) >= 500)){
					JOptionPane.showMessageDialog(null, "Nome do Produto: "+campo.getText()+"\nValor do Produto com Desconto: R$"+((Double.parseDouble(campo1.getText()))-((Double.parseDouble(campo1.getText()))*0.10)));
				}
				
				//Limpar
				campo.setText("");
				campo1.setText("");
				campo2.setText("");
				
				//Selecionar
				campo.requestFocus();
				
			}
		});
		
		//Adicionar ao formulario
		formulario.add(pergunta1);
		formulario.add(pergunta2);
		formulario.add(pergunta3);
		formulario.add(campo);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(botao);

		//Exibir
		formulario.setVisible(true);
		formulario.repaint();
		
	}

}
