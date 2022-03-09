package ex;

import java.util.Scanner;

public class Atvidades {
	public static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		int menu = 0;
		while (menu != 5) {
			System.out.println(
					"1.N�meros pares\n 2.N�meros �mpares\n 3.Encontrar o maior e menor\n 4.Fatorial\n 5.Valor do xerex\n 6.Soma dos pares e �mpares\n 7.Sair\n");
			menu = entrada.nextInt();
			switch (menu) {
			case 1:
				parNumber();
				break;
			case 2:
				impNumber();
				break;
			case 3:
				lerNumb();

				break;
			case 4:
				fatorial();
				break;
			case 5:
				xerox();
				break;
			case 6:
				par�mpa();
				break;
			case 7:
				System.out.println("Bye Bye:)");
				break;

			}
		}
	}

	public static void parNumber() {

		int num1, num2;

		System.out.println("Digite o Primeiro Valor: ");
		num1 = entrada.nextInt();

		System.out.println("Digite o Segundo Valor: ");
		num2 = entrada.nextInt();
		if (num1 % 2 != 0) {
			num1++;
		}

		for (int i = num1; i < num2; i += 2) {

			System.out.println(i);

		}

	}

	public static void impNumber() {
		int num1, num2;

		System.out.println("Digite o Primeiro Valor: ");
		num1 = entrada.nextInt();

		System.out.println("Digite o Segundo Valor: ");
		num2 = entrada.nextInt();
		if (num1 % 2 == 0) {
			num1++;
		}
		for (int i = num1; i < num2; i += 2) {

			System.out.println(i);

		}

	}

	public static void lerNumb() {

		int num1[] = new int[10];
		int or = 0;
		int la = 10;
		for (int i = 0; i < 10; i++) {

			System.out.print("Digite um inteiro Valor at�	 10: ");
			num1[i] = entrada.nextInt();

		}
		for (int i = 0; i < num1.length; i++) {
			if (or < num1[i]) {
				or = num1[i];
			}
			if (la > num1[i]) {
				la = num1[i];
			}
		}
		System.out.println("O maior n�mero: " + or);
		System.out.println("O menor n�mero �:" + la);

	}

	public static void fatorial() {

		int numb1, acum;

		System.out.println("Digite um Valor:");
		numb1 = entrada.nextInt();
		acum = numb1;
		for (int i = 0; i < numb1; i++) {
			acum = acum * (numb1 - i);
			System.out.println(acum);
		}

		System.out.println("O seu n�mero digitado em fatorial �:" + acum);
	}

	public static void xerox() {
		double val;
		double acum = 0;

		System.out.println("Digite o valor do seu xerox:");
		val = entrada.nextDouble();

		for (int i = 1; i <= 200; i++) {
			acum = (double) i * val;

			System.out.printf("%d = %.2f\t", i, acum);

			if (i % 10 == 0) {
				System.out.println();
			}
		}

		System.out.println();
	}

	public static void par�mpa() {
		int usu, usu2;
		int somapr = 0, somaimpar = 0;
		System.out.println("Digite um n�mero:");
		usu = entrada.nextInt();
		System.out.println("Digite outro n�mero:");
		usu2 = entrada.nextInt();
		for (int i = usu; i < usu2; i++) {
			if (i % 2 == 0) {
				somapr+= i;

			}else {
				somaimpar +=i;
				
			}
		}
		System.out.println("Sua soma �:"+somapr);
		System.out.println("Sua soma �:"+somaimpar);
	}
}
