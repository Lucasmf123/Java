import javax.swing.*;

public class Enquanto3 {

    public static void main(String[] args) {
        
        //Variáveis
        int numero = 0;
        boolean valida = false;

        //Laço
        while(valida == false){

            try{
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um numero"));

                valida = true;

            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Inválido!");
            }

        }

    }
    
}