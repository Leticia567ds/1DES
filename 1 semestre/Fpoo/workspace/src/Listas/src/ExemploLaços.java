
import java.util.Scanner;
public class ExemploLaços {

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
			  System.out.println("Digite um número inteiro:");
			  int valor = read.nextInt();
	        for(int i = 0; i < valor; i++) {
	        	System.out.println(i);
	        }
	        break;
		  case 4:
			  System.out.println("Digite um valor inteiro");
			  int d1 = read.nextInt();
			  System.out.println("Digite um outro valor");
			  int d2 = read.nextInt();
			  for(int i = d1; i < d2; i++) {
			  System.out.println(i);
			  }
			  break;
		  case 5:
			  System.out.println("Digite somente números par:");
			  int n1 = read.nextInt();
			  System.out.println("Digite um outro número par:");
			  int n2 = read.nextInt();
			  for(int i = n1; i < n2; i++) {
				  
			  if(i % 2 == 0) {
				  System.out.println(i);
			  }
			  }
			  break;
		  case 6:
			  int i1 = 0, i2= 0;
			  while(i2<=100) {
				  i1 +=i2;
				  i2++;
			  }System.out.println(i1);
			  break;
		  case 7:
			  System.out.println("Digite um valor:");
			  int v1 = read.nextInt();
			  System.out.println("Digite um outro valor");
			  int v2 = read.nextInt();
			  int soma = 0;
			  for(int i = v1; i <= v2; i++) {
			  soma +=i;
			  
		    }System.out.println(soma);
		     break;
		  case 8:
		 System.out.println("Digite um número par");
		 int p1 = read.nextInt();
		 System.out.println("Digite um outro número tem que ser par");
		 int p2 = read.nextInt();
		 int somar = 0;
		 for(int i = p1; i < p2; i++) { 
			  if(i % 2 == 0)
			{ somar +=i;
			  } 
			  }System.out.println(somar);
			  break;
		  case 9:
			   
	  	}
	}

	}
}
