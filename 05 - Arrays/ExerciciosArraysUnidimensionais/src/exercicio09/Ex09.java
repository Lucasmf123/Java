package exercicio09;

import javax.swing.JOptionPane;

public class Ex09 {

	public static void main(String[] args) {
		
		//Vetores
		String[] nomes = new String[20];
		double[] valor = new double[20];
		int[] quantidade = new int[20];
		int indice = 0;
		String texto = "";
		int indiceLivre;
		String nome = "";
		String excluir = "";
		int contador = 0;
		
		//Obter Dados
		Object[] opcoes = {"Cadastrar", "Listar", "Alterar", "Excluir", "Sair"};
		Object[] opcoes2 = {"Listar", "Alterar", "Excluir", "Sair"};
		
		//Menu
		Object escolha = JOptionPane.showInputDialog(null, "Escolha sua opção", "Cadastro de produtos", JOptionPane.PLAIN_MESSAGE, null, opcoes,"");

		//Laço
		while(!escolha.equals("Sair")){
			indiceLivre = 0;
			
			//Ações
			switch (escolha.toString()) {
				
			//Cadastro
				case "Cadastrar":
					
					for(int ind = 0; ind < 20; ind++){
					if(nomes[ind] == null){
						indiceLivre = ind;
						break;
					}
					}
						
					nomes[indiceLivre] = JOptionPane.showInputDialog("Informe o nome do Produto");
					valor[indiceLivre] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
					quantidade[indiceLivre] = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos em estoque"));
					
				break;
				
			//Listar
				case "Listar":
					texto = "Produtos cadastrados:\n";
					
					for(int i = 0; i < 20; i++){
						if(nomes[i] != null){
						texto += "\nNome: "+nomes[i]+". R$"+valor[i]+" Estoque: "+quantidade[i];
					}
						
				}
					JOptionPane.showMessageDialog(null, texto);
									
				break;

			//Alterar
				case "Alterar":
					
					nome = JOptionPane.showInputDialog("Digite o nome do produto que deseja alterar.");
					
					for(int i3 = 0; i3 < 20; i3++){
						if(nome.equals(nomes[i3])){
							
							nomes[i3] = JOptionPane.showInputDialog("Informe o nome do Produto");
							valor[i3] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto"));
							quantidade[i3] = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos em estoque"));
							
						}else if(nome.equals(null)) {
							JOptionPane.showMessageDialog(null, "Produto não encontrado");
						}
						
						break;
						
						
					}
					
				
				break;
				
			//Excluir	
				case "Excluir":
				
					excluir = JOptionPane.showInputDialog("Coloque o nome do produto que você que excluir");
					
					for(int i4 = 0; i4 < 20; i4++){
						
						if(excluir.equals(nomes[i4])){
							nomes[i4] = null;
							valor[i4] = 0;
							quantidade[i4] = 0;
						
						}else if(excluir.equals("null")){
							JOptionPane.showMessageDialog(null, "Produto não encontrado");
						}
						
					}
					
					break;

				
				}

			
			//Menu
			escolha = JOptionPane.showInputDialog(null, "Escolha sua opção", "Cadastro de produtos", JOptionPane.PLAIN_MESSAGE, null, opcoes,"");

			
			
			for(int i5 = 0; i5 < 20; i5++){
				
				System.out.println(nomes[i5]);
				if(nomes[i5] != null){
					contador++;
				}
				
			}
				
			if(contador == 20){
					escolha = JOptionPane.showInputDialog(null,"Escolha sua opção","Cadastro de produtos",JOptionPane.PLAIN_MESSAGE,null,opcoes2,"");
					
				}else{
					escolha = JOptionPane.showInputDialog(null,"Escolha sua opção","Cadastro de produtos",JOptionPane.PLAIN_MESSAGE,null,opcoes2,"");
				}
				
			
			
		}
		
		
		
	}

}
