package agenda;

public class Contatos {

	 public int id;
	 public String nome;
	 public int idade;
	 public String telefone;
	 //Metodo 1 letra minus
	 //Principal e pode* 
	 //Metodo construtor vazio
	 Contatos(){}
	 //Metodo construtor completo
	 Contatos(int id, String nome, int idade, String telefone){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	 }
	 //Metodo Simples
	 public String contatosTab(){
 //Quando der erro no metodo
		 return id+"\t"+nome+"\t"+idade+"\t"+telefone;
		 
	 }
	 
}
