package Projeto;

import javax.swing.JOptionPane;

public class Gerente implements Padrao {

	@Override
	public void descontoVR(double salario) {

		JOptionPane.showMessageDialog(null, "O desconto no s�lario do Gerente � de: R$"+salario*0.10);
		
	}

}
