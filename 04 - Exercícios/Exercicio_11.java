import javax.swing.*;

public class Exercicio_11{

    public static void main(String[] args) {
        
        //Variáveis
        Object[] sair = {"Continuar","Sair"};
        String nome, texto;  
        int cont;      

        //Atribuindo Valores
        cont = 0;
        texto = "";
        Object Sair = "";

        //Condicional
        do{

        //Obter dado
        nome = JOptionPane.showInputDialog(null, "Digite um nome");
        Sair = JOptionPane.showInputDialog(null, "Você quer continuar a digitar nomes?", "Opções", JOptionPane.PLAIN_MESSAGE, null, sair, "");
        cont++;

        //Condicional
        if((Sair == "Sair") && (cont == 1)){
            texto += nome; 

        }else if(Sair == "Sair"){
            texto += " e "+nome;

        }else if((Sair == "Continuar") && (cont > 1)){
            texto += ", "+nome; 

        }else{
            texto += nome;

        }

        }while(!Sair.equals("Sair"));

        JOptionPane.showMessageDialog(null, texto);

    }


}