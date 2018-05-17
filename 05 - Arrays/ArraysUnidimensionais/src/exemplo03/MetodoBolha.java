package exemplo03;

public class MetodoBolha {

	public static void main(String[] args) {
	
		//Vetor
		int[] numeros = {5, 3, 1, 8, 4};
		
		//Maior número
		int maiorNumero;
		
		//Laço 01
		for(int i1 =0; i1 <4; i1++){
			
			//Laço 02
			for(int i2 = i1+1; i2 < 5; i2++){
			
				if(numeros[i2] < numeros[i1]){
					maiorNumero = numeros[i1];
					numeros[i1] = numeros[i2];
					numeros[i2] = maiorNumero;
					
				}
				
			}
			
		}

		//Exibir Resultados
		for(int n : numeros){
			System.out.println(n);
		}
		
	}

}
