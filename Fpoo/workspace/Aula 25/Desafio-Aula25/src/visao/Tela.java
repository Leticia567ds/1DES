package visao;

import java.util.Scanner;

import controle.DAO;
import controle.ProceesPlanilha;
import modelo.Planilha;

public class Tela {
	
	public static void main(String[] args) {
	 
	 ProceesPlanilha.carregar();
	 ProceesPlanilha.saida();
	 System.out.println("Idades calculadas com sucesso");

	}

}
