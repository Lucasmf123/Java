//Importar os componentes
import javax.swing.*;

//Classe
public class Escolha{

    //Iniciar sistema
    public static void main(String[] args){

        //Obter Dados
        int opcao = JOptionPane.showConfirmDialog(null, "Está gostando de Java?", "", 0);

        //Estrutura de Escolha
        switch(opcao){

            case 0:
            JOptionPane.showMessageDialog(null, "Que bom");
            break;

            case 1:
            JOptionPane.showMessageDialog(null, "Que péna");
            break;

            default:
            JOptionPane.showMessageDialog(null, "Bye!");

        }

    }

}