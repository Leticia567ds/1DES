package ex2;

import java.util.Scanner;

public class João1 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		gerar();

	}

	public static void gerar() {
		int[] n1 = new int[10];
		int[] n2 = new int[10];

		for (int i = 0; i < n1.length; i++) {
			System.out.println("Digite um valor inteiro: ");
			n1[i] = scan.nextInt();
		}

		for (int i = n1.length - 1; i >= 0; i--) {
			n2[9 - i] = n1[i];
		}

		System.out.println("\nSentido normal");
		for (int i = 0; i < n1.length; i++) {
			System.out.print(n1[i] + " ");
		}

		System.out.println("\nSentido em ordem inversa");
		for (int i = n2.length - 1; i >= 0; i--) {
			System.out.print(n2[i] + " ");
		}
		System.out.println("\n");
	}
}
