package matriz;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class excMatriz {
    public static Scanner entrada;
	public static void main(String[] args)throws IOException {
	 entrada = new Scanner(System.in);
	 Scanner scan = new Scanner(System.in);
		int menu = 0;
		while(menu != 3) {
			System.out.println("1.Preencher vetor 27\n2.Gerar matriz[3][9]\n3.Gerar matriz[3][3][3]\n4.Sair");
			menu = scan.nextInt();
			switch(menu) {
			case 1: 
				System.out.println("--Aqui você verá 27 posições--:)");
				gerVetor();
				break;
			case 2:
					
				System.out.println("Aqui você verá Matriz[3][9]:)");
				Matriz();
				break;
			case 3:
				
				System.out.println("Aqui você verá Matriz[3][3][3]*-* ");
				 procesarMat();
				break ;
			case 4:
				System.out.println("Bye.-.");
				break;
			 	default:
			 		System.out.println("Ah cara. Não faça isso!!");
		
			}
		}
	}
  public static void gerVetor() {
	  Random rand = new Random() ;
	  int[] gerar = new int[27];
	  for(int i=0; i < 27; i++) {
		 gerar[i] = rand.nextInt(100);
		System.out.println("gerar[" + i + "]" +gerar[i]);
	  }
	  
  }
  public static void Matriz() {
	  Random rand = new Random() ;
	  int [][] gerar = new int[3][9];
	  for(int i=0; i < 3; i++) 
		for(int j = 0; j < 9; j++)  {
			gerar[i][j] = rand.nextInt(100);
	  
		 System.out.println("gerar[" + i + "][" + j + "]"+ gerar[i][j]);
		}
  }
  public static void procesarMat() {
	  Random rand = new Random() ;
	  int [][][] gerar = new int[3][3][3];
	  for(int i=0; i < 3; i++) 
		for(int j = 0; j < 3; j++)  
		for (int x = 0; x < 3; x++)	{
			gerar[i][j][x] = rand.nextInt(100);
			System.out.println("gerar[" + i + "][" + j + "]["+ x +"]"+gerar[i][j][x]);
			}  
		
  }
	}