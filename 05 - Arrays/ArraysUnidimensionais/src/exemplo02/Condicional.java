package exemplo02;

public class Condicional {

	public static void main(String[] args) {
		
		//Array de inteiros
		int[] idades = {5, 12, 18, 7, 23, 30, 40, 6};
		
		//Verificar se o candidato pode tirar a CNH
		for(int idade : idades){
			
			//Condicional Simples
			/*if (idade >= 18) {
				System.out.println(idaed+" está aprovado");				
			}else{
				System.out.println(idade+" está reprovado");
			}*/
			
			//Operador ternário
			System.out.println(idade+" | "+(idade >=18 ? "Aprovado" : "Reprovado"));
			
		}
		
	}

}
