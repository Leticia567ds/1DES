package modelo;

import java.util.Scanner;

public class Vetor {
   public static Scanner scan;
	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 int comprimento = 4;
	 //String[] de texto
	 String[] nomes = new String[comprimento];
	 //numero inteiro[int]
	 //[]mostrar pro sistema que estou trabalhando com vetor
	 int[] idades = new int[comprimento];
	  for(int i = 0; i < comprimento; i++) {
		  //entrada com saida
		  System.out.println("Nome[" + i +"]:");
		  nomes[i] = scan.next();
		  //número
		  System.out.println("idade[" + i + "]:");
		  idades[i]=scan.nextInt();
	  }
	  //sempre começa em 0, por isso não vai 3 certinho, so até dois
	//i++ um em um

	  
	  for(int i = 0; i < comprimento; i++) {
		if(idades[i] < 10) {
			System.out.println(nomes[i]+" Bebe.");
				
			}else if(idades[i] < 20) {
				System.out.println(nomes[i]+ " jovem.");
				
			}else{
				System.out.println(nomes[i]+ " Flor da pele.");
			
		}  
	  }
	  
	}
	

}
