package exercicio01;

import javax.swing.JOptionPane;

public class ex01 {

	public static void main(String[] args) {
	
		//Vetor #1
		int[] primeirosnumeros = new int[10];
		int[] segundosnumeros = new int[10];
		int indice = 0;
		String operacao = null;
			
		operacao = JOptionPane.showInputDialog("Informe a opera��o");
		
		//La�o
		while (indice <10) {
			primeirosnumeros[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe os 10 primeiros n�meros"));
			indice++;
		}
		
		indice = 0;
		while (indice <10) {
			segundosnumeros[indice] = Integer.parseInt(JOptionPane.showInputDialog("Informe os 10 �ltimos n�meros"));
			indice++;
		}	
		
		indice = 0;
		while (indice <10) {
			
			if (operacao.equals("Soma")) {
			System.out.println(primeirosnumeros[indice] + segundosnumeros[indice]);
			indice++;
			}
			
			if (operacao.equals("Subtra��o")) {
			System.out.println(primeirosnumeros[indice] - segundosnumeros[indice]);
			indice++;
			}
			
			if (operacao.equals("Divis�o")) {
			System.out.println(primeirosnumeros[indice] / segundosnumeros[indice]);
			indice++;
			}
			
			if (operacao.equals("Multiplica��o")) {
			System.out.println(primeirosnumeros[indice] * segundosnumeros[indice]);
			indice++;
			}
			
			
		}	
		
		
		
		
		
		
	
	}

}
