import javax.swing.*;

public class Ex12{

   public static void main(String[] args){
	
	//Obter a velocidade do ve�culo e da pista
	int velocidadeVeiculo = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade do ve�culo."));
	int velocidadePista = Integer.parseInt(JOptionPane.showInputDialog("Informe a velocidade da pista."));

	//C�lculo para retornara a diferen�a entre a velocidade da pista e do ve�culo
	int diferenca = velocidadeVeiculo - velocidadePista;

	//Condicional
	if(diferenca <= 0){
	     JOptionPane.showMessageDialog(null, "Bom motorista.");
        }else if(diferenca <= 10){
	     JOptionPane.showMessageDialog(null, "Multa de R$50,00");
	}else if(diferenca <= 30){
	     JOptionPane.showMessageDialog(null, "Multa de R$100,00");
	}else{
	     JOptionPane.showMessageDialog(null, "Multa de R$200,00");
	}


   }
}