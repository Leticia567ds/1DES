package controle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import modelo.Usuario;

public class DAO {
	private BufferedWriter bw;
	private BufferedReader br;
	private String entrada = "C:\\Users\\des\\Desktop\\1DES\\Fpoo\\workspace\\Aula 25\\Login-004\\Dados\\Usuario.csv";
	
	
	public ArrayList<Usuario> abrir() {
		ArrayList<Usuario> linhas = new ArrayList<Usuario>();
		
		Usuario p;
		
		try {
			br = new BufferedReader(new FileReader(entrada));
			
			String l = br.readLine();
			
			while(l != null) {
				p = new Usuario(l);
				linhas.add(p);
				l = br.readLine();
			}
			
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		return linhas;
	}
	
	public boolean validarConta(String email, String senha, ArrayList<Usuario> linhas) {
		Usuario u = new Usuario(email + ";" + senha);
		
		if(u.validaEmail(email, linhas)) {
			if (u.validaSenha(email, senha, linhas)) {
				System.out.println("Acesso permitido");
				return true;
			} else {
				System.out.println("Acesso negado");
				return false;
			}
		} else {
			System.out.println("usuário não encontrado");
			return false;
		}
	}

	
}