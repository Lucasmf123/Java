package exercicio03;

import javax.swing.JOptionPane;

public class Ex03 {
	
	public static void main(String[] args) {
		
		//Vetores
		int[] numeros = new int[5];
		boolean valida = false;
		int indice = 0;
		
		//La�o
		while(indice <5){
			numeros[indice] = Integer.parseInt(JOptionPane.showInputDialog("informe 5 n�meros distintos"));
			
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
			JOptionPane.showMessageDialog(null, "N�o existe n�mero 10");
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
