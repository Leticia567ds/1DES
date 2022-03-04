package p.p;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Matrizaleatorio {
	public static Scanner entrada;
	public static void main(String[] args)throws IOException {
		entrada = new Scanner(System.in);
		MatrizAle();
		
	}

 public static void MatrizAle(){
	  
	 Random rand = new Random() ;
	 int [][] gerar = new int[5][5];
	  for(int i=0; i < 5; i++) {
		for(int j = 0; j < 5; j++)  {
			gerar[i][j] = rand.nextInt(100);
			if(gerar[i][j] % 2 == 0) {
			 
				 
			}
	System.out.println("gerar[" + i + "][" + j + "]"+ gerar[i][j]);
	      
	   
		}
		
		
	  }
		 
 }
}
 