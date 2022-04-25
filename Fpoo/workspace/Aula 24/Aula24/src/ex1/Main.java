package ex1;
                           //Classificação

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import ex1.Arquivo;

public class Main {

	static BufferedReader br;
	private static Arquivo arq = new Arquivo();

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		int opcao = 0;
		do {
			System.out.println("Escolha uma opção:");
			System.out.println("1 - Soma");
			System.out.println("2 - multiplicação");
			System.out.println("3 - subtração");
			System.out.println("4 - Divisão");
			System.out.println("5 - Sair");
			opcao = input.nextInt();
			input.nextLine();
			switch (opcao) {
			case 1:
				soma();
				break;
			case 2:
				mult();
				break;
			case 3:
				sub();
				break;
			case 4:
				div();
				break;
			case 5:
				System.out.println("Bye*-*");
				break;
			}
		} while (opcao != 0);

	}

	public static void soma() {
		ArrayList<String> ler = arq.ler("numero");
		String saida = "";

		for (String l : ler) {
			String[] temp = l.split(";");

			saida = saida + (Integer.parseInt(temp[0]) + Integer.parseInt(temp[1])) + "\r\n";
			 
		}
        
		arq.Escrever(saida, "Saida", false);
		System.out.println("Somado com sucesso");
		System.out.println(saida);
	}

	public static void mult() {
		ArrayList<String> ler = arq.ler("numero");
		String saida = "";

		for (String l : ler) {
			String[] temp = l.split(";");

			saida = saida + (Integer.parseInt(temp[0]) * Integer.parseInt(temp[1])) + "\r\n";
            
		}

		arq.Escrever(saida, "Saida", false);
		System.out.println("multiplicado com sucesso");
		System.out.println(saida);
	}

	public static void sub() {
		ArrayList<String> ler = arq.ler("numero");
		String saida = "";

		for (String l : ler) {
			String[] temp = l.split(";");

			saida = saida + (Integer.parseInt(temp[0]) - Integer.parseInt(temp[1])) + "\r\n";
			 
		}

		arq.Escrever(saida, "Saida", false);
		System.out.println("subtraido com sucesso");
		System.out.println(saida);
	}

	public static void div() {
		ArrayList<String> ler = arq.ler("numero");
		String saida = "";

		for (String l : ler) {
			String[] temp = l.split(";");

			saida = saida + (Integer.parseInt(temp[0]) / Integer.parseInt(temp[1])) + "\r\n";
		 
		}

		arq.Escrever(saida, "Saida", false);
		System.out.println("Dividido com sucesso");
		System.out.println(saida);
	}
}
