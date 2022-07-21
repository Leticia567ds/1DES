package p.pt;

import java.util.Random;

public class PraticarMatriz {

	public static void main(String[] args) {
		 //Declaração da matriz
		int[][] m = new int[5][5];
		
		Random r = new Random();
		//percorrer linha
		for(int l = 0;l < 5;l++) {
			//percorrer coluna
			for(int c = 0;c < 5;c++) {
			m[l][c] = r.nextInt(100);
			//imprimir           tabular
			System.out.print(m[l][c]+"\t");
			}
			System.out.println();
		}
		  
  for(int i = 0;  i < 5;  i++ ) {
	  System.out.println(m[i][4-i]);
  
  }
	}
        
}
