//Importar componentes
import javax.swing.*;

public class Mod {

    public static void main(String[] args) {
        
        //Obter número
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número"));
        
        //Exibir resultado
        if(numero % 2 == 0){JOptionPane.showMessageDialog(null, "par");}else{JOptionPane.showMessageDialog(null, "Ímpar");}
        

    }

    
}