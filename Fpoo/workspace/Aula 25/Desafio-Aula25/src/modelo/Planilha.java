package modelo;

import java.util.Date;

import controle.DAO;

public class Planilha {

	private String nome;
	private int ano;
	
	public Planilha (String entrada) {
		nome = (entrada.split(";")[0]);
		ano = Integer.parseInt(entrada.split(";")[1]);
	}
		
	
	public String toString() {
		return nome  + (2022 - ano);
		
	}
}
