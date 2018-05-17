package exercicio06;

import javax.swing.JOptionPane;

public class Ex06 {

	public static void main(String[] args) {
		
		//Vetores
		String[] nome = new String[10];
		String[] questoes = new String[10];
		int indiceAluno = 0;
		int maiorAcerto;
		String maiorNomeAcerto;
		String pergunta;
		String[] respostas = {"sim","sim","sim","n�o","sim","sim","n�o","n�o","n�o","sim",};
		int[] acertos = new int[10];
		int[] erros = new int[10];
		int[] vetorErros = new int[10];
		String paunoseucu = "Voc� errou as seguintes quest�es:\n\n ";
		
		//Adicionar Dados
		questoes[0] = "Voce pode contar com o Lucas em tempos dificeis? SIM ou N�O";
		questoes[1] = "Lucas est� feliz com sua vida nesse momento? SIM ou N�O";
		questoes[2] = "Lucas raspa o peito? SIM ou N�O";
		questoes[3] = "Lucas segue os conselhos de outras pessoas? SIM ou N�O";
		questoes[4] = "Lucas se acha mais inteligente que a m�dia? SIM ou N�O";
		questoes[5] = "Lucas guarda m�goas? SIM ou N�O";
		questoes[6] = "Lucas ja roubou alguma coisa de uma loja? SIM ou N�O";
		questoes[7] = "Lucas j� desmaiou? SIM ou N�O";
		questoes[8] = "Lucas tem medo de aranhas? SIM ou N�O";
		questoes[9] = "Lucas tem uma bunda musculosa? SIM ou N�O";
		
		//Obter nomes
		nome[indiceAluno] = JOptionPane.showInputDialog("Informe o "+(indiceAluno+1)+"� nome ou SAIR para finalizar");
		
		//Obter resultados das quest�es
		while (!nome[indiceAluno].equals("SAIR")) {
			
			//Perguntas
			for(int i = 0; i < 10; i++){
				pergunta = JOptionPane.showInputDialog(null, questoes[i]);
				
				if(pergunta.equals(respostas[i])){
					acertos[indiceAluno]++;									
				}else{
					erros[indiceAluno]++;
					vetorErros[i] = i;    
				}

				paunoseucu += questoes[vetorErros[i]]+"\n";
			}
			
			//Exibir quest�es erradas corrigidas
			JOptionPane.showMessageDialog(null, paunoseucu);
			
			 									
		indiceAluno++;
		nome[indiceAluno] = JOptionPane.showInputDialog("Informe o "+(indiceAluno+1)+"� nome ou SAIR para finalizar");
		
		}
		
		
		//M�todo bolha
				for(int i1 = 0; i1 < 9; i1++){
					
					for(int i2 = i1+1; i2 < 10; i2++){
						
						if(acertos[i2] > acertos[i1]){
							maiorAcerto = acertos[i1];
							acertos[i1] = acertos[i2];
							acertos[i2] = maiorAcerto;
							
							maiorNomeAcerto = nome[i1];
							nome[i1] = nome[i2];
							nome[i2] = maiorNomeAcerto;
						}
						
					}
					
				}
	
		//Formar os resultados
		String texto = "Resultado da prova:\n\n";
		int ranking = 1;
		for(int indice = 0; indice < 10; indice++){
					
			if((!"SAIR".equals(nome[indice])) && (null != nome[indice])){
			texto += ranking+"� � "+nome[indice]+" com acertos totais: "+acertos[indice]+"\n";
			ranking++;
			}
					
		}
		
		//Exibir resultados
		JOptionPane.showMessageDialog(null, texto);
				
		
		
		
	}
}
