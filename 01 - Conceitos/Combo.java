import javax.swing.*;

public class Combo{

	public static void main(String[] args){

		//Op��es
		Object[] cursos = {"Java", "C#", "PHP"};

		//Combo
		Object escolha = JOptionPane.showInputDialog(null, "Escolha seu curso", "T�tulo", JOptionPane.PLAIN_MESSAGE, null, cursos,"");

		//Exibir o curso selecionado
		JOptionPane.showMessageDialog(null, escolha);

				

	}

}