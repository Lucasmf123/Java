import javax.swing.*;

public class Ex4 {

    public static void main(String[] args) {
        
        int idade = 0;
        int avaliacao = 0;
        int crianca = 0;
        int adolescente = 0;
        int adulto = 0;
        int excelente = 0;
        int otimo = 0;
        int bom = 0;
        int regular = 0;
        int ruim = 0;
        int total = 0;

        //Obter Idade
        String pergunta = "";
        pergunta = JOptionPane.showInputDialog(null, "Informe a idade ou SAIR para finalizar.");

        if(!pergunta.equals("sair")){
            idade = Integer.parseInt(pergunta);
            if((idade <0) || (idade >100)){JOptionPane.showMessageDialog(null, "Idade inválida");}
        }
        
        //Laço
        while (!pergunta.equals("sair")) {

            if((idade >=0) && (idade <=9)) {
                crianca++;                
            }
            if((idade >=10) && (idade <=17)) {
                adolescente++;                                
            }
            if (idade >=18) {
                adulto++;                
            }
            
        //Obtendo avaliação

            avaliacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua avaliação:\n1. Excelente\n2. Ótimo\n3. Bom\n4. Regular\n5. Ruim"));

            total++;

            if(avaliacao == 1){
                excelente++;
            }else if (avaliacao == 2) {
                otimo++;                
            }else if (avaliacao == 3) {
                bom++;                
            }else if (avaliacao == 4) {
                regular++;
            }else if (avaliacao == 5) {
                ruim++;                
            }
            
            pergunta = JOptionPane.showInputDialog(null, "Informe a idade ou SAIR para finalizar.");

            if(!pergunta.equals("sair")){
                idade = Integer.parseInt(pergunta);
                if((idade <0) || (idade >100)){JOptionPane.showMessageDialog(null, "Idade inválida");}
            }
                  
        }
       
        //Calculando a porcentagem
        JOptionPane.showMessageDialog(null, "As avaliações somaram:\nExcelente: "+(100/total*excelente)+"%\nÓtimo: "+(100/total*otimo)+"%\nBom: "+(100/total*bom)+"%\nRegular: "+(100/total*regular)+"%\nRuim: "+(100/total*excelente)+"%\nE os avaliadores somaram:\nCrianças: "+crianca+".\nAdolescentes: "+adolescente+".\nAdultos: "+adulto+".");

    }
    
}