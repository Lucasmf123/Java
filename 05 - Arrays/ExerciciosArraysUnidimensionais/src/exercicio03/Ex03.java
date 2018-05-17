package exercicio03;

import javax.swing.JOptionPane;

public class Ex03 {
	
	public static void main(String[] args) {
		
		//Vetores
		int[] numeros = new int[5];
		boolean valida = false;
		int indice = 0;
		
		//Laço
		while(indice <5){
			numeros[indice] = Integer.parseInt(JOptionPane.showInputDialog("informe 5 números distintos"));
			
			indice++;
		
	}
		
		indice = 0;
		while(indice < 5){
			if(numeros[indice] == 10){
				valida = true;
			}
			
			indice++;
		
		}
		
		if(valida == false){
			JOptionPane.showMessageDialog(null, "Não existe número 10");
		}else{
		
				indice = 0;
				while(indice < 5){
					if(numeros[indice] == 10){
						System.out.println(indice);
					}
					
					indice++;
				
				}
			
		}

}
	
	
}
