package modelo;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class BuscaAleatório {
  static Random rand = new Random();
  static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)throws IOException {
		System.out.println("Digite quantos números deseja :)");
		int n = scan.nextInt();
     int dados[] = numerosAleatorios(n);
             System.out.println("Digite o número que deseja buscar:");
             int b = scan.nextInt();
             mostrarDados(dados);
              boolean resultado = buscaSimples(dados, b);
            	
             System.out.println("A busca obteve sucesso?"+resultado);
 }
   


	private static boolean buscaSimples(int[] dados, int b) {
		 for(int i = 0; i < dados.length; i++) {
			 if(dados[i] == b)
				 return true;
		return false;
		 }
	}



	private static boolean mostrarDados(int[] dados) {
		for(int i = 0; i < dados.length; i++)
			System.out.println(dados[i]);
				 
		 
		
	}



	private static int[] numerosAleatorios(int n) {
		int[] x = new  int[n];
	
		//so tem um comando não abre o bigode
		for(int i = 0; i < n; i++)
		x[i]= rand.nextInt(1000);	
		return x;
	}

	 
	}
	
	}
