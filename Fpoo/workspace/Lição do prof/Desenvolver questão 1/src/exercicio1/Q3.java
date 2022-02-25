package exercicio1;

import java.util.Scanner;

public class Q3 {
	
 public static Scanner entrada;
 
	public static void main(String[] args) {
   entrada = new Scanner(System.in);
   int n,soma,sub;
   
   System.out.println("Digite um número:");
   n = entrada.nextInt();
   
   soma = n + 1;
   sub = n - 1 ;
  
   
   System.out.printf("%d + 1 = %d e %d - 1 = %d", n, soma, n, sub);
   }
   

	}


