import javax.swing.*;

public class Ex2 {

    public static void main(String[] args) {
        
        //Variáveis
            String nome;
            String nomemaisalto = null;
            String nomemaispesado = null;
            String nomemaisvelho = null;
            int jogadores = 0;
            int idade = 0;
            int maisvelho = 0;    
            double peso = 0;
            double altura = 0;
            double maioraltura = 0;
            double maispesado = 0;
            double somaAlturas = 0;
            double media = 0;

        //Obter Dados
            nome = JOptionPane.showInputDialog(null, "Digite o nome ou SAIR para finalizar.");

        //Laço
            while(!nome.equals("SAIR")){

                jogadores++;

                //Perguntar a idade
                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade."));

                if(idade > maisvelho){
                    maisvelho = idade;
                    nomemaisvelho = nome;
                }

                //Perguntar a altura
                altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura."));

                somaAlturas += altura;

                if(altura > maioraltura){
                    maioraltura = altura;
                    nomemaisalto = nome;
                }


                //Perguntar o peso
                peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso."));

                if(peso > maispesado){
                    maispesado = peso;
                    nomemaispesado = nome;
                }

                //Loop
                nome = JOptionPane.showInputDialog(null, "Digite o nome ou SAIR para finalizar.");

                }

                
                //Média
                media = somaAlturas/jogadores;
                
            //Exibir resultados
            JOptionPane.showMessageDialog(null, "São "+jogadores+" jogadores.\nO maior jogador é o "+nomemaisalto+" que tem "+maioraltura+" de altura.\nO jogador mais pesado é o "+nomemaispesado+" que tem "+maispesado+"kg.\nO jogador mais velho é o "+nomemaisvelho+" que tem "+maisvelho+" anos.\nA média da altura dos jogadores é "+media+" metros.");
                
    }   

    
}