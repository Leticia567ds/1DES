package agenda;

public class agenda04 {

	 public static void main(String[] args) {
		  
		 Contatos c1 = new Contatos();
		 //Cria e preenche o primeiro objeto
		 c1.id = 30;
		 c1.nome = "Jaqueline";
		 c1.idade = 20;
		 c1.telefone ="(19)99245-9090";
		 //Preenche o primeiro objeto
		  Contatos c2 = new Contatos();
		 c2.id = 25;
		 c2.nome = "Léo";
		 c2.idade = 24;
		 c2.telefone = "(19)99245-7090" ;
		  //Mostrando  os objetos na tela
		 System.out.println(c1.contatosTab() );
		 System.out.println(c2.contatosTab() );

	}

}
