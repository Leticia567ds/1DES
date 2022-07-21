package p.p;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Matrizaleatorio {
	public static Scanner entrada;
 
	public static void main(String[] args)throws IOException {	
		MatrizAle();
	 
	
	}

	public static void MatrizAle() {
	
	int [][] gerar = new int[5][5];
	 Random rand = new Random() ;
	  for(int i=0; i < 5; i++) {
		for(int j = 0; j < 5; j++)  
			gerar[i][j] = rand.nextInt(100);
			
		}
		 
		System.out.println("gerar[" + i + "][" + j + "]"+gerar[i][j]);
	  
	}
	
	}
	 
	
}

 