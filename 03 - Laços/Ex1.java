import javax.swing.*;

public class Ex1 {

    public static void main(String[] args) {
        
        //Variáveis
        String nome;
        int idade = 0;
        String sexo;
        String cargo;

        //Idades
        int maiores = 0;
        int menores = 0;

        //Sexos
        int masculino = 0;
        int feminino = 0;
        
        //Cargos
        int gerente = 0;
        int atendente = 0;
        int acougueiro = 0;
        int secretaria = 0;
        int almoxarife = 0;
        int padeiro = 0;
        int estagiario = 0;



        //Perguntar o nome
        nome = JOptionPane.showInputDialog(null, "Informe o nome ou SAIR para finalizar");

        //Laço
        while(!nome.equals("SAIR")){

            //Perguntar a idade
            idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade."));

            if(idade >= 18){
                maiores++;
            }else{
                menores++;
            }

            //Perguntar o sexo
            sexo = JOptionPane.showInputDialog(null, "Informe o sexo");

            if(sexo.equals("Masculino")){
                masculino++;
            }else{
                feminino++;
            }

            //Perguntar o cargo
            cargo = JOptionPane.showInputDialog(null,"Informe o cargo");

            if(cargo.equals("Gerente")){
                gerente++;
            }else if(cargo.equals("Atendente")){
                atendente++;
            }else if(cargo.equals("Açougueiro")){
                acougueiro++;
            }else if(cargo.equals("Secretaria")){
                secretaria++;
            }else if(cargo.equals("Almoxarife")){
                almoxarife++;
            }else if(cargo.equals("Padeiro")){
                padeiro++;
            }else if(cargo.equals("Estagiario")){
                estagiario++;
            }

            //Perguntar o nome
        nome = JOptionPane.showInputDialog(null, "Informe o nome ou SAIR para finalizar");

        }

        //Exibir
        JOptionPane.showMessageDialog(null, "São "+masculino+" homens.\nSão "+feminino+" mulheres.\nSão "+maiores+" maiores de 18 anos.\nSão "+menores+" menores de 18 anos.\nSão "+gerente+" gerentes.\nSão "+atendente+" atendentes.\nSão "+acougueiro+" açougueiros.\nSão "+secretaria+" secretários.\nSão "+almoxarife+" almoxarifes.\nSão "+padeiro+" padeiros.\nSão por fim, "+estagiario+" estagiários.");
        

    }
    
}