import javax.swing.*;

public class Combo{

	public static void main(String[] args){

		//Opções
		Object[] cursos = {"Java", "C#", "PHP"};

		//Combo
		Object escolha = JOptionPane.showInputDialog(null, "Escolha seu curso", "Título", JOptionPane.PLAIN_MESSAGE, null, cursos,"");

		//Exibir o curso selecionado
		JOptionPane.showMessageDialog(null, escolha);

				

	}

}