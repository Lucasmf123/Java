/*package exercicio03;

import javax.swing.JOptionPane;

public class Lanchonete {

	int codigo;
	int quantidade;
	double h = 5;
	double s = 4.5;
	double pr = 8;
	double pi = 12;
	double pa = 16.5;
	double b = 1;
	double l = 2.5;
	double total = 0;
	double pagamento = 0;
	double troco = 0;
	String cardapio = " 1 Hambúrguer + Suco de Laranja R$ 5,00\n 2 Sanduíche natural + Suco de Uva R$ 4,50\n 3 Prato do dia R$ 8,00\n 4 Pizza R$12,00\n 5 Lasanha R$ 16,50\n 6 Pão de queijo R$ 1,00\n 7 Bolo R$ 2,50\n\n Código 0 para encerrar o pedido! ";

	// Obter Dados
	public void obterDados() {

		codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do produto.\n " + cardapio));
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade desejada."));

	}

	// Laço
	public void laco() {

		do {

			obterDados();
			contabilizarPedido();
			calculo();
			exibirDados();

		} while (codigo != 0);

	}

	// Contabilizar pedidos
	public void contabilizarPedido() {

		if (codigo == 1) {
			h++;
		}
		if (codigo == 2) {
			s++;
		}
		if (codigo == 3) {
			pr++;
		}
		if (codigo == 4) {
			pi++;
		}
		if (codigo == 5) {
			l++;
		}
		if (codigo == 6) {
			pa++;
		}
		if (codigo == 7) {
			b++;
		}


	}
	
	//Calculo Preço
	public void calculo() {
		
		total += h*quantidade;
		
		total += s*quantidade;
		
		total += pr*quantidade;
		
		total += pi*quantidade;
		
		total += l*quantidade;
		
		total += pa*quantidade;
		
		total += b*quantidade;
		
	}

	//Exibir Dados
	public void exibirDados() {
		
		pagamento = Double.parseDouble(JOptionPane.showInputDialog("O valor do pedido é de: R$ "+total+"\n\nInforme o valor do pagamento."));
		troco = pagamento-total;		
		
		if (pagamento < total) {
			JOptionPane.showMessageDialog(null, "Valor insuficiente para o pagamento.");
		}else {
			JOptionPane.showMessageDialog(null, "O troco será de: R$ "+troco);
		}
	}
	
}*/

package exercicio03;

import javax.swing.JOptionPane;

public class Lanchonete {
	
	int codigo = 0, quantidade = 0, codigo1 = 0,codigo2 = 0,codigo3 = 0,codigo4 = 0,codigo5 = 0,codigo6 = 0,codigo7 = 0;
	double total = 0;
	boolean valida = false;
	
	//Método para realizar as perguntas
	public void obterDados(){
		
	do{
		
		codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite de 1 à 7 para pedir.\n1 Hambúrguer + Suco de Laranja R$ 5,00\n2 Sanduíche natural + Suco de Uva R$ 4,50\n3 Prato do dia R$ 8,00\n4 Pizza R$12,00\n5 Lasanha R$ 16,50\n6 Pão de queijo R$ 1,00\n7 Bolo R$ 2,50"));
		
		if((codigo <= 7) && (codigo >=1)){
			valida = true;
		}else{
			valida = false;
		}
		
	}while(valida == false);
		
		quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade"));
		
		//Etrutura de escolha
        switch(codigo){
            //Caso
            case 1:
            total += quantidade * 5;
            codigo1 += quantidade;
            break;

            case 2:
            total += quantidade * 4.5;
            codigo2 += quantidade;
            break;

            case 3:
            total += quantidade * 8;
            codigo3 += quantidade;
            break;

            case 4:
            total += quantidade * 12;
            codigo4 += quantidade;
            break;

            case 5:
            total += quantidade * 16.5;
            codigo5 += quantidade;
            break;

            case 6:
            total += quantidade * 1;
            codigo6 += quantidade;
            break;

            case 7:
            total += quantidade * 2.5;
            codigo7 += quantidade;
            break;
        }
		
	}
	
	//Método para o laço de repetição
	public void laco(){

		int continuar = 0;
		
	do{
				
		obterDados();
		
		continuar = JOptionPane.showConfirmDialog(null, "Continuar?");
		
	}while(continuar == 0);
	
	obterComprasTroco();
	
	}
	
	//Método para obter o que foi comprado
	public void obterComprasTroco(){
				
		 //Frase
        String frase = "O total da compra ficou em R$ "+total+". Informe o valor pago pelo cliente.";
            if(codigo1 != 0){
                frase+= "\n Foram pedidos "+codigo1+" Hambúrguer + Suco de Laranja ";
            }

            if(codigo2 != 0){
                frase+= "\n Foram pedidos "+codigo2+" Sanduíche natural + Suco de Uva ";
            }

            if(codigo3 != 0){
                frase+= "\n Foram pedidos "+codigo3+" Prato do dia  ";
            }

            if(codigo4 != 0){
                frase+= "\n Foram pedidos "+codigo4+" Pizza ";
            }

            if(codigo5 != 0){
                frase+= "\n Foram pedidos "+codigo5+" Lasanha ";
            }

            if(codigo6 != 0){
                frase+= "\n Foram pedidos "+codigo6+" Pão de queijo ";
            }

            if(codigo7 != 0){
                frase+= "\n Foram pedidos "+codigo7+" Bolo ";
            }
            
            valida = true;
		
	do{
		 double troco = Double.parseDouble(JOptionPane.showInputDialog(frase));

	        if(troco < total){
	            JOptionPane.showMessageDialog(null, "Inválido");
	            valida = false;
	        }else{
	            JOptionPane.showMessageDialog(null, "Troco R$ "+(troco - total));
	            valida = true;
	        }
		
	}while(valida == false);
	        
	}
	
	
	

}

