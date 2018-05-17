import javax.swing.*;

public class Ex9 {

    public static void main(String[] args) {
        
        //Obter número
        int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o ano."));
        
        //Exibir resultado
        if(ano % 4 == 0){JOptionPane.showMessageDialog(null, "BISSEXTO");}else{JOptionPane.showMessageDialog(null, "ANO NORMAL");}
    
    }

}