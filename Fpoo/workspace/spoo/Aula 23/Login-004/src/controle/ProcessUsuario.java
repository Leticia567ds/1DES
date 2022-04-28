 package controle;

import java.util.ArrayList;

import modelo.Usuario;

public class ProcessUsuario {
	private static ArrayList<Usuario> linhas = new ArrayList<Usuario>();
	private static DAO dao = new DAO(); 
	public static void carregar() {
		linhas = dao.abrir();
	}
	
	public static void saida(String email, String senha) {
		dao.validarConta(email, senha, linhas);
	}
}