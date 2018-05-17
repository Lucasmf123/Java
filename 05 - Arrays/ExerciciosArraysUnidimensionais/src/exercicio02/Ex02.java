package exercicio02;

import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {
	
		//Vetores
		int[] numeros = new int[10];
		int indice = 0;
		
		//Laço
		while(indice <10){
			
			numeros[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe os dez números"));
			indice++;
			
		}
		
		System.out.println(numeros[9]+", "+numeros[8]+", "+numeros[7]+", "+numeros[6]+", "+numeros[5]+", "+numeros[4]+", "+numeros[3]+", "+numeros[2]+", "+numeros[1]+", "+numeros[0]);
		
	}

}
