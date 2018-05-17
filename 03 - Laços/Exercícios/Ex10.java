import javax.swing.*;

public class Ex10 {

    public static void main(String[] args) {
        
        //Variaveis
        String voto = null;
        int voto1 = 0;
        int voto2 = 0;
        int voto3 = 0;
        int voto4 = 0;
        int total = 0;
        int maiorvoto = 0;
        String nome = null;
        String vencedor = null;


        voto = JOptionPane.showInputDialog("Vote para escolher sua comida: \nPizza \nRalf \nChocolate \nChurrasco \nDigite SAIR para finalizar");
    
    
        while(!voto.equals("SAIR")){

            if(voto.equals("Pizza")){
                voto1++;


            }else if(voto.equals("Ralf")){
                voto2++;


            }else if(voto.equals("Chocolate")){
                voto3++;


            }else if(voto.equals("Churrasco")){
                voto4++;


            }

            total = voto1+voto2+voto3+voto4;

            voto = JOptionPane.showInputDialog("Vote para escolher sua comida: \n1 (Pizza) \n2 (Ralf) \n3 (Chocolate) \n4 (Churrasco) \nDigite 0 para finalizar");
        
        }

            if(voto1 > maiorvoto){
                maiorvoto = voto1;

            }
            if(voto2 > maiorvoto){
                maiorvoto = voto2;

            }
            if(voto3 > maiorvoto){
                maiorvoto = voto3;

            }
            if(voto4 > maiorvoto){
                maiorvoto = voto4;

            }
            

        JOptionPane.showMessageDialog(null, "Total de votos "+total+"\n1 teve "+(100/total*voto1)+" %.\n2 teve "+(100/total*voto2)+" %.\n3 teve "+(100/total*voto3)+" %.\n4 teve "+(100/total*voto4)+" %\nO ganhador foi "+maiorvoto);
    
       

    }

    
}

