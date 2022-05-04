package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Pet {

	

	private int id;
	private  String especie;
	private String nome;
	private String raca;
	private float peso;
	private Date nas;
	private String nomeDono;
	private String telefone;
	
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
   public Pet(int id, String especie, String nome, String raca, float peso, String nas, String nomeDono, String telefone)throws  ParseException{
		
		this.id = id;
		this.especie = especie;
		this.nome = nome;
		this.raca = raca;
		this.peso = peso;
		this.nas = sdf.parse(nas);
		this.nomeDono = nomeDono;
		this.telefone = telefone;
		this.sdf = sdf;
	}


public int obterIdade() {
	   return new Date().getYear()- nas.getYear();
   }
   
@Override
public String toString() {
	return id + "  " + especie + "\t" + nome 
			+ "\t" + raca +"\t" + String.format( "%.2f", peso) 
			+ "\t" + obterIdade() + "  "+ nomeDono + "\t" + telefone+ "\n" ;
}
}