package classes;

public class Login {

	//Validar login
	public boolean validarLogin(String nomeUsuario, String senhaUsuario) {
		
		boolean existe = false;
		
		if((nomeUsuario.equals("admin")) && (senhaUsuario.equals("123"))) {
			existe = true;
		}
		
		return existe;
	}
	
	//Retornar o nível
	public int retornarNivel() {
		return 1;
	}
	
}
