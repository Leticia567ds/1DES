package agenda;

public class agenda02 {

	 public static void main(String[] args) {
		  //Criando um objeto
		 Contatos c1 = new Contatos();
		 //Preenche os atributos
		 c1.id = 30;
		 c1.nome = "Jaqueline";
		 c1.idade = 20;
		 //Mostra na tela
		 System.out.println(c1.id+"\t"+c1.nome+"\t"+c1.idade);
		 //Renova e limpa os objetos
		 c1 = new Contatos();
		//Mostra na tela
		 System.out.println(c1.id+"\t"+c1.nome+"\t"+c1.idade);
		 //Prenche novamente os dados
		 c1.id = 25;
		 c1.nome = "Léo";
		 c1.idade = 24;
		 //Mostra na tela
		 System.out.println(c1.id+"\t"+c1.nome+"\t"+c1.idade);

	}

}
