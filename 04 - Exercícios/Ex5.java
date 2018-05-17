import javax.swing.*;

public class Ex5 {

        public static void main(String[] args) {
            
            //Variáveis
            String nome = null;
            double valor = 0;

            //Obter Nome
            nome = JOptionPane.showInputDialog(null, "Informe o nome do Produto.");

            //Obter o valor
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o valor do produto"));

            //Exibir o resultado
            JOptionPane.showMessageDialog(null, "Nome do Produto: "+nome+".\nValor normal do produto: R$"+valor+"\nValores com descontos:\n1 X R$"+(valor-(valor*0.05))+" = R$"+(valor-(valor*0.05))+"\n2 X R$"+(valor-(valor*0.10))+" = R$"+((valor-(valor*0.10))+(valor-(valor*0.10)))+"\n3 X R$"+(valor-(valor*0.15))+" = R$"+((valor-(valor*0.15))+(valor-(valor*0.15))+(valor-(valor*0.15)))+"\n4 X R$"+(valor-(valor*0.20))+" = R$"+((valor-(valor*0.20))+(valor-(valor*0.20))+(valor-(valor*0.20))+(valor-(valor*0.20)))+"\n5 X R$"+(valor-(valor*0.25))+" = R$"+((valor-(valor*0.25))+(valor-(valor*0.25))+(valor-(valor*0.25))+(valor-(valor*0.25))+(valor-(valor*0.25)))+"\n6 X R$"+(valor-(valor*0.30))+" = R$"+((valor-(valor*0.30))+(valor-(valor*0.30))+(valor-(valor*0.30))+(valor-(valor*0.30))+(valor-(valor*0.30))+(valor-(valor*0.30)))+"\n7 X R$"+(valor-(valor*0.35))+" = R$"+((valor-(valor*0.35))+(valor-(valor*0.35))+(valor-(valor*0.35))+(valor-(valor*0.35))+(valor-(valor*0.35))+(valor-(valor*0.35))+(valor-(valor*0.35)))+"\n8 X R$"+(valor-(valor*0.40))+" = R$"+((valor-(valor*0.40))+(valor-(valor*0.40))+(valor-(valor*0.40))+(valor-(valor*0.40))+(valor-(valor*0.40))+(valor-(valor*0.40))+(valor-(valor*0.40))+(valor-(valor*0.40)))+"\n9 X R$"+(valor-(valor*0.45))+" = R$"+((valor-(valor*0.45))+(valor-(valor*0.45))+(valor-(valor*0.45))+(valor-(valor*0.45))+(valor-(valor*0.45))+(valor-(valor*0.45))+(valor-(valor*0.45))+(valor-(valor*0.45))+(valor-(valor*0.45)))+"\n10 X R$"+(valor-(valor*0.50))+" = R$"+((valor-(valor*0.50))+(valor-(valor*0.50))+(valor-(valor*0.50))+(valor-(valor*0.50))+(valor-(valor*0.50))+(valor-(valor*0.50))+(valor-(valor*0.50))+(valor-(valor*0.50))+(valor-(valor*0.50))+(valor-(valor*0.50)))+"");             
            
        }
    
}