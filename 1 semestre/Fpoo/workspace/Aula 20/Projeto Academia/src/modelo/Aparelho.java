package modelo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aparelho {
  public String nome;
  public String tipoExercicio;
  public String grupoMuscular;
  public Date dataquisicao;
  public double valorAquisicao;
  //Tratando
  private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
  //Costrutor vazio
  public Aparelho(){
	  
  }
//Costrutor cheio
  public Aparelho(String nome, String tipoExercicio,String grupoMuscular, String dataquisicao,double valorAquisicao )throws ParseException {
	  
	  this.nome = nome;
	  this.tipoExercicio = tipoExercicio ;
	  this.grupoMuscular = grupoMuscular;
	  this.dataquisicao = df.parse(dataquisicao);
	  this.valorAquisicao = valorAquisicao;
  }

 //Calcular o tempo de uso
public int tempoUso() {
	Date hoje = new Date();
	return hoje.getYear() - dataquisicao.getYear();
}
public double depreciacao() {
	
	return  valorAquisicao/10* tempoUso();
}
public double valorDepreciacao() {
	
	return  valorAquisicao - depreciacao() ;
  }
@Override
public String toString() {
	return "Aparelho [nome=" + nome + ", tipoExercicio=" + tipoExercicio + ", grupoMuscular=" + grupoMuscular
			+ ", dataquisicao=" + dataquisicao + ", valorAquisicao=" + valorAquisicao + "]";
}
}