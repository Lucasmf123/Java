import javax.swing.*;

public class Enquanto2 {

    public static void main(String[] args) {
        
        //Obter um número inteiro
        int numero = Integer.parseInt(
            JOptionPane.showInputDialog(null, "Informe um número"));

        //Estrutura da tabuada
        String tabuada = "A tabuada de "+numero+" é:\n";

        //Indice
        int indice = 0;

        //Laço
        while (indice <= 10) {tabuada += numero+" X "+indice+" = "+(numero*indice)+"\n";

        indice++;
            
        }

        //Exibir
        JOptionPane.showMessageDialog(null, tabuada);

    }   
    
}