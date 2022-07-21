package modelo;

import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Preenchimento {

	public static final int length = 0;
	// Atributos básico
	public Pet pet;
	public String nome;
	public String descricao;
 
	// Atributos para formatar a data
 
	// Métodos
	// Construtor vazio
	public Preenchimento() {
	}

	// Construtor completo
	public Preenchimento(Pet pet, String nome , String descricao) throws ParseException {
		this.pet = pet;
		this.nomeFuncionario = nome;
		this.descricao = descricao;
		 
		 
	}

	// toString (Concatena todos os atributos em uma só String)
	public String tabularString() {
		return pet.paraString() + "  \t  " + nome + "  \t " + descricao + "  \t  ";
			 
	}

}