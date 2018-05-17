//Importar componentes
import javax.swing.*;

//Classe
public class Ex7 {

    //Iniciar sistema
    public static void main(String[] args) {
        
        //Variáveis
        int erros=0, acertos=0;
        boolean continuar = true;
        String letra;
        boolean letraE=false, letraS=false, letraT=false, letraU=false, letraD=false, letraA=false, letraR=false;
        String estrutura = "";
        

        //Laço
        while(continuar == true){

            //Estrutura
            estrutura = "Informe uma letra\n\n";
            
            //Boneco feliz
            if(erros == 1){
                estrutura += "|------|\n";
                estrutura += "|      O\n";
                estrutura += "|\n";
                estrutura += "|\n";
                estrutura += "|\n";
                estrutura += "|\n";
            }else if(erros == 2){
                estrutura += "|------|\n";
                estrutura += "|      O\n";
                estrutura += "|      |\n";
                estrutura += "|\n";
                estrutura += "|\n";
                estrutura += "|\n";
            }else if(erros == 3){
                estrutura += "|------|\n";
                estrutura += "|      O\n";
                estrutura += "|     /|\n";
                estrutura += "|\n";
                estrutura += "|\n";
                estrutura += "|\n";
            }else if(erros == 4){
                estrutura += "|------|\n";
                estrutura += "|      O\n";
                estrutura += "|     /|>\n";
                estrutura += "|\n";
                estrutura += "|\n";
                estrutura += "|\n";
            }else if(erros == 5){
                estrutura += "|------|\n";
                estrutura += "|      O\n";
                estrutura += "|     /|>\n";
                estrutura += "|     /\n";
                estrutura += "|\n";
                estrutura += "|\n";
            }else if(erros == 6){
                estrutura += "|------|\n";
                estrutura += "|      O\n";
                estrutura += "|     /|>\n";
                estrutura += "|     / >\n";
                estrutura += "|\n";
                estrutura += "|\n";
            }
            //Pular linha
            estrutura += "\n\n";
            
            //Letras
            if(letraE == true){
                estrutura += "E ";
            }else{
                estrutura += "_ ";
            }
            
            if(letraS == true){
                estrutura += "S ";
            }else{
                estrutura += "_ ";
            }
            
            if(letraT == true){
                estrutura += "T ";
            }else{
                estrutura += "_ ";
            }
            
            if(letraU == true){
                estrutura += "U ";
            }else{
                estrutura += "_ ";
            }
            
            if(letraD == true){
                estrutura += "D ";
            }else{
                estrutura += "_ ";
            }
            
            if(letraA == true){
                estrutura += "A ";
            }else{
                estrutura += "_ ";
            }
            
            if(letraR == true){
                estrutura += "R ";
            }else{
                estrutura += "_ ";
            }

            //Obter uma letra
            letra = JOptionPane.showInputDialog(estrutura);

            //Condicional
            switch(letra){
                case "e":
                    if(letraE == true){
                        JOptionPane.showMessageDialog(null, "Letra já informada");
                    }else{
                        letraE = true;
                        acertos++;
                        JOptionPane.showMessageDialog(null, "Letra correta!");
                    }
                break;

                case "s":
                    if(letraS == true){
                        JOptionPane.showMessageDialog(null, "Letra já informada");
                    }else{
                        letraS = true;
                        acertos++;
                        JOptionPane.showMessageDialog(null, "Letra correta!");
                    }
                break;

                case "t":
                    if(letraT == true){
                        JOptionPane.showMessageDialog(null, "Letra já informada");
                    }else{
                        letraT = true;
                        acertos++;
                        JOptionPane.showMessageDialog(null, "Letra correta!");
                    }
                break;

                case "u":
                    if(letraU == true){
                        JOptionPane.showMessageDialog(null, "Letra já informada");
                    }else{
                        letraU = true;
                        acertos++;
                        JOptionPane.showMessageDialog(null, "Letra correta!");
                    }
                break;

                case "d":
                    if(letraD == true){
                        JOptionPane.showMessageDialog(null, "Letra já informada");
                    }else{
                        letraD = true;
                        acertos++;
                        JOptionPane.showMessageDialog(null, "Letra correta!");
                    }
                break;

                case "a":
                    if(letraA == true){
                        JOptionPane.showMessageDialog(null, "Letra já informada");
                    }else{
                        letraA = true;
                        acertos++;
                        JOptionPane.showMessageDialog(null, "Letra correta!");
                    }
                break;

                case "r":
                    if(letraR == true){
                        JOptionPane.showMessageDialog(null, "Letra já informada");
                    }else{
                        letraR = true;
                        acertos++;
                        JOptionPane.showMessageDialog(null, "Letra correta!");
                    }
                break;

                default:
                    erros++;
                    JOptionPane.showMessageDialog(null, "Letra errada!");
            }

            //Verificar se o laço continua
            if((acertos == 7) || (erros == 7)){
                continuar = false;
            }

        }

        //Verificar se ganhou
        if(acertos == 7){
            JOptionPane.showMessageDialog(null, "Acertou a palavra ESTUDAR!");
        }else{
            estrutura = "";
            estrutura += "|------|\n";
            estrutura += "|      O\n";
            estrutura += "--------\n";
            estrutura += "|     /|>\n";
            estrutura += "|     / >\n";
            estrutura += "|\n";
            estrutura += "|\n";
            JOptionPane.showMessageDialog(null, estrutura+"\n\nErrou! Era Estudar!");
        }



    }
    
}