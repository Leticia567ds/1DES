package project;

import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Lista {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args)throws IOException {
		
		int menu = 0;
		while (menu != 9) {
			System.out.println(
					"1-Matriz 5x5 localização\n2-Matriz 5x5 busca\n3-Matriz 3x3 transposta\n4-Matriz 3x3 soma diagnal principal acima\n5-Matriz 3x3 soma diagonla principal abaixo\n6-Bingo\n7-Notas Alunos\n8-Menu de opções\n9-Sair");
			menu = scan.nextInt();

			switch (menu) {
			case 1:
				ex1();
				break;
			case 2:
				ex2();
				break;
			case 3:
				ex3();
				break;
			case 4:
				ex4();
				break;
			case 5:
				ex5();
				break;
			case 6:
				ex6();
				break;
			case 7:
				break;
			case 8:
				int num = 0;
				
				while(num != 5) {
					
					System.out.println("(1) somar as duas matrizes.\r\n"
							+ "(2) subtrair a primeira matriz da segunda.\r\n"
							+ "(3) adicionar uma constante as duas matrizes.\r\n"
							+ "(4) imprimir as matrizes.");
					num = scan.nextInt();
					switch(num) {
					case 1:
						System.out.println("Digite 1 para confirmar");
						int soma = scan.nextInt();
						ex8(soma);
						break;
					case 2:
						System.out.println("Digite 2 para confirmar");
						int sub = scan.nextInt();
						sub(sub);
						break;
					case 3: break;
					case 4: break;
					}
					}
				break;
			case 9:
				break;
			}
		}
	}

	public static void ex1() {

		int[][] a = new int[5][5];
		int maior = 0;
		int l = 0;
		int c = 0;

		for (int l1 = 0; l1 < a.length; l1++) {
			for (int col = 0; col < a[l1].length; col++) {
				System.out.println("Digite um número:");
				a[l1][col] = scan.nextInt();

			}
		}

		System.out.print("coluna->\t\t0\t\t1\t\t2\t\t3\t\t4\nlinha|\n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(i + "     ||\t");
			for (int j = 0; j < a.length; j++) {
				System.out.print("\t" + a[i][j] + "\t");
			}
			System.out.println();
		}

		for (int lin = 0; lin < a.length; lin++) {
			for (int col = 0; col < a[lin].length; col++) {
				if (a[lin][col] > maior) {
					maior = a[lin][col];
					l = lin;
					c = col;
				}
			}
		}
		System.out.println("");

		System.out.printf("O maior valor está na linha: %d , coluna: %d\n", l, c);

		System.out.println("");

	}

	public static void ex2() {

		int[][] b = new int[5][5];

		int X = 0;
		int lin = 0;
		int col = 0;
		char veri = 'n';
		for (int i = 0; i < b.length; i++)
			for (int j = 0; j < b[i].length; j++) {
				System.out.println("Digite um número:");
				b[i][j] = scan.nextInt();

			}
		System.out.print("coluna->\t0\t\t1\t\t2\t\t3\t\t4\nlinha|\n");
		for (int i = 0; i < b.length; i++) {
			System.out.print(i + "    ||\t");
			for (int j = 0; j < b.length; j++) {
				System.out.print("\t" + b[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("---------------------------------------");
		System.out.println("Digite o número que deseja buscar: ");
		X = scan.nextInt();
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (b[i][j] == X) {
					lin = i;
					col = j;
					veri = 's';
				}
			}
		}
		if (veri == 's') {
			System.out.printf("Numero %d encontrado na linha %d e  %d coluna", X, lin, col);
			System.out.println("\n----------------------------------------------------");
		} else {
			System.out.println("Número não encontrado");
		}

		System.out.println("");
	}

	public static void ex3() {
		//Criando a matriz
		 int[][]c = new int[3][3];
		 for(int i = 0; i < c.length; i++) 
			 for(int j = 0; j < c.length; j++) {
				 System.out.println("Digite um número:");
				 c[i][j] = scan.nextInt();
				}
		 
		 //Elementos...
		 System.out.println("--Elementos---");
		 for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				System.out.printf("%5d ",c[i][j]);
				
			}
			System.out.println("");
		}
		 int linha = c.length;
		 int coluna = c.length;
		int transposta[][] = new int[linha][coluna]	;
		for (int i = 0; i < transposta.length; i++) {
			for (int j = 0; j < transposta.length; j++) {
				transposta[i][j] = c[j][i];
			}
		}
		//inverter.
		System.out.println("  Elementos da traspostas ");
		for (int i = 0; i < transposta.length; i++) {
			for (int j = 0; j < transposta.length; j++) {
				System.out.printf(" %5d",transposta[i][j]);
			}
			System.out.println("");
		}
			}
	
public static void ex4() {
		
		Scanner scan = new Scanner(System.in);
	     
	    int[][]d = new int[3][3];
	    int somaDiagonalAcima = 0;

	    for(int i = 0; i < d.length; i++){ 
	      for(int j = 0; j < d[0].length; j++){
	        System.out.print("Informe: ");
	        d[i][j] = scan.nextInt();       
	      }       
	    }
	    System.out.println(" Elementos: ");
	    for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {
				System.out.printf(" %5d",d[i][j]);
				
				}
			System.out.println("");
			}
	     System.out.println();
	 //Escrever os elemntos acima da diagonal principal.
	     System.out.println("Elementos acima da diagonal principal");
	     for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {
				if(j> i) {
					System.out.println("["+d[i][j]+"]");
					 
				} 
				  
			}
			
		}
	     for (int i = 0; i < d.length; i++) {
				for (int j = 0; j < d.length; j++) {
					if(j>i) {
						somaDiagonalAcima = somaDiagonalAcima + d[i][j];
					}
					
					}
				}
	    System.out.println("A soma diagonal:"+somaDiagonalAcima) ;
	  }
public static void ex5() {
	
	Scanner scan = new Scanner(System.in);
    
    int[][]e = new int[3][3];
    int somaDiagonalAcima = 0;

    for(int i = 0; i < e.length; i++){ 
      for(int j = 0; j < e[0].length; j++){
        System.out.print("Informe: ");
        e[i][j] = scan.nextInt();       
      }       
    }
    System.out.println(" Elementos: ");
    for (int i = 0; i < e.length; i++) {
		for (int j = 0; j < e.length; j++) {
			System.out.printf(" %5d",e[i][j]);
			
			}
		System.out.println("");
		}
     System.out.println();
 //Escrever os elemntos acima da diagonal principal.
     System.out.println("Elementos acima da diagonal principal");
     for (int i = 0; i < e.length; i++) {
		for (int j = 0; j < e.length; j++) {
			if(j<i) {
				System.out.println("["+e[i][j]+"]");
				 
			} 
			  
		}
		
	}
     for (int i = 0; i < e.length; i++) {
			for (int j = 0; j < e.length; j++) {
				if(j<i) {
					somaDiagonalAcima = somaDiagonalAcima + e[i][j];
				}
				
				}
			}
    System.out.println("A soma diagonal:"+somaDiagonalAcima) ;
  }
public static void ex6() {
	 
	int[][]mega = new int[5][5];
	Random r = new Random();
	for(int x=0; x < 5; x++) {
	    for(int y=0; y < 5; y++) {
	        int n = r.nextInt(100) + 1;
	        int z = 0;
	        while(z < 5){
	            if(mega[x][z] == n){
	                n = r.nextInt(100) + 1;    
	                z = 0;
	            }
	            z++;
	        }
	        mega[x][y] = n;
	    }   
	}
	System.out.println(" Tabela de Bingo");
	for(int x=0; x<5; x++) {
	    for(int y=0; y<5; y++) {
	    	
	        System.out.print(mega[x][y]+" \t ");
	    }
	    System.out.println();
	}
}
public static void ex8(int soma) {
	float[][] mat1 = new float[2][2];
	float[][] mat2 = new float[2][2];
	
	for (int i = 0; i < mat1.length; i++) {
		for (int j = 0; j < mat1.length; j++) {
			System.out.println("Digite o valor para Matriz-1");
			mat1[i][j] = scan.nextFloat();
			 
		}
	}
	for (int i = 0; i < mat2.length; i++) {
		for (int j = 0; j < mat2.length; j++) {
			System.out.println("Digite o valor para Matriz-2");
			mat1[i][j] = scan.nextFloat();
	 
		}
	}
      
	float[][] soma1 = new float[mat1.length][mat1.length];
	for (int i = 0; i < soma1.length; i++) {
		for (int j = 0; j < soma1.length; j++) {
			soma1[i][j] = mat1[i][j]+mat2[i][j];
			System.out.println(soma1[i][j]+ " ");
		}
		System.out.println();
	}
	 
 
}
public static void sub(int sub) {
float[][] mat1 = new float[2][2];
float[][] mat2 = new float[2][2];
	
	for (int i = 0; i < mat1.length; i++) {
		for (int j = 0; j < mat1.length; j++) {
			System.out.println("Digite o valor para Matriz-1");
			mat1[i][j] = scan.nextFloat();
			 
		}
	}
	for (int i = 0; i < mat2.length; i++) {
		for (int j = 0; j < mat2.length; j++) {
			System.out.println("Digite o valor para Matriz-2");
			mat1[i][j] = scan.nextFloat();
	 
		}
	}
      
	float[][] sub1 = new float[mat1.length][mat2.length];
	for (int i = 0; i < sub1.length; i++) {
		for (int j = 0; j < sub1.length; j++) {
			sub1[i][j] = mat1[i][j]-mat2[i][j];
			System.out.println(sub1[i][j]+ " ");
		}
	
}
}
}