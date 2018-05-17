package exercicio08;

import javax.swing.JOptionPane;

public class Ex08 {

	public static void main(String[] args) {
		
		//Vetores
		String[] login = {"admin1", "admin2", "admin3"};
		String[] senha = {"periquita1", "periquita2", "periquita3"};
		String tentativausuario = "";
		String tentativasenha = "";
		boolean valida = false;
		

		tentativausuario = JOptionPane.showInputDialog(null, "Informe o usuário ou SAIR para encerrar");
		
		//Verificando usuário e senha
		while ((valida == false) && (!tentativausuario.equals("SAIR"))) {
				
				
				
	
				tentativasenha = JOptionPane.showInputDialog(null, "Informe a senha");
				
				for(int i=0; i<3; i++){
					if((tentativausuario.equals(login[i])) && (tentativasenha.equals(senha[i]))) {
						valida = true;						
					}				
				}
				if(valida == false) {
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
			}	
				
				//Continuar ou não
				tentativausuario = JOptionPane.showInputDialog(null, "Informe o usuário ou SAIR para encerrar");
						
						
					
		
		
		}
		
		if(valida == true){
		JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!\n\nBem vindo ao XVIDEOS");
		}
		
	}
	
}