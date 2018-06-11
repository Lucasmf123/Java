package Projeto;

import javax.swing.JOptionPane;

public class Atendente implements Padrao{

	@Override
	public void descontoVR(double salario) {
		
		JOptionPane.showMessageDialog(null, "O desconto no sálario do Atendente é de: R$"+salario*0.05);
		
	}

}
