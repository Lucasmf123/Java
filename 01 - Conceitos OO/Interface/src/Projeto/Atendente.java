package Projeto;

import javax.swing.JOptionPane;

public class Atendente implements Padrao{

	@Override
	public void descontoVR(double salario) {
		
		JOptionPane.showMessageDialog(null, "O desconto no s�lario do Atendente � de: R$"+salario*0.05);
		
	}

}
