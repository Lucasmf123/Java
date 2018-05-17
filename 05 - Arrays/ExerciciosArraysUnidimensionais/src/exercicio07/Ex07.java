package exercicio07;

import javax.swing.JOptionPane;

public class Ex07 {

	public static void main(String[] args) {
		
		//Vetores
		int[] numero = new int[7];
		int pegarNumero = 0;
		boolean existe;
		
		//Adicionar dados ao vetor
		for(int i=0; i<7; i++){
			
			//Obter o número
			do{
				existe = false;
				
				pegarNumero = Integer.parseInt(JOptionPane.showInputDialog("Informe os números"));
			
				//Validar se o número existe
				for(int i2=0; i2<7; i2++){

					if(pegarNumero == numero[i2]){
						existe = true;
						break;
					}
				}
				
				//Adicionar no vetor
				if(existe != true){
				
					for(int i2 = 0; i2<7; i2++){
						if (numero[i2] == 0) {
							numero[i2] = pegarNumero;
							break;
						}
					}
					
				}else{
					JOptionPane.showMessageDialog(null, "Número já informado!");
				}
			
			}while(existe != false);
			
			
		}
				
	}
	
}