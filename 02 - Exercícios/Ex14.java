import javax.swing.*;

public class Ex14{

	public static void main(String[] args){

		int valor;

		valor = Integer.parseInt(JOptionPane.showInputDialog("Valor do veículo:"));

		if(valor <=12000){JOptionPane.showMessageDialog(null, "Valor de Fábrica: R$ "+(valor-(valor*0.05))+" \nImposto do Distribuidor: R$ "+valor*0.05+" \nImposto do Governo: Isento");}
		if((valor >12000) && (valor <25000)){JOptionPane.showMessageDialog(null, "Valor de Fábrica: R$ "+(valor-(valor*0.25))+" \nImposto do Distribuidor: R$ "+valor*0.10+" \nImposto do Governo: R$ "+valor*0.15);}
		if(valor >25000){JOptionPane.showMessageDialog(null, "Valor de Fábrica: R$ "+(valor-(valor*0.35))+" \nImposto do Distribuidor: R$ "+valor*0.15+" \nImposto do Governo: R$ "+valor*0.20);}		

	}

}