package p.prova;

import java.util.Random;

public class Corregirjava {

	public static void main(String[] args) {
		 imprimirvetor() ;

	}
 public static void imprimirvetor() {
	 String[] nomes = new String[4];
	 nomes[0] = "Bruno";
	 nomes[1] = "Collin";
	 nomes[2] = "Luis";
	 nomes[3] = "Katharine";
	 
	 String[] sobrenomes = new String[4];
	sobrenomes[0] = "Ama Katharine";
	sobrenomes[1] = "não ama";
	sobrenomes[2] = "Descarte";
	sobrenomes[3] = "Tati";
	 
	 
	 //para aleatorio
	 Random aleatorio = new Random();
	                   //limite aqui
	 for(int i =0; i< nomes.length; i++) {
		            //condição                     //limite
		 int numero_aleatorio = aleatorio.nextInt(nomes.length);
		 //+ " " juntar com o sobrenome, e dá um espaço nao ficar pulando
		System.out.print(nomes[numero_aleatorio] + " "); 
		System.out.println(sobrenomes[numero_aleatorio]);
	 }
	 
 }
}
