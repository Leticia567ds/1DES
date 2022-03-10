package ex;

import java.util.Scanner;

public class Atividades1 {

	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int menu = 0;
		while (menu != 7) {
			System.out.println(
					"1.Vetor Crescente e Decrescente\n 2.Vetor Decrescente\n 3.Multiplicação de elementos\n 4.Name\n 5.Resolução\n 6.\n 7.\n 8.Sair\n");
			menu = entrada.nextInt();

			switch (menu) {
			case 1:
				gerar();
				break;
			case 2:
				lerVetor();
				break;
			case 3:
				gerarElen();
				break;
			case 4:
				name();
				break;
			case 5:
				Vetor20();
				break;
			case 6:
				break;
			case 7:
				break;
			case 8:
				System.out.println("Bye Bye");
				break;
			default:
				System.out.println("Inválida...");
				break;
			}
		}
	}

	// Faça um programa que lê 10 números inteiros do teclado e armazene em um
	// vetor.
	// Ao final imprima o vetor armazenado nos dois sentidos.
	public static void gerar() {

		int numb[] = new int[10];
		for (int i = 0; i < 10; i++) {

			System.out.print("Digit um número inteiro: ");
			numb[i] = entrada.nextInt();
		}
		System.out.println("Sentido crescente");
		for (int i = 0; i < numb.length; i++) {
			System.out.print(numb[i] + " ");
		}
		System.out.println("-----------------------");
		System.out.print("Sentido em ordem inversa = ");
		for (int i = numb.length - 1; i >= 0; i--) {
			System.out.print(numb[i] + " ");
		}
		System.out.println("\n");
	}

	public static void lerVetor() {

		int[] numb = new int[10];
		for (int i = 0; i < numb.length; i++) {
			System.out.println("Digite um número inteiro:");
			numb[i] = entrada.nextInt();
			System.out.println("");
		}

		System.out.println("--\nEm ordem  inversa-- ");
		for (int i = numb.length - 1; i >= 0; i--) {

			System.out.print(numb[i] + " ");

		}
		System.out.println("\n");

	}

	public static void gerarElen() {
		// As variaveis dos dois vetors
		int[] a1 = new int[10];
		double[] a2 = new double[10];
		// Criar o vetor para armazenar 10 elementos
		for (int i = 0; i < a1.length; i++) {
			do {
				System.out.println("Digite um número inteiro:");
				a1[i] = entrada.nextInt();

				if (a1[i] <= 0) {
					System.out.println("Número inteiros e positivos man");
				}
				// explicação no caderno....
			} while (a1[i] <= 0);

		}
		for (int ii = 0; ii < a2.length; ii++) {
			if (ii % 2 == 0) {
				a2[ii] = (double) a1[ii] / 2;

			} else {
				a2[ii] = (double) a1[ii] * 3;
			}

		}
		System.out.println("Números a ser calculado: ");
		for (int li = 0; li < a1.length; li++) {
			System.out.print(a1[li] + " ");
		}
		System.out.println("\nElementos índice  par divide e ímpa multiplica: ");
		for (int ti = 0; ti < a2.length; ti++) {
			System.out.print(a2[ti] + " ");
		}
		System.out.println("\n");

	}

	public static void name() {
		String[] C = new String[10];
		for (int i = 0; i < C.length; i++) {
			System.out.println("Digite o nome de 10 pessoas");
			C[i] = entrada.next();
		}
		System.out.println("--------------------------------------");
		System.out.println("Digite o nome que você quer buscar:");
		String name = entrada.next();
		boolean achou = false;
		
		for (int i = 0; i < C.length; i++) {
			if (C[i].equals(name)) {
				System.out.println("Achei!");
				achou = true;
			}
	}
		if(!achou) {
			System.out.println("Não achei!");
		}
		System.out.println("\n");
 }
	public static void Vetor20() {
		int[]v1 = new int[20];
		int[]v2 = new int[20];	
		int[]v3 = new int[20];	
		int[]v4 = new int[20];	
		int[]v5 = new int[20];	
		for (int i = 0; i < v1.length; i++) {
			System.out.println("Digite um valor: ");
			v1[i] = entrada.nextInt();
		}
		
			System.out.println("\nVetor 2: ");
		for (int i = 0; i < v2.length; i++) {
			System.out.println("Digite outro valor:*.* ");
			v2[i] = entrada.nextInt();
		}
		 
		for(int i = 0;i <1;i++) {
			v3[i] = v1[i] - v2[i];
		 System.out.println("Subtração é = "+v3[i]);
		}
		 
		for(int i = 0; i < 1; i++) {
			v4[i] = v1[i] + v2[i];
			 System.out.println("A soma é = "+v4[i]);
		}
		 
		for(int i = 0; i < 1; i++) {
			v5[i] = v1[i] * v2[i];
			 System.out.println("A multiplicação  é = "+v5[i]);
		}
		System.out.println("\n");
		
		
		
	}
}
