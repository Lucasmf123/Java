import javax.swing.*;

public class Ex6 {

    public static void main(String[] args) {
        
        //Variáveis
        String nome = null;
        int sexo = 0;
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        int nota4 = 0;
        int soma = 0;
        int quantidadem = 0;
        int quantidadef = 0;
        int totalqtd = 0;
        int parabens = 0;
        int otimo = 0;
        int bom = 0;
        int satisfatorio = 0;
        int recuperacao = 0;
        int reprovado = 0;
        int totalnotas = 0;
        
        //Obter nome
        nome = JOptionPane.showInputDialog(null, "Informe a idade ou SAIR para finalizar");

        //Laço
        while (!nome.equals("SAIR")) {

        //Obter sexo

        sexo = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o Sexo:\n1. Masculino\n2. Feminino"));

        if (sexo == 1) {
            quantidadem++;       
        }else{
            quantidadef++;
        }

        totalqtd = quantidadef+quantidadem;
            
        //Nota 1
        nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a 1ª nota:"));

        //Nota 2
        nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a 2ª nota:"));

        //Nota 3
        nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a 3ª nota:"));

        //Nota 4
        nota4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a 4ª nota:"));

        soma = (nota1+nota2+nota3+nota4)/4;

        if(soma <5){
            reprovado++;
        }
        if((soma >=5) && (soma <=6.9)){
            recuperacao++;
        }
        if((soma >=7) && (soma <=7.9)){
            satisfatorio++;
        }
        if((soma >=8) && (soma <=8.9)){
            bom++;
        }
        if((soma >=9) && (soma <=9.9)){
            otimo++;
        }
        if(soma ==10){
            parabens++;
        }

        totalnotas = parabens+otimo+bom+satisfatorio+recuperacao+reprovado;

        nome = JOptionPane.showInputDialog(null, "Informe a idade ou SAIR para finalizar");


        }
        
        //Exibir Resultados

        JOptionPane.showMessageDialog(null, "Média de alunos:\nHomens = "+quantidadem+" ("+(100/totalqtd*quantidadem)+"%)\nMulheres = "+quantidadef+" ("+(100/totalqtd*quantidadef)+"%)\nAgora mostrando a quantidade e \nporcentagem de alunos com suas \nrespectivas notas:\nNota 10: "+parabens+" ("+(100/totalnotas*parabens)+"%).Para estes: Parabéns.\nNota 9 a 9.9: "+otimo+" ("+(100/totalnotas*otimo)+"%).Para estes: Ótimo.\nNota 8 a 8.9: "+bom+" ("+(100/totalnotas*bom)+"%).Para estes: Bom.\nNota 7 a 7.9: "+satisfatorio+" ("+(100/totalnotas*satisfatorio)+"%).Para estes: Satisfatório.\nNota 5 a 6.9: "+recuperacao+" ("+(100/totalnotas*recuperacao)+"%).Para estes: Recuperação.\nNota 5 ou menor: "+reprovado+" ("+(100/totalnotas*reprovado)+"%).Para estes: Reprovado.");

    }

}