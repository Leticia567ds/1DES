package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Pessoas {
	 
  private int matricula;   
  private double comissao;
  public Funcionario() {
	  
  }
  public Funcionario(int matricula, double comissao,String nome,String telefone,Date nascimento) {
	this.matricula = matricula;
	this.comissao = comissao;
    this.setNome(nome);
	this.settelefone(telefone);
	this.setNas(nascimento);
}
    public double getComissao() {
	return comissao;
}
public void setComissao(double comissao) {
	this.comissao = comissao;
}
 public double calcComissao(double valor) {
	return valor * comissao/100;
}
	public int getMatricula() {
    	return this.matricula;
    }
    public void setMatricula(int matricula) {
    	this.matricula = matricula;
    }
   
@Override
public String toString() {
	return "Funcionario: \nMatricula = " + matricula + " \nComissao = " + comissao + " \nNome = " + getNome()
			+ " \nTelefone = " + gettelefone() + " \nNascimento = " + new SimpleDateFormat("dd/MM/yyyy").format(getNas());
}
 
 
}
