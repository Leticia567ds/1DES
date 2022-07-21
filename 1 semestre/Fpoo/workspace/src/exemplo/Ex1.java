package exemplo;

 import java.util.Scanner;

public class Ex1 {
  
	public static void main(String[] args)   {
  Scanner read = new Scanner(System.in); 
	  int opcao=0;  
	  
	  while (opcao != 11) {
	   
		  System.out.println("Escolha uma opção:");
		  System.out.println("1- Programa1\t5-Programa5\t9-Programa9");
		  System.out.println("2-Programa2\t6-Programa6\t10-Programa10");
		  System.out.println("3-Programa3\t7-Programa7\t11 -Programa11-Sair");
		  System.out.println("4-Programa4\t8-Programa8");
		  opcao = read.nextInt();
		  switch (opcao) {
		  case 1:
			for(int i = 10; i <= 200; i++) {
				  System.out.println(i);
			  }  
			break;
		  case 2:
			  for(int i = 200; i > 0; i--) {
				  System.out.println(i);
			  }
			  break;
		  case 3:
			  System.out.println("Digite um valor inteiro:");
			  int valor = read.nextInt();
			 for(int i = 0; i < valor; i++) {
				 System.out.println(i);
			 }
			 break;
			 }
	  
		    }
		 
	  	}
	}
}