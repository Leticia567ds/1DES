package controle;

import java.util.ArrayList;

import modelo.Planilha;

public class ProcessPlanilha1 {
	public static ArrayList<Planilha> linhas = new ArrayList<>();
	private static DAO dao = new DAO();
	 public static void carregar() {
		 linhas = dao.abrir();
	 }
	 public static void saida() {
		  dao.salvar(linhas);
		
	  
	  }
}
