import javax.swing.*;

public class Ex5{

	public static void main(String[] args){
	
		//Variáveis
		int dia;

		//Obter Dados
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia em escolha"));

		//Selecionando a data
		if((dia ==3) || (dia ==4) || (dia ==10) || (dia ==11) || (dia ==17) || (dia ==18) || (dia ==24) || (dia ==25)){JOptionPane.showMessageDialog(null, "Fim de Semana");
}else if(
		(dia <1) || (dia >28)){JOptionPane.showMessageDialog(null, "Data Inválida.");
}else{
		JOptionPane.showMessageDialog(null, "Dia de Semana");}
		

	}

}