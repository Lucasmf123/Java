package ex02;

public class Aluno extends Notas {
	
		//Atributo
		private String nome, materia, media;
		
		//Construtor
		public Aluno(String nome, String materia, int nota1, int nota2, int nota3) {
			
			//Chamar construtor da classe Notas
			super(nota1, nota2, nota3);
			
			//Atribuindo valores
			this.nome = nome;
			this.materia = materia;
			
			//M�todo situa��o
			situacao();
			
		}
		
		//M�todo situa��o
		private void situacao() {
			
			//Estrutura da mensagem
			String mensagem = "Aluno: "+nome;
				   mensagem = "Mat�ria: "+materia;
				   mensagem = "M�dia: "+media;
			
		}
		
	}
