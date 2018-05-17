import javax.swing.*;

public class Prova {

    public static void main(String[] args) {
        
        //Variáveis
        String nome = "";
        double salarioBase = 0;
        int desjavajun = 0;
        int desjavaple = 0;
        int desjavasen = 0;
        int adm = 0;
        int analjun = 0;
        int analple = 0;
        int analsen = 0;
        int arquiteto = 0;
        int gerente = 0;
        double horasextras50 = 0;
        double horasextras100 = 0;
        int sexo = 0;
        int idade = 0;
        int idade1 = 0;
        int idade2 = 0;
        int idade3 = 0;
        int idade4 = 0;
        int faltas = 0;
        int filhos = 0;
        int clube = 0;
        int numfuncionarios = 0;
        int masculino = 0;
        int feminino = 0;

        //Obter Nome e Iniciar cadastros
        nome = JOptionPane.showInputDialog(null, "Informe o nome do funcionário ou SAIR para finalizar cadastros.");
            
        //Laço
        while (!nome.equals("SAIR")) {

            //Acrescentando Funcionário
            numfuncionarios++;
          
            //Opções de curso
		    Object[] cargos = {"Desenvolvedor em Java, Júnior", "Desenvolvedor em Java, Pleno", "Desenvolvedor em Java, Sênior", "Adm de Banco de Dados", "Analista Júnior", "Analista Pleno", "Analista Sênior", "Arquiteto de Software", "Gerente de Projetos"};
            Object escolha = JOptionPane.showInputDialog(null, "Escolha seu cargo", "Cargos", JOptionPane.PLAIN_MESSAGE, null, cargos,"");
            
                if (escolha.equals("Desenvolvedor em Java, Júnior")) {
                    desjavajun++; 
                    salarioBase = 1450;        
                }
                if (escolha.equals("Desenvolvedor em Java, Pleno")) {
                    desjavaple++; 
                    salarioBase = 2220;        
                }
                if (escolha.equals("Desenvolvedor em Java, Sênior")) {
                    desjavasen++;  
                    salarioBase = 3300;       
                }
                if (escolha.equals("Adm de Banco de Dados")) {
                    adm++; 
                    salarioBase = 3560;        
                }
                if (escolha.equals("Analista Júnior")) {
                    analjun++; 
                    salarioBase = 2800;        
                }
                if (escolha.equals("Analista Pleno")) {
                    analple++; 
                    salarioBase = 3400;        
                }
                if (escolha.equals("Analista Sênior")) {
                    analsen++; 
                    salarioBase = 4500;        
                }
                if (escolha.equals("Arquiteto de Software")) {
                    arquiteto++; 
                    salarioBase = 5280;        
                }
                if (escolha.equals("Gerente de Projetos")) {
                    gerente++;         
                    salarioBase = 6000;
                }

            //Horas Extras (50 e 100%) (E fazendo Cálculos)
                horasextras50 = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantas horas extras durante a semana?")) * (salarioBase/160);
                horasextras100 = Double.parseDouble(JOptionPane.showInputDialog(null, "Quantas horas extras nos fins de semana?")) * (salarioBase/160);

            //Obtendo Sexo e Diferenciando homens à mulheres
                Object[] sexos = {"Masculino", "Feminino"};
		        Object escolha2 = JOptionPane.showInputDialog(null, "Escolha o sexo", "Sexo", JOptionPane.PLAIN_MESSAGE, null, sexos,"");

                if (escolha2.equals("Masculino")) {
                    masculino++;                    
                }
                if (escolha2.equals("Feminino")) {
                    feminino++;
                }

            //Obtendo Idade e distribuindo para suas classificações (E fazendo Cálculos)
                idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe sua idade"));
                if ((idade >= 18) && (idade <= 26)) {
                      idade1++;                  
                }
                if ((idade >= 27) && (idade <= 40)) {
                    idade2++;                  
                }
                if ((idade >= 41) && (idade <= 50)) {
                    idade3++;                  
                }
                if (idade >50) {
                    idade4++;                  
                }

            //Obtendo número de faltas (E fazendo Cálculos)
            faltas = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de faltas"));
            if (faltas == 0) {
                salarioBase+=200;
            }

            //Obtendo número de filhos (E fazendo Cálculos)
            filhos = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número de filhos")) * 50;
            
            //Obtendo Dados sobre clube (E fazendo Cálculos)
            Object[] clubefidelidade = {"Sim", "Não"};
		    Object escolha3 = JOptionPane.showInputDialog(null, "Participante do Clube Fidelidade?", "Clube Fidelidade", JOptionPane.PLAIN_MESSAGE, null, clubefidelidade,"");
                if (escolha3.equals("Sim")) {
                    clube++;
                }

            //Deseja continuar o cadastro?
            nome = JOptionPane.showInputDialog(null, "Informe o nome do funcionário ou SAIR para finalizar cadastros.");
            
            }

        
            //Exibindo Salário Líquido
            double total = (salarioBase+horasextras50+horasextras100+filhos+faltas);
            JOptionPane.showMessageDialog(null, "Salário Líquido = R$ "+String.format("%.2f",total));    
            
            //Exibindo Resultados Completos
            
                 
    }
    
}