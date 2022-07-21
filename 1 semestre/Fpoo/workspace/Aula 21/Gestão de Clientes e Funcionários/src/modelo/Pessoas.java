package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoas {
 private String nome;
  private String telefone;
  private Date nascimento;
   

  
  public String getNome() {
	 return this.nome;
  } 
  public void setNome(String nome) {
	  this.nome = nome;
  }
  public String gettelefone() {
		 return this.telefone;
	  } 
	  public void settelefone(String telefone) {
		  this.telefone = telefone;
	  }
	  
	  public Date getNas() {
		  return this.nascimento;
	  }
	  public void setNas(Date nascimento) {
		  this.nascimento= nascimento;
	
		 
	  }
   }

