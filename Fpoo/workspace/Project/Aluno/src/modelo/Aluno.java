package modelo;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import modelo.Nota;

public class Aluno {
         
	public int ra;
	public String nome;
	public Date Nascimento;
	public Nota notas[] = new Nota[4];
	 public Aluno() {
		 
	 }
	public Aluno(int ra, String nome, Date Nascimento) {
		this.ra = ra;
		this.nome = nome;
		this.Nascimento = Nascimento;
	
}
 
	@SuppressWarnings("deprecation")
		 
    	public int calcIdade(){
		
    	  java.util.Date data = new java.util.Date();  
    	  if (data.getMonth() == Nascimento.getMonth()) {
  			if (data.getDay() >= Nascimento.getDay()) {
  				return data.getYear() - Nascimento.getYear();
      }  else {
    	  return data.getYear() - Nascimento.getYear() - 1;
      } 
  			}else if (data.getMonth() > Nascimento.getMonth()) {
			return data.getYear() - Nascimento.getYear();
		} else {
			return data.getYear() - Nascimento.getYear() - 1;
		 }   
     
      }
	

	public String obterConceito() {
		boolean aprovado = true;
		for (int i = 0; i < notas.length; i++) {

			if (notas[i].obterMedia() <= 50) {
				aprovado = false;
				break;
			}
		}
		if (aprovado) {
			return "Aluno(a) " + nome + " foi APROVADO!";
		} else {
			return "Aluno(a) " + nome + " foi REPROVADO!";
		}
	}
	public String tabulaString() {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		return nome +"     "+" "+ra+" "+"     "+ df.format(Nascimento)+"          "+"    "+calcIdade();
	}
	
}
