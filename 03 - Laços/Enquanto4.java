import javax.swing.*;

public class Enquanto4 {

    public static void main(String[] args) {
        
        //Variáveis
        String nome;
        int idade;

        //Perguntar o nome
        nome = JOptionPane.showInputDialog(
        null, "Informe um nome ou SAIR para finalizar.");

        //Laço
        while(!nome.equals("SAIR")){

            //perguntar a idade
            idade = Integer.parseInt(JOptionPane.
            showInputDialog(null, "Qual a sua idade?"));

            //Criar frase
            JOptionPane.showMessageDialog(null, "Olá "+nome+". Você tem "+idade+" anos");
            
            //Perguntar o nome
            nome = JOptionPane.showInputDialog(
            null, "Informe um nome ou SAIR para finalizar.");

        }

    }
    
}