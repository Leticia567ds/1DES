package modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

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
	
	//Costrutor só com id
	public Pet(String ) {
		this.id = id; 
	}
	//Costrutor completo
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
   
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEspecie() {
	return especie;
}
public void setEspecie(String especie) {
	this.especie = especie;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getRaca() {
	return raca;
}
public void setRaca(String raca) {
	this.raca = raca;
}
public String getPeso(String s) {
	return String.format("%.2f",peso);
}

public String getid(String s) {
	return String.format("%d",id);
}

public void setPeso(float peso) {
	this.peso = peso;
}
public String getNas(String s) {
	return sdf.format(nas);
}
public void setNas(Date nas) {
	this.nas = nas;
}
public String getNomeDono() {
	return nomeDono;
}
public void setNomeDono(String nomeDono) {
	this.nomeDono = nomeDono;
}
public String getTelefone() {
	return telefone;
}
public void setTelefone(String telefone) {
	this.telefone = telefone;
}


@Override
public int hashCode() {
	return Objects.hash(id);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pet other = (Pet) obj;
	return id == other.id;
}

public int obterIdade() {
	   return new Date().getYear()- nas.getYear();
   }
   
@Override
public String toString() {
	return  id + "\t" + especie + "\t" + nome + "\t" + raca + "\t" + String.format("%.2f", peso) + " "
			+ obterIdade() + "\t" + nomeDono + "\t" + telefone + "\n";
}
}