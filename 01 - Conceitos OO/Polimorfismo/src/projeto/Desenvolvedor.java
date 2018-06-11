package projeto;

import javax.swing.JOptionPane;

public class Desenvolvedor extends Cargo {
	
	//Método de desconto para o sindicato
		public void imposto(double salario) {
			
			//Realizar o cálculo
			double total = salario *0.03;
			
			//Mensagem
			JOptionPane.showMessageDialog(null, "Cargo: Desenvolvedor\nDesconto: "+total);
			
		}

}
