package controle;

import java.util.ArrayList;

import modelo.Funcionario;


public class Process {

	
	public static ArrayList<Funcionario> fun = new ArrayList<>();
	private static DAO d = new DAO();
	
	public static void abrir() {
		fun  = d.ler();
	}
	
	public static void salvar() {
		d.escrever(fun);
	}
	
	public static void carregar() {
		// Limpar a lista
		fun = new ArrayList<>();
		// Preencher com testes
		 
	}
	
}
