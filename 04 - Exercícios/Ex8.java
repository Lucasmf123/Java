import javax.swing.*;

public class Ex8 {

    public static void main(String[] args) {
        
        //Variáveis
        int numero = 0;

        //Obter número
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe um número inteiro"));

        //Exibir Resultados
        JOptionPane.showMessageDialog(null, "Número inteiro: "+numero+"\nSucessores: "+(numero+1)+", "+(numero+2)+", "+(numero+3)+", "+(numero+4)+", "+(numero+5)+", "+(numero+6)+", "+(numero+7)+", "+(numero+8)+", "+(numero+9)+", "+(numero+10)+".\nAntecessores: "+(numero-1)+", "+(numero-2)+", "+(numero-3)+", "+(numero-4)+", "+(numero-5)+", "+(numero-6)+", "+(numero-7)+", "+(numero-8)+", "+(numero-9)+", "+(numero-10)+".");
    

    }
    
}