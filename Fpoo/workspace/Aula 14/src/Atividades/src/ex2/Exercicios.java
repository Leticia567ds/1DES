package ex2;

import java.util.Scanner;

public class Exercicios {
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		lerVetor();
		gerar();
		gerarElen();

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
		int par, imp;
		int[] a1 = new int[10];
		for (int i = 0; i < a1.length; i++) {
			System.out.println("Digite um número inteiro:");
			numb[i] = entrada.nextInt();
			System.out.println("");
			for (int i = 0; i < a1; i++) {
               if(i%2==0) {
            	   par = i/2;
            	   imp = i*3;
               }
               System.out.println(par,imp+"");
			}
			
		}

	}
}
