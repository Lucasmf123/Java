import javax.swing.*;

public class Ex3 {

    public static void main(String[] args) {
        
        //Variáveis
        double total = 0;
        int codigo = 0;
        int quantidade = 0;
        int H = 0;
        int S = 0;
        int Pra = 0;
        int Piz = 0;
        int Las = 0;
        int Pao = 0;
        int bolo = 0;
        int continuar = 0;

        //Obter Pedido
        do{
        codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número do produto que você deseja ou SAIR para cancelar."));

        quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade"));

        //Qual pedido foi escolhido
        switch (codigo) {
            case 1:
                total += quantidade * 5;
                H += quantidade;
                break;

            case 2:
                total += quantidade * 4.5;
                S += quantidade;
                break;

            case 3:
                total += quantidade * 8;
                Pra += quantidade;
                break;

            case 4:
                total += quantidade * 12;
                Piz += quantidade;
                break;

            case 5:
                total += quantidade * 16.5;
                Las += quantidade;
                break;

            case 6:
                total += quantidade * 1;
                Pao += quantidade;
                break;

            case 7:
                total += quantidade * 2.5;
                bolo += quantidade;
                break;
        
        }

        continuar = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja continuar? (Digite continuar se Sim)", "", 0));
        
        }while(continuar != 1);


        //Frase
        String frase = "O total da compra ficou em R$ "+total+". Informe o valor pago pelo cliente.";
            if(H != 0){
                   frase+= "\n Foram pedidos "+H+" Hambúrguer + Suco de Laranja ";
               }

            if(S != 0){
                frase+= "\n Foram pedidos "+S+" Sanduíche natural + Suco de Uva ";
            }

            if(Pra != 0){
                frase+= "\n Foram pedidos "+Pra+" Prato do dia  ";
            }

            if(Piz != 0){
                frase+= "\n Foram pedidos "+Piz+" Pizza ";
            }

            if(Las != 0){
                frase+= "\n Foram pedidos "+Las+" Lasanha ";
            }

            if(Pao != 0){
                frase+= "\n Foram pedidos "+Pao+" Pão de queijo ";
            }

            if(bolo != 0){
                frase+= "\n Foram pedidos "+bolo+" Bolo ";
            }      
            
            double troco = Double.parseDouble(JOptionPane.showInputDialog(frase));

        if(troco < total){
            JOptionPane.showMessageDialog(null, "Inválido");
        }else{
            JOptionPane.showMessageDialog(null, "Troco R$ "+(troco - total));
        }


    }

}