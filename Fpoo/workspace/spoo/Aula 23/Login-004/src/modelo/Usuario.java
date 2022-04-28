package modelo;

import java.util.ArrayList;

public class Usuario {
	
	private String email;
	private String senha;
	
	public Usuario(String linha) {
		email = linha.split(";")[0];
		senha = linha.split(";")[1];
	}
	
	public boolean validaEmail(String email, ArrayList<Usuario> contas) {
		boolean achou = false;
		for (Usuario usuario : contas) {
			if (this.email.equals(usuario.email)) {
				achou = true;
				break;
			}
		}
		
		return achou;
	}
	
	public boolean validaSenha(String email, String senha, ArrayList<Usuario> contas) {
		boolean validou = false;
		
		for (Usuario usuario : contas) {
			if (this.email.equals(usuario.email) && this.senha.equals(usuario.senha)) {
				validou = true;
				break;
			}
		}
		
		return validou;
	}

}