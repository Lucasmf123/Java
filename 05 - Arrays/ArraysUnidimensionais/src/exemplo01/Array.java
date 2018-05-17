package exemplo01;

import javax.swing.JOptionPane;

public class Array {

	public static void main(String[] args) {
		
		//Vetor/Array = Variável que armazena múltiplos dados
		String[] nomes = new String[3];
		
		//Adiconar dados ao vetor
		nomes[0] = "Alice";
		nomes[1] = "Bryan";
		nomes[2] = "Caroline";

		//Exibir valores do vetor #1
		/*System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		System.out.println(nomes[2]);*/
		
		//Exibir valores do vetor #2
		int indice = 0;
		do{
			System.out.println(nomes[indice]);
			indice++;
		}while(indice <3);
		
		//Exibir valores do vetor #3
		/*for(int indice = 0; indice < 3; indice++){
			System.out.println((indice+1)+"° nome é "+nomes[indice]);
		}*/
		
		//Exibir valores do vetor #4
		/*for(String nome : nomes){
			System.out.println(nome);*/
		}
		
		
	}

