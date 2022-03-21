import java.util.Scanner;

public class Lista {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
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
				break;
			case 7:
				break;
			case 8:
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
		int[][] c = new int[3][3];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {

				System.out.println("\nDigite um número:");
				c[i][j] = scan.nextInt();

			}
		}
		System.out.println("Elementos:");
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				System.out.printf("%5d  ", c[i][j]);
			}
			System.out.println();
		}

		int linhas = c.length;
		int colunas = c[0].length;
		int transposta[][] = new int[colunas][linhas];

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				transposta[j][i] = c[i][j];
			}
		}

		System.out.println("Elementos da transposta:");
		for (int i = 0; i < transposta.length; i++) {
			for (int j = 0; j < transposta[0].length; j++) {
				System.out.printf("%5d  ", transposta[i][j]);
			}
			System.out.println();
		}
	}
public static void ex4() {
		
		Scanner scan = new Scanner(System.in);
	     
	    int[][]d = new int[3][3];
	    int somaDiagonal = 0;

	    for(int i = 0; i < d.length; i++){ 
	      for(int j = 0; j < d[0].length; j++){
	        System.out.print("Informe o valor para a linha " + i 
	           + " e coluna " + j + ": ");
	        d[i][j] = Integer.parseInt(scan.nextLine());       
	      }       
	    }
	     
	    System.out.println();

	    for(int i = 0; i < d.length; i++){
	  
	      for(int j = 0; j < d[0].length; j++){ 
	        System.out.printf("%5d ", d[i][j]);
	      }
	      System.out.println();
	    }
	     
	    for(int i = 0; i < d.length; i++){
	      for(int j = 0; j < d[0].length; j++){
	        if(i == j){
	          somaDiagonal = somaDiagonal + d[i][j];
	        }
	      }
	    }

	    System.out.println("\nA soma dos elementos acima da diagonal principal é: " 
	      + somaDiagonal);
	  }
public static void ex5() {
	
	Scanner scan = new Scanner(System.in);
     
    int[][]e = new int[3][3];
    int somaDiagonal = 0;

    for(int i = 0; i < e.length; i++){ 
      for(int j = 0; j < e[0].length; j++){
        System.out.print("Informe o valor para a linha " + i 
           + " e coluna " + j + ": ");
       e[i][j] = Integer.parseInt(scan.nextLine());       
      }       
    }
     
    System.out.println();

    for(int i = 0; i <e.length; i++){
  
      for(int j = 0; j < e[0].length; j++){ 
        System.out.printf("%5d ", e[i][j]);
      }
      System.out.println();
    }
     
    for(int i = 0; i < e.length; i++){
      for(int j = 0; j < e[0].length; j++){
        if(i > j){
          somaDiagonal = somaDiagonal + e[i][j];
        }
      }
    }

    System.out.println("\nA soma dos elementos acima da diagonal principal é: " 
      + somaDiagonal);
}
}
