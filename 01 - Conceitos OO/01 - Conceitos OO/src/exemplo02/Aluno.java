package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	//Atributos
	String nome;
	double nota1, nota2, nota3;
	int aprovado=0, reprovado=0;
	
	//M�todo para realizar perguntas
	public void obterDados() {
		
		nome = JOptionPane.showInputDialog("Informe seu nome");		
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota"));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua segunda nota"));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua terceira nota"));
		
	}
		
	//M�todo para o la�o de repeti��o
		public void laco() {
			
		//Vari�vel continuar
			int continuar = 0;
			
			do {
				obterDados();
				contabilizarSituacao();
				exibirDados();
				
				continuar = JOptionPane.showConfirmDialog(null, "Continuar?");
			}while(continuar == 0);
		}
		
		//M�todo para retornar a m�dia
		public double calculoMedia() {
			
			double media = (nota1+nota2+nota3)/3;
			return media;
		}
		
		//M�todo para contabilizar aprovados e reprovados
				public void contabilizarSituacao() {
					
					if(calculoMedia() >= 7) {
						aprovado++;
					}else {
						reprovado++;
					}
				}
		
		//m�todo para retornar a situa��o do Aluno
		public String situacaoAluno() {
			
			String situacao = calculoMedia() >= 7 ? "Aprovado" : "Reprovado";
			return situacao;
			
		}
		
		
		//M�todo para exibir a m�dia e a situa��o do aluno
		public void exibirDados() {
			
			String msg = "O aluno "+nome;
				   msg+= "\nObteve sua m�dia: "+String.format("%.2f", calculoMedia());
				   msg+= "\nSua situa��o �: "+situacaoAluno();
				   msg+= "\nH� "+aprovado+" aprovados.";
				   msg+= "\nH� "+reprovado+" reprovados.";
				   
				   JOptionPane.showMessageDialog(null, msg);
		}
				
	}
	

