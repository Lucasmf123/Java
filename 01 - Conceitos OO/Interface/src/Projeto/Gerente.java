package Projeto;

import javax.swing.JOptionPane;

public class Gerente implements Padrao {

	@Override
	public void descontoVR(double salario) {

		JOptionPane.showMessageDialog(null, "O desconto no sálario do Gerente é de: R$"+salario*0.10);
		
	}

}
