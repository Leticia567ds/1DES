//O programa deve perguntar ao usuário quantos contatos quer cadastrar
//Em seguida receber os dados cadastrados como entrada
//

package agn001;

 

public class Contato {
      
	public int id;
	 public String nome;
	 public int idade;
	 public String telefone;
	
	 Contato(){}
	 
	 Contato(int id, String nome, int idade, String telefone){
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	 }
	
	 public String contatoTaby(){

		 return id+"\t"+nome+"\t"+idade+"\t"+telefone;
	}

}
