package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	//Atributos
	String nome;
	double nota1, nota2, nota3;
	int aprovado=0, reprovado=0;
	
	//Método para realizar perguntas
	public void obterDados() {
		
		nome = JOptionPane.showInputDialog("Informe seu nome");		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua segunda nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua terceira nota"));
		
	}
		
	//Método para o laço de repetição
		public void laco() {
			
		//Variável continuar
			int continuar = 0;
			
			do {
				obterDados();
				contabilizarSituacao();
				exibirDados();
				
				continuar = JOptionPane.showConfirmDialog(null, "Continuar?");
			}while(continuar == 0);
		}
		
		//Método para retornar a média
		public double calculoMedia() {
			
			double media = (nota1+nota2+nota3)/3;
			return media;
		}
		
		//Método para contabilizar aprovados e reprovados
				public void contabilizarSituacao() {
					
					if(calculoMedia() >= 7) {
						aprovado++;
					}else {
						reprovado++;
					}
				}
		
		//método para retornar a situação do Aluno
		public String situacaoAluno() {
			
			String situacao = calculoMedia() >= 7 ? "Aprovado" : "Reprovado";
			return situacao;
			
		}
		
		
		//Método para exibir a média e a situação do aluno
		public void exibirDados() {
			
			String msg = "O aluno "+nome;
				   msg+= "\nObteve sua média: "+String.format("%.2f", calculoMedia());
				   msg+= "\nSua situação é: "+situacaoAluno();
				   msg+= "\nHá "+aprovado+" aprovados.";
				   msg+= "\nHá "+reprovado+" reprovados.";
				   
				   JOptionPane.showMessageDialog(null, msg);
		}
				
	}
	

